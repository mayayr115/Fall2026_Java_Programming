package ICA.ICA01;

public class Person {
  private String name;
  private int age;
  private String address;
  private String phoneNumber;

  public void setInfo(String name, int age, String address, String phoneNumber) {
    this.name = name;
    this.age = age;
    this.address = address;
    this.phoneNumber = phoneNumber;
  }

  public void displayInfo() {
    System.out.println(this.name);
    System.out.println(this.age);
    System.out.println(this.address);
    System.out.println(this.phoneNumber);
    System.out.println();
  }

  public void introduceFriend(Person person) {
    System.out.printf("Hi! My name is %s. This is my friend, %s. %s is %d years old.\n\n", this.name, person.name, person.name, person.age);
  }

  public void changeInfo(Person person) {
    this.setInfo(person.name, person.age, person.address, person.phoneNumber);
  }
}
