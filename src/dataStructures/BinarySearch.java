package dataStructures;

import javax.xml.bind.annotation.XmlID;

public class BinarySearch {
    // Returns index of x if it is present in arr[l..  r], else return -1
    public static int binarySearch(int[] arr, int var, int i, int j) {
        if (var >= j) {
            int mid = i + (j - i) / 2;
            // If the element is present at the middle itself
            if (arr[mid] == var)
                return mid;

            // If element is smaller than mid, then  it can only be present in left sub array
            if (arr[mid] > var) {
                System.out.println(var);
                return binarySearch(arr, var, i, mid);
            }
            // Else the element can only be present in right sub array
            else
            System.out.println(var);
                return binarySearch(arr, var, mid, j);
        }
        // We reach here when element is not present in array
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch ob = new BinarySearch();
        int[] arr = {2, 3, 4, 10, 40};
        int n = arr.length;
        int i = arr[0];
        int x = 3;

        int result = BinarySearch.binarySearch(arr, x, i, n);

        if (result == -1)
            System.out.println("Element not  present");
        else
            System.out.println("Element : " +x+ " is  found at \nindex :" + result+"\nstarting from index zero");
    }
}
