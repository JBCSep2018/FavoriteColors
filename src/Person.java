public class Person {
  private String name;
  private String email;
  private String favoriteColor;

  public Person() {
  }

  public Person(String name, String email, String favoriteColor) {
    this.name = name;
    this.email = email;
    this.favoriteColor = favoriteColor;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getFavoriteColor() {
    return favoriteColor;
  }

  public void setFavoriteColor(String favoriteColor) {
    this.favoriteColor = favoriteColor;
  }
}
