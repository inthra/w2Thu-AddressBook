import org.junit.*;
import static org.junit.Assert.*;

public class PhoneTest {

  @Test
  public void Phone_instantiateCorrectly_true() {
    Phone myPhone = new Phone("555-555-5555");
    assertEquals(true, myPhone instanceof Phone);
  }

  @Test
  public void Phone_instantiateWithNumber_String() {
    Phone myPhone = new Phone("555-555-5555");
    assertEquals("555-555-5555", myPhone.getNumber());
  }

  @Test
  public void all_NumberInArray_returnsAllNumber_true() {
    Phone firstNumber = new Phone("555-555-5555");
    Phone secondNumber = new Phone("444-444-4444");
    assertTrue(Phone.all().contains(firstNumber));
    assertTrue(Phone.all().contains(secondNumber));
  }

  @Test
  public void clear_emptiesAllphoneNumbersFromArrayList_0() {
    Phone myPhone = new Phone("555-555-5555");
    Phone.clear();
    assertEquals(Phone.all().size() , 0);
  }

  @Test
  public void getId_phoneNumberInstantiateWithAnID_1() {
    Phone myPhone = new Phone("555-555-5555");
    assertEquals(1, myPhone.getId());
  }

  @Test
  public void find_returnsNumbersWithSameId_secondNumber() {
    Phone firstNumber = new Phone("555-555-5555");
    Phone secondNumber = new Phone("444-444-4444");
    assertEquals(Phone.find(secondNumber.getId()), secondNumber);
  }

  @Test
  public void find_returnsNullWhenNoNumberFound_null() {
    assertTrue(Phone.find(999) == null);
  }

}
