public class Color {
  private String color;

  public Color() {
  }

  public Color(String color) {
    this.color = color;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getFeedback(String color) {

    color = color.toLowerCase();

    switch(color) {
      case "grey":
        return "OK";
      case "blue":
        return "That's a nice color!";
      case "red":
        return "It pops!";
      case "orange":
        return "Citrus vibes";
      case "yellow":
        return "Bright as the sun!";
      case "purple":
        return "The color of royalty";
      case "black":
        return "A classic in fashion";
      case "white":
        return "Pure as snow...";
      case "green":
        return "Green with envy";
      default:
        return "";
    }
  }
}
