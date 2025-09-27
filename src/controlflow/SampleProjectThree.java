package controlflow;
import javax.swing.*;

public class SampleProjectThree {
    public static void main(String[] args) {
        String username = null;
        String password = null;

        boolean running = true;
        while(running){
            if(username== null){
                String inputUsername = JOptionPane.showInputDialog("Please Enter Your Username");
                if(inputUsername.contentEquals("Admin")){
                   username= inputUsername;

                }

            }else{
                String inputPassword = JOptionPane.showInputDialog("Please Enter Your Password");
                if(inputPassword.contentEquals("12345")){
                    password = inputPassword;
                    if(username.equals("Admin") && password.equals("12345")){
                        JOptionPane.showMessageDialog(null,"Login successful!");
                    }else{
                        JOptionPane.showMessageDialog(null,"Login fail");
                    }
                    running = false;
                }
            }

        }

    }
}
