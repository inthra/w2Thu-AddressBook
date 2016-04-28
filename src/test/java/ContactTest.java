import org.junit.*;
import static org.junit.Assert.*;

public class ContactTest {

  @Rule
    public ClearRule clearRule = new ClearRule();

  @Test
  public void Contact_instantiatesCorrectly_true() {
    Contact myContact = new Contact("Nick", "Lyman");
    assertEquals(true, myContact instanceof Contact);
  }

  @Test
  public void Contact_instantiatesWith_FirstName_String() {
    Contact myContact = new Contact("Nick", "Lyman");
    assertEquals("Nick", myContact.getFirstName());
  }

  @Test
  public void all_ContactInArray_returnsAllContact_true() {
    Contact firstContact = new Contact("Nick", "Lyman");
    Contact secondContact = new Contact("In", "Out");
    assertTrue(Contact.all().contains(firstContact));
    assertTrue(Contact.all().contains(secondContact));
  }

  @Test
  public void clear_emptiesAllContactsFromArrayList_0() {
    Contact myContact = new Contact("Nick", "Lyman");
    Contact.clear();
    assertEquals(Contact.all().size(), 0);
  }

  @Test
  public void getId_contactsInstantiateWithAnID_1() {
    Contact myContact = new Contact("Nick", "Lyman");
    assertEquals(1, myContact.getId());
  }

  @Test
  public void find_returnsContactWithSameId_secondContact() {
    Contact firstContact = new Contact("Nick", "Lyman");
    Contact secondContact = new Contact("In", "Out");
    assertEquals(Contact.find(secondContact.getId()), secondContact);
  }

  @Test
  public void find_returnsNullWhenNoContactFound_null() {
    assertTrue(Contact.find(999) == null);
  }

  @Test
  public void getPhoneNumbers_initiallyReturnsEmptyList_ArrayList() {
    Contact testContact = new Contact("Nick", "Lyman");
    assertEquals(0, testContact.getPhoneNumbers().size());
  }

  @Test
  public void addPhoneNumber_addsNumberToList_true() {
    Contact testContact = new Contact("Nick", "Lyman");
    Phone testPhone = new Phone("333-333-3333");
    testContact.addPhoneNumber(testPhone);
    assertTrue(testContact.getPhoneNumbers().contains(testPhone));
  }
}
