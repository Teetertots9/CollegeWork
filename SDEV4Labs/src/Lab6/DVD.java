package Lab6;

public class DVD {

    private String title;
    private String category;
    
    private int year;
    private int quantityInStock;
    private int checkedOut;
    private int ratingSum;
    private int ratingCount;
    
    private final int MAX=5;


    public DVD(String titleStr, String cat, int aYear, int quantity, int checkedOut) {
        this.title = titleStr;
        this.category = cat;
        this.year = aYear;
        this.quantityInStock = quantity;
        this.checkedOut = checkedOut;
        this.ratingSum = 0;
        this.ratingCount = 0;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public int getYear() {
        return year;
    }

    public int getQuantityInstock() {
        return quantityInStock;
    }

    public int getCheckedOut() {
        return checkedOut;
    }

    public int getRatingSum() {
        return ratingSum;
    }

    public int getRatingCount() {
        return ratingCount;
    }

    public void rateDVD(double rating) {
        if (rating < 1 || rating > 5) {
            System.out.println("Rating has to be between 1 and 5");
        } else {
            ratingSum += rating;
            ratingCount++;
        }
    }

    public double getAverageRating() {
        if (ratingCount == 0) {
            return 0;
        } else {
            return ((double) ratingSum / ratingCount);
        }
    }

    public void checkOut() {
        quantityInStock--;
        checkedOut++;        
    }

    public boolean returnDVD() {
        boolean valid = true;

        if (checkedOut - 1 >= 0) {
            int val = (quantityInStock + 1) + (checkedOut - 1);

            if (val <= MAX) {
                quantityInStock++;
                checkedOut--;
            }
        } else {
            System.out.println("DVD does not belong to this store");
            valid = false;
        }
        return valid;
    }

    @Override
    public String toString() {
       String s;
        s = String.format("%-20s",title) + String.format("%-20s", category) + String.format("%15d", year) +
                String.format("%15d", quantityInStock) + String.format("%15d", checkedOut)   +String.format("%15d", ratingSum)+String.format("%15d", ratingCount);
        
        return s;
    }
}
