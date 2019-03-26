package exercise2Skeleton;
public class Wallpaper extends Material {

    private double lengthPerRoll;
    private double widthPerRoll;

    public Wallpaper(String initName, double initPrice, double initLengthPerRoll,
            double initWidthPerRoll) {
        super(initName, initPrice);
        lengthPerRoll = initLengthPerRoll;
        widthPerRoll = initWidthPerRoll;
    }

    public double getLengthPerRoll() {
        return lengthPerRoll;
    }

    public double getWidthPerRoll() {
        return widthPerRoll;
    }

    public double getMaterialReq(Surface aSurface) {
        double reducedArea = 0.8;
        double rollCapacity = getWidthPerRoll() * getLengthPerRoll();
        double surfaceArea = aSurface.calcArea() * 4;
        // Reduce area by 20% to allow for doors and windows in the room
        surfaceArea = surfaceArea * reducedArea;

        double noOfRolls = surfaceArea / rollCapacity;

        return noOfRolls;
    }
}
