package arrays;
import java.util.Arrays;

public class ArraysHomework {
    public static void main(String[] args) {

        String[] cars = {"Mercedes","Ford","BMW","Toyota","Audi","Tesla"};
        String[] copyCars = Arrays.copyOfRange(cars,4,6);
        System.out.println(Arrays.toString(copyCars));



    }
}
