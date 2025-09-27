package arrays;

public class ThreeDimensionalAssignment {
    public static void main(String[] args) {

        String [][][] colors ={
                { //0
                        {"Red","Blue","Green"}, //0
                        {"Gold","Silver","White"} //1
                },
                { //1
                        {"Purple","Dark Green","Black"}, //0
                        {"Neon Pink","Sky Blue","Brown"} //1
                },
                { //2
                        {"Bright Red","Reddish Brown"}, //0
                        {"Grey","Soft Green","Sweet Orange"} //1
                }

        };

        System.out.println(colors[0][0][0]);
        System.out.println(colors[0][0][1]);
        System.out.println(colors[0][0][2]);
        System.out.println(colors[0][1][0]);
        System.out.println(colors[0][1][1]);
        System.out.println(colors[0][1][2]);

        System.out.println(colors[1][0][0]);
        System.out.println(colors[1][0][1]);
        System.out.println(colors[1][0][2]);
        System.out.println(colors[1][1][0]);
        System.out.println(colors[1][1][1]);
        System.out.println(colors[1][1][2]);

        System.out.println(colors[2][0][0]);
        System.out.println(colors[2][0][1]);
        System.out.println(colors[2][1][0]);
        System.out.println(colors[2][1][1]);
        System.out.println(colors[2][1][2]);



    }
}
