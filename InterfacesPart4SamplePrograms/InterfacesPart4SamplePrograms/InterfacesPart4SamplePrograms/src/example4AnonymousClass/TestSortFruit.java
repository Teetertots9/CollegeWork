package example4AnonymousClass;

import java.util.Arrays;
import java.util.Comparator;

public class TestSortFruit {

    public static void main(String args[]) {

        Fruit[] fruits = new Fruit[4];

        Fruit pineappale = new Fruit("Pineapple", "Pineapple description", 70);
        Fruit apple = new Fruit("Apple", "Apple description", 20);
        Fruit orange = new Fruit("Orange", "Orange description", 80);
        Fruit banana = new Fruit("Banana", "Banana description", 90);

        fruits[0] = pineappale;
        fruits[1] = apple;
        fruits[2] = orange;
        fruits[3] = banana;

        Arrays.sort(fruits, new Comparator<Fruit>() {
            @Override
            public int compare(Fruit fruit1, Fruit fruit2) {
                String fruitName1 = fruit1.getFruitName().toUpperCase();
                String fruitName2 = fruit2.getFruitName().toUpperCase();

                //ascending order
                return fruitName1.compareTo(fruitName2);

                //descending order
                //return fruitName2.compareTo(fruitName2);
            }

        });
        System.out.println("Sorted by Name Ascending");
        int i = 0;
        for (Fruit temp : fruits) {
            System.out.println("fruits " + ++i + " : " + temp.getFruitName()
                    + ", Quantity : " + temp.getQuantity());
        }

    }
}
