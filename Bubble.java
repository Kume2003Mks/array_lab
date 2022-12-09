// ข้อ 5.1 Bubble short
import java.util.Scanner;

public class Bubble{
    public static void main(String[] args) {
        int i,j=1;

        Scanner input = new Scanner(System.in);

        System.out.print("Input number of integers to sort : ");
        int MaxQ = input.nextInt();

        int[] arrayl = new int[MaxQ] ; // ตั้งค่าที่เก็บใน Array

        System.out.println("Enter "+ MaxQ + " integers");

        for(i = 0 ; i < MaxQ ; i++) { // วนรับค่า
            System.out.print("Enter " + j++ + " : " );
            arrayl[i] = input.nextInt();

        }
        for (i = 0; i < MaxQ - 1; i++) {
            for (j = 0; j < MaxQ - i - 1; j++) {
                if (arrayl[j] < arrayl[j + 1]) { //เทียบค่า array ตัว1.กับตัว2
                    int setn = arrayl[j]; //อัปเดตค่า เก็บตัวในแปร Setn
                    arrayl[j] = arrayl[j + 1]; //สลับค่า
                    arrayl[j + 1] = setn; //ขยับค่า
                }
            }
        }
        j = 1;
        System.out.println("Sorted list of numbers: ");

        for (i = 0; i < MaxQ; i++)
            System.out.println("Data " + j++ + " : " + arrayl[i]);

    }
}
