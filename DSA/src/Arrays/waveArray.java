package Arrays;
import java.util.ArrayList;
public class waveArray {
    public static void main (String[] args){
        int [] [] arr={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        wave(arr);
    }
    private static void wave(int[][] a){
        for(int c=0;c<a[0].length;c++){
            if (c%2==0){
                //moveup

                for(int r=0;r < a.length; r++){
                    System.out.println(a[r][c] + " ");

                }else{
                    //movedown
                for (int r = a.length-1; r>=0;r--){
                    System.out.print(a[r][c]+ " ");
                }
            }
        }
    }
}
