package DataStructureRelatedProblems;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {90, 70, 10, 20, 30, 40, 50, 60};
        int elt = 20;

        //find element position
        if(!findElementUsingLinearSearch(arr, elt))
            System.out.println("no element found");
    }

    private static boolean findElementUsingLinearSearch(int[] arr, int elt) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == elt) {
                System.out.println("position of the element is " + i);
                return true;
            }
        }
        return false;
    }
}
