package method;

public class DefaultMethod {
    /* Creating method
    1.method name
    2.return type ( void or no void)
    3.access modifier (public, private,protected ,defaulf)
    4.parameter (value)
    5.method body()

    Start with small letter and use Camel case -> studentName

     */

    //Access
    //Modifier  //static keyword //return_type  //IndentifierName(MethodName) //args -> arguments

    public class CreatingMethod{

    }
    public static void  main(String[] args) {
      // CreatingMethod cm = new CreatingMethod();
        // System.out.println(cm.jobName());
        //cm.task(3);



    }
    // Creating a Method with void without return value
     public void task(int i){
         System.out.println("Do Website for CRM");

     }
     // Creating method without void and with return value
     public String jobName(String name){
        String job = "Software developer";
        return job;
     }
}
