package inclassexercise;

public class TestUniversity {

    public static void main(String[] args) {

        int depids[] = {1,2,3,4};
        String depnames[] = {"Computing", "Business", "Languages", "Engineering"};

        University newUniv = new University("DCU", depids, depnames);
        newUniv.showList();
        System.out.println();
        newUniv.changedeptname("Business", "Business & Marketing");
        newUniv.showList();
    }
}



