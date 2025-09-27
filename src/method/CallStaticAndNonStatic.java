package method;

/*
1.static can't call nonstatic directly
2.static to static can call directly
3.Nonstatic can call static directly
 */

public class CallStaticAndNonStatic {
    public static void main(String[] args) {

    }
    //static
    public static void task(){
        CallStaticAndNonStatic c = new CallStaticAndNonStatic();
        c.heyNow();

    }
    //Non static
    public void heyNow(){

    }

    public static void theEnd(){

    }
}
