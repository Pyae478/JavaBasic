package controlflow;
import javax.swing.*;
public class SampleProjectOne {
    public static void main(String[] args) {
        String[] names = new String[10];
        // for loop -> 10 times
        for (int i = 0; i< 10;i++){
            names[i] = JOptionPane.showInputDialog("Add your name !");

        }
        //while
        int i = 0;
        while(i < names.length){
            System.out.println("Person is "+ names[i]);
            i++;
        }
        // for each
        for (String name : names){
            System.out.println("Person is "+ name);
        }
    }
}
