package controlflow;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExerciseFive {
    public static void main(String[] args) throws Exception{
        BufferedReader  reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter First Floating decimal point number");

        double firstNumber = Double.parseDouble(reader.readLine());
        System.out.println("Enter Second floating point number");
        double secondNumber = Double.parseDouble(reader.readLine());

        firstNumber  = Math.round(firstNumber*1000);
        double resultOne = firstNumber/1000;

        secondNumber = Math.round(secondNumber*1000);
        double resultTwo = secondNumber/1000;

        if(resultOne == resultTwo){
            System.out.println("Same Numbers");
        }else{
            System.out.println("Different Numbers");
        }




    }
}
