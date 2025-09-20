package arrays;
//two dimension array
public class MultiDimensionalArray {
    public static void main(String[] args) {
        String[] person ={}; //single array
        //multi
        String[] [] people ={
                {"Mg Mg","Su Su"}, //row0
                {"Aung Aung","Kyaw Kyaw"}, //row1
                {"Ko Ko","Oo Oo","Daw DAw"}// row2
        };
       /* mgmg -> row 0, 0
          Aung Aung -> row1,0
          Daw Daw -> row2,2
        */
        System.out.println(people[0][0]);
        System.out.println(people[1][1]);
        System.out.println(people[2][2]);
    }

}
