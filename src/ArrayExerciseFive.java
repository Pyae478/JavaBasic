import java.util.Arrays;
public class ArrayExerciseFive {

    public static void main(String[] args) {
       String[] cars = {"BMW", "Ford", "Mercedes","Audi","Tesla","Benz"};

      /*  String[] copyCars = new String[5];

        System.arraycopy(cars,1,0,5);
        System.out.println(Arrays.toString(copyCars));

        */
        //direct copy-> (original array,start of index, end of index + 1)
        String[] copyCars = Arrays.copyOfRange(cars,1,3);
        System.out.println(Arrays.toString(copyCars));


    }
}
