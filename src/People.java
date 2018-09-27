import java.util.ArrayList;

public class People {
  private ArrayList<Person> people;

  public People() {
  }

  public People(ArrayList<Person> people) {
    this.people = people;
  }

  public ArrayList<Person> getPeople() {
    return people;
  }

  public void setPeople(ArrayList<Person> people) {
    this.people = people;
  }

  public ArrayList<Person> getContactList(String color) {
    ArrayList<Person> contactList = new ArrayList<>();

    for(Person person : this.people) {
      if(person.getFavoriteColor().equalsIgnoreCase(color)){
        contactList.add(person);
      }
    }

    return  contactList;
  }
}
