package arrays;

public class FourDimensionAssignment {
    public static void main(String[] args) {
        String [][][][] names = {
                {
                        { //0
                                {"Phyu","Moe","Thwal","Htun"}, //0
                                {"May Oo","Sandar","Nway Nway"}, //1
                                {"Lwin Moe","Paing Paing","Nyi Htut"} //2
                        },
                        { //1
                                {"Ju Ju","Hnin Oo","Mya Pearl"}, //0
                                {"Kay Lin","Phyo Thinzar","Htet Oo"} //1
                        },
                        { //2
                                {"Lin Latt","Shwe Zin"}, //0
                                {"Hmue Thet","Sai Sai"} //1
                        },
                        { //3
                                {"Aye Mya","Lin Bo","Htoo Aunt Shein"}, //0
                                {"Hsu Yadi","Phoebe","Pyae Yati Naing"} //1
                        }
                }
        };
        System.out.println(names[0][0][0][0]);
        System.out.println(names[0][0][0][1]);
        System.out.println(names[0][0][0][2]);
        System.out.println(names[0][0][0][3]);
        System.out.println(names[0][0][1][0]);
        System.out.println(names[0][0][1][1]);
        System.out.println(names[0][0][1][2]);
        System.out.println(names[0][0][2][0]);
        System.out.println(names[0][0][2][1]);
        System.out.println(names[0][0][2][2]);

        System.out.println(names[0][1][0][0]);
        System.out.println(names[0][1][0][1]);
        System.out.println(names[0][1][0][2]);
        System.out.println(names[0][1][1][0]);
        System.out.println(names[0][1][1][1]);
        System.out.println(names[0][1][1][2]);

        System.out.println(names[0][2][0][0]);
        System.out.println(names[0][2][0][1]);
        System.out.println(names[0][2][1][0]);
        System.out.println(names[0][2][1][1]);

        System.out.println(names[0][3][0][0]);
        System.out.println(names[0][3][0][1]);
        System.out.println(names[0][3][0][2]);
        System.out.println(names[0][3][1][0]);
        System.out.println(names[0][3][1][1]);
        System.out.println(names[0][3][1][2]);




    }
}
