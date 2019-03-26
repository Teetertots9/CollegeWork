package exercise2Skeleton;

public class Flooring extends Material {
  private double coverage;    

  public Flooring(String initName, double initPrice, double coverage) {
    super(initName, initPrice);
    this.coverage = coverage;
  }

  public double getCoverage() {
    return coverage;
  }


  public double getMaterialReq(Surface aSurface) {
    double area = aSurface.calcArea();
    double noOfPacks = area / coverage;
    return noOfPacks;
  }
}
