package controlflow;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Homework2 {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the first valid number");
        double firstNumber = Double.parseDouble(reader.readLine());

        System.out.println("Enter the second valid number");
        double secondNumber = Double.parseDouble(reader.readLine());

        System.out.println("Enter the third valid number");
        double thirdNumber = Double.parseDouble(reader.readLine());

        if(firstNumber > secondNumber && firstNumber > thirdNumber){
            System.out.println("First number is the greatest number.");
        }else if(secondNumber > firstNumber && secondNumber > thirdNumber){
            System.out.println("Second number is the greatest number.");
        }else if (thirdNumber > firstNumber && thirdNumber > secondNumber){
            System.out.println("Third number is the greatest number.");

        }else if(firstNumber == secondNumber && firstNumber == thirdNumber){
            System.out.println("All number are Equal.");
        }else if(firstNumber > secondNumber && secondNumber == thirdNumber){
            System.out.println("First number is the greatest and other two numbers are equal.");
        }else if(secondNumber > firstNumber && firstNumber == thirdNumber){
            System.out.println("Second number is the greatest and other two numbers are equal.");
        }else{
            System.out.println("Third number is the greatest and other two numbers are equal.");
        }

    }

}
