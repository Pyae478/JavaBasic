package forlooping;

public class ExerciseThree {
    public static void main(String[] args) {
       /* initial point
        do{
            process
                 initial point do / in

        }while(expression); */

        int i = 0; //inital point

        do{
            System.out.println("This is do only one time");
            System.out.println("Number is "+ i); // process
            i++; //process
        }while(i<1); //end point

    }
}
