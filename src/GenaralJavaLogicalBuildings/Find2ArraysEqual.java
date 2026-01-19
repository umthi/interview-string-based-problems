package GenaralJavaLogicalBuildings;

import java.util.Arrays;

public class Find2ArraysEqual {
    public static void main(String[] args) {
        int[] a1 = {1,2,3,4,5,6};
        int[] a2 = {1,2,3,4,5,6};

        // by using predefined method
        if(Arrays.equals(a1, a2))
            System.out.println("arrays are equal");
        else
            System.out.println("arrays are not equal");

        boolean isArraysEqual = isArraysEqual(a1, a2);
        // without using predefined method
        if(isArraysEqual)
            System.out.println("arrays are equal");
        else
            System.out.println("arrays are not equal");
    }

    private static boolean isArraysEqual(int[] a1, int[] a2) {
        if(a1.length != a2.length)
            return false;
        for(int i=0; i < a1.length; i++) {
            if(a1[i] != a2[i])
                return false;
        }
        return true;
    }
}
