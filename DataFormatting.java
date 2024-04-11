public class DataFormatting {
    static class Person{
        public final Integer id;
        public final String name;
        public final Boolean likesPizza;

        public Integer getId(){
            return this.id;
        }

        public Person(Integer id, String name, Boolean likesPizza){
            this.id = id;
            this.name = name;
            this.likesPizza = likesPizza;
        }
    }

    static class PersonUtils {
        public static String getFirstName(Person person){
            return person.name.split(" ")[0];
        }
    }



    public static void main(String[] args) {
        // Univariate arrays
        String[] names = {"John Doe", "Jane Jones", "Bill Smith", "Betsy Garcia"};
        Integer[] ids = {123,234,345,456};
        Boolean[] likesPizza = {false, true, true, false};

        // Mutivariate arrays
        Integer[] person1 = {123, 0, 1994, 4, 3};
        Integer[] person2 = {234, 1, 1948, 8, 4};

        //Matrices
        double[][] peopledata = {{123, 0, 1994, 4, 3}, {234, 1, 1948, 8, 4}};

        RealMatrix matrix = new Array2DRowRealMatrix(peopledata);

    }
}