import java.util.ArrayList;

public class Contact {
  private String mFirstName;
  private String mLastName;
  private static ArrayList<Contact> instances = new ArrayList<Contact>();
  private int mId;

  public Contact(String firstName, String lastName) {
    mFirstName = firstName;
    mLastName = lastName;
    instances.add(this);
    mId = instances.size();
  }

  public String getFirstName() {
    return mFirstName;
  }

  public String getLastName() {
    return mLastName;
  }

  public static ArrayList<Contact> all() {
    return instances;
  }

  public static void clear() {
   instances.clear();
  }

  public int getId() {
    return mId;
  }

  public static Contact find(int id) {
    try {
      return instances.get(id - 1);
    } catch (IndexOutOfBoundsException exception) {
      return null;
    }
  }
}
