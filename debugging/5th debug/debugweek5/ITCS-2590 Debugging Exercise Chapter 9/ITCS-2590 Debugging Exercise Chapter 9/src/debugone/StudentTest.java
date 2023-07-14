package debugone;

/*
     Run this class to test FullTimeStudent and PartTimeStudent; you must debug
     those classes before you can execute this test class.

             Output format should be:

             Name: George Bush
               SSN: 123-12-5678
               Course Count: 1
               Credit Hours: 2
               Status: Part Time
               Amount Due: $151.20

            Name: Abraham Lincoln
               SSN: 001-90-5323
               Course Count: 6
               Credit Hours: 22
               Status: Part Time
               Amount Due: $1663.20

            Name: Nikola Tesla
               SSN: 442-00-0998
               Course Count: 8
               Credit Hours: 26
               Status: Full Time
               Amount Due: $2184.00

            Name: Albert Einstein
               SSN: 675-78-2311
               Course Count: 10
               Credit Hours: 32
               Status: Full Time
               Amount Due: $2688.00

 */

public class StudentTest {
    public static void main(String[] args){

        // Part Time Student Test
        Student ft1 = new PartTimeStudent("George", "Bush", "123-12-5678",
                                            1, 2 );
        System.out.println(ft1);

        Student ft2 = new PartTimeStudent("Abraham", "Lincoln", "001-90-5323",
                                            6, 22 );
        System.out.println(ft2);

        // Full Time Student Test
        Student pt1 = new FullTimeStudent("Nikola", "Tesla", "442-00-0998",
                                            8, 26 );
        System.out.println(pt1);

        Student pt2 = new FullTimeStudent("Albert", "Einstein", "675-78-2311",
                                            10, 32 );
        System.out.println(pt2);
    }
}
