package exercise2Skeleton;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;


public class TestPolymorphism {

    public static void main(String[] args) {
        DecimalFormat f = new DecimalFormat("#,###.##");
        ArrayList<Material> materials = new ArrayList<>();
        try{
            createPaint(materials);
        } catch(FileNotFoundException e){
            System.out.println("Error: in paint method " + e.getMessage());
        }
        try{
            createWallpaper(materials);
        } catch(FileNotFoundException e){
            System.out.println("Error: in wallpaer method " + e.getMessage());
        }
        try{
            createFlooring(materials);
        } catch(FileNotFoundException e){
            System.out.println("Error: in flooring method " + e.getMessage());
        }

         
       

        Surface aSurface = new Surface("testSurface", 5.7, 5.7);

        for (int i = 0; i < materials.size(); i++) {
            String name = materials.get(i).getName();
            double req = materials.get(i).getMaterialReq(aSurface);
            double price = materials.get(i).calcTotalPrice(aSurface);
            System.out.println("Name: " + name + ", Requirement: "
                    + f.format(req) + " units, Price €" + f.format(price));
            System.out.println();
        }
        
  
        
    }
    
    private static void createPaint(ArrayList<Material> materials) throws FileNotFoundException{
        File myDir = new File("files");
        File paint = new File(myDir, "paint.txt");
        try(Scanner in = new Scanner(paint)){
            while(in.hasNextLine()) {
                String name = in.nextLine();
                double price = Double.parseDouble(in.nextLine());
                int noCoats = Integer.parseInt(in.nextLine());
                double coverage = Double.parseDouble(in.nextLine());
                
                Paint p1 = new Paint(name,price,noCoats,coverage);
                materials.add(p1);
            }
        }
    }
    
    private static void createWallpaper(ArrayList<Material> materials) throws FileNotFoundException{
        File myDir = new File("files");
        File wallpaper = new File(myDir, "wallpaper.txt");
        try(Scanner in = new Scanner(wallpaper)){
            while(in.hasNextLine()) {
                String name = in.nextLine();
                double price = Double.parseDouble(in.nextLine());
                double length = Double.parseDouble(in.nextLine());
                double width = Double.parseDouble(in.nextLine());
                
                Wallpaper p1 = new Wallpaper(name,price,length,width);
                materials.add(p1);
            }
        }
    }
    
    private static void createFlooring(ArrayList<Material> materials) throws FileNotFoundException{
        File myDir = new File("files");
        File flooring = new File(myDir, "flooring.txt");
        try(Scanner in = new Scanner(flooring)){
            while(in.hasNextLine()) {
                String name = in.nextLine();
                double price = Double.parseDouble(in.nextLine());
                double coverage = Double.parseDouble(in.nextLine());
                
                
                Flooring p1 = new Flooring(name,price,coverage);
                materials.add(p1);
            }
        }
    }
}
