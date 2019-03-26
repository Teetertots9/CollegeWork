package exercise2Skeleton;
public abstract class Material {
  private String name;  // identifies the material
  private double price; // price per unit
  private double totalCost;

  public Material(String initName, double initPrice) {
    name = initName;
    price = initPrice;
    totalCost=0.0;
  }

  public String getName() {
    return name;
  }

  public double getPricePerUnit() {
    return price;
  }
    public double gettotalCost() {
    return totalCost;
  }

  public double calcTotalPrice(Surface aSurface) {
    totalCost = getMaterialReq(aSurface) * price;
    return totalCost;
  }

  public abstract double getMaterialReq(Surface aSurface);
  
  
}