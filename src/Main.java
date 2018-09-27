import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    People allPeople = new People(getListOfPeople());

    // Get list of people from the list of people entered for a color specified
    People contactList = new People(getContactList(allPeople));

    printPeople(allPeople, "ALL PEOPLE");
    printPeople(contactList, "CONTACT LIST OF SEARCH COLOR");
  }

  private static ArrayList<Person> getListOfPeople(){
    ArrayList<Person> people = new ArrayList<>();
    Color color = new Color();

    Scanner in = new Scanner(System.in);
    String name, email, favoriteColor, quit = "";

    do {
      Person person = new Person();

      System.out.print("Person's name: ");
      name = in.nextLine();

      System.out.print("Email: ");
      email = in.nextLine();

      System.out.print("Favorite color: ");
      favoriteColor = in.nextLine();
      System.out.println(color.getFeedback(favoriteColor));

      person = new Person(name, email, favoriteColor);
      people.add(person);

      System.out.print("Add new person Y(yes) or Q(quit)");
      quit = in.nextLine();

      System.out.println();

    } while(!quit.equalsIgnoreCase("Q"));

    return people;
  }

  private static ArrayList<Person> getContactList(People people){
    Scanner in = new Scanner(System.in);
    String color = "";

    System.out.print("Enter color to search for: ");
    color = in.nextLine();

    return people.getContactList(color);
  }

  private static void printPeople(People people, String header){

    System.out.println("\n================================" + header +
            "================================");
    System.out.println("Name\t\t\tEmail\t\tFavorite Color");

    for(Person person : people.getPeople()){
      System.out.println(person.getName() + "\t\t\t" + person.getEmail() +
              "\t\t\t" + person.getFavoriteColor());
    }
  }

}
