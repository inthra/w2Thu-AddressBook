import org.junit.*;
import static org.junit.Assert.*;

public class ContactTest {

  @Test
  public void Contact_instantiatesCorrectly_true() {
    Contact myContact = new Contact("Nick", "Lyman", "555-555-5555");
    assertEquals(true, myContact instanceof Contact);
  }
}
