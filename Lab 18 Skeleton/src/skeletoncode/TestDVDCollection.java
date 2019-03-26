package skeletoncode;

public class TestDVDCollection {

    public static void main(String[] args) {
        DVDCollection films = new DVDCollection();

        films.addDVD("The Walk", "Robert Zemeckis", 25.95);
        films.addDVD("Trainwreck", "Judd Apatow", 24.95);
        films.addDVD("No Escape", "John Erick Dowdle", 27.95);
        films.addDVD("Paper Towns", "Jake Schreier", 33.90);

        System.out.println(films);
    }

}
