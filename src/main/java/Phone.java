import java.util.ArrayList;

public class Phone {
  private String mNumber;
  private static ArrayList<Phone> phoneNumbers = new ArrayList<Phone>();
  private int mId;

  public Phone(String number) {
    mNumber = number;
    phoneNumbers.add(this);
    mId = phoneNumbers.size();
  }

  public String getNumber() {
    return mNumber;
  }

  public static ArrayList<Phone> all() {
    return phoneNumbers;
  }

  public static void clear() {
    phoneNumbers.clear();
  }

  public int getId() {
    return mId;
  }

  public static Phone find(int id) {
    try {
      return phoneNumbers.get(id - 1);
    } catch (IndexOutOfBoundsException exception) {
      return null;
    }
  }

}
