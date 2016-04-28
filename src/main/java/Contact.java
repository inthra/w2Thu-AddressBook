import java.util.ArrayList;

public class Contact {
  private String mFirstName;
  private String mLastName;
  private String mPhoneNumber;
  private static ArrayList<Contact> instances = new ArrayList<Contact>();
  private int mId;

  public Contact(String firstName, String lastName, String phoneNumber) {
    mFirstName = firstName;
    mLastName = lastName;
    mPhoneNumber = phoneNumber;
    instances.add(this);
    mId = instances.size();
  }


}
