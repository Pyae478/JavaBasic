package method;

public class AboutReturn {
    public static void main(String[] args) {
        System.out.println(task());
        AboutReturn a = new AboutReturn();
        if(a.valueBoolean()){
            System.out.println("It is True.");
        }else{
            System.out.println("It is False.");
        }
    }
    public static int task(){ // int data type in method --> return same data type
        return 10;
    }
    //non static
    public boolean valueBoolean(){
        return true;
    }
}
