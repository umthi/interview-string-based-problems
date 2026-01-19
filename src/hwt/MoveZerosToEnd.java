package hwt;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        //kind of pivotpoint in quicksort
        int pointer = 0;

        for(int i=0; i<arr.length; i++) {
            //if(arr[i]==0) // for move zeros to front
            if(arr[i]!=0) {
                int temp = arr[i];
                arr[i] = arr[pointer];
                arr[pointer] = temp;
                pointer++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
