package controlflow;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Homework1 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the length of your house: ");
        double length = Double.parseDouble(reader.readLine());

        System.out.println("Enter the width of your house: ");
        double width = Double.parseDouble(reader.readLine());

        System.out.println("Enter the height of your house: ");
        double height = Double.parseDouble(reader.readLine());

        double area = length * width * height;
        System.out.println("Area of Your House is "+ area);
        double halfArea = area / 2;
        System.out.println("Half Area of Your Housen is "+ halfArea);

        if(halfArea > 900){
            System.out.println("Wow! Your House is Big.");
        }else if(halfArea >= 600 && halfArea <= 900){
            System.out.println("Your House is Medium.");
        }else {
            System.out.println("Your House is Small.");
        }



    }
}
