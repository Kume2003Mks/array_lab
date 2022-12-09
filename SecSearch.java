// Sequential search
import java.util.*;

public class SecSearch{ // search operation
    static int findElement(int arr[], int n,int key) {// search element method
        for (int i = 0; i < n; i++) // find element
            if (arr[i] == key) // found element
                return i;
        return -1;
    }
      
    public static void main(String args[]){
        int arr[] = {10001, 10022, 10060, 11255, 15022, 20001, 21002, 23003, 25566, 30078, 40000, 50012, 66006} ;
        int n = arr.length;

        Scanner input = new Scanner(System.in);
        // Using a last element as search element
        System.out.print("Search ID : ");
        int key = input.nextInt();
        int position = findElement(arr, n, key);
      
        if (position == - 1)
            System.out.println("Not found!");
        else
            System.out.println("Found at A ["+ (position + 1)+"]");
    }
}