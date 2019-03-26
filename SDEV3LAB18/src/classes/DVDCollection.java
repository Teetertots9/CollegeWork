package classes;
import java.util.ArrayList;

public class DVDCollection {
   private ArrayList<DVD> collection;
   private int count;
   private double totalCost;


   public DVDCollection ()
   {
      collection = new ArrayList<>();
      count = 0;
      totalCost = 0.0;
   }

   //-----------------------------------------------------------------
   //  Adds a DVD to the collection, increasing the size of the
   //  collection if necessary.
   //-----------------------------------------------------------------
   public void addDVD (String title, String director, double cost)
   {
      collection.add(new DVD (title, director, cost));
      totalCost += cost;
      count++;
   }

    public ArrayList<DVD> getCollection() {
        return collection;
    }

    public void setCollection(ArrayList<DVD> collection) {
        this.collection = collection;
    }
   
    public void sort(String s1) {
        
    }
   

   //-----------------------------------------------------------------
   //  Returns a report describing the DVD collection.
   //-----------------------------------------------------------------
   @Override
  public String toString()
   {

      String report = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
      report += "My DVD Collection\n\n";

      report += "Number of DVDs: " + count + "\n";
      report += "Total cost: " + String.format("%.2f",totalCost) + "\n";
      report += "Average cost: " + String.format("%.2f",totalCost/count);

      report += "\n\nDVD List:\n\n";

      for (int i = 0; i < count; i++)
         report += collection.get(i) + "\n";

      return report;
   }
}
