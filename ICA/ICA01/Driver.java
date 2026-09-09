package ICA.ICA01;

public class Driver {
  public static void main (String[] args) {
    Person person1 = new Person();
    Person person2 = new Person();
  
    person1.setInfo("Maya", 20, "123 Lane", "000-000-0000");
    person2.setInfo("Zi Yin", 18, "ABC Ave", "111-111-1111");
    
    person1.displayInfo();
    person2.displayInfo();

    person1.introduceFriend(person2);

    person2.changeInfo(person1);
    // Check to see if method works
    person1.displayInfo();
    person2.displayInfo();
  }
}
