package arrays;
//three dimension array
public class MultiDimensionalArrayEx2 {
    public static void main(String[] args) {
        String [][][] name = { //array 1
                { //array 2 of 0
                        {"Aung Aung","Mg Mg","Kyaw Kyaw"},
                        {"Moe Moe","Su Su","Lin Lin"}//array 3
                },
                { //array 2 of 1
                        {"Zaw Zaw","Khin Khin"},
                        {"Soe Soe","Ko Ko"}

                },
                { //array 2 of 2
                        {"Pa Pa","Phoo Phoo"},
                        {"Aye Aye","Zin Zin"}
                }
        };
        System.out.println(name[0][0][0]);
        System.out.println(name[1][1][1]);

    }
}
