package controlflow;

public class ExerciseThree {
    public static void main(String[] args) {
        int examResult = 80;
        if(examResult >=0 && examResult <=41) {
            System.out.println("You pass");
        }else if(examResult>=41 && examResult<=79) { // and -> both true = true
            System.out.println("You are merit");
        }else {
            System.out.println("You got Distinction");

        }
    }
}
