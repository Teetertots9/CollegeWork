package exercise2Skeleton;

public class Surface {
  private String name;  
  private double length;  
  private double width; 

  public Surface(String initName, double initLength, double initWidth) {
    name = initName;
    length = initLength;
    width = initWidth;
  }

  public String getName() {
    return name;
  }

  public double getLength() {
    return length;
  }

  public double getWidth() {
    return width;
  }

  public double calcArea() {
    return width * length;
  }
}