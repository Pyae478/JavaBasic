public class ExerciseTwo {
    public static void main(String[] args) {
        int a = 0;
        int b = 5;
        b += a++;

        int c = 10;
        int d = 0;
        //c += d--;
        c += --d; //prefix
        // 10 + 0 = 10


        c += d--; // postfix
        // b = -1 , 0-1  = -1
        System.out.println(a);
        System.out.println(b);



        //a ++;
        //++b;
        System.out.println(a);
        System.out.println(b);

         boolean single = true;
         boolean result = !single;
        System.out.println(result);







    }
}
