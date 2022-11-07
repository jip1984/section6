import java.util.Arrays;

public class TDArrays {
    public static void main(String[] args) {
        // will print out
        //  [0,0,0,0]
        //  [0,0,0,0]
        //  [0,0,0,0]
        //  [0,0,0,0]
        int[][] grades = {
            {72,74,78,76},
            {65,64,61,67},
            {95,98,99,100}
        };

     for(int i = 0; i < grades.length; i++){
        for(int j = 0; j < grades[i].length; j++){
            System.out.print(grades[i][j] + " ");
        }
        System.out.println("\n");
     }
   


       
    }
}
