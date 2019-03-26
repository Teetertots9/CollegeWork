package exercise2Skeleton;
public class Paint extends Material {
  private int noOfCoats;
  private double noOfSqMPerLiter;

  public Paint(String initName, double initPrice, int initNoOfCoats,
    double initNoOfSqMPerLiter) {
    super(initName, initPrice);
    noOfCoats = initNoOfCoats;
    noOfSqMPerLiter = initNoOfSqMPerLiter;
  }

  public int getNoOfCoats() {
    return noOfCoats;
  }

  public double getNoOfSqMPerLiter() {
    return noOfSqMPerLiter;
  }

  @Override
  public double getMaterialReq(Surface aSurface) {
    double area = aSurface.calcArea()*4;
    double reducedArea = 0.8;
    
    //Reduce area by 20% to allow for doors and windows in the room
    area = area*reducedArea;
    double noOfLiters = area * noOfCoats / noOfSqMPerLiter;
    return noOfLiters;
  }
}