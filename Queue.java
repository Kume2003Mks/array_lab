// ทำงานแบบ First in First out
import java.util.Scanner;

public class Queue {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] queuelist = new int[5] ; // กำหนดขนาด ArrayList
        int i , j = 1;
        for(i = 0 ; i < 5 ; i++) {
            System.out.print("Enqueue Data " + j++ + " : " );//วนรับค่า
            queuelist[i] = input.nextInt();
            if (queuelist[i] <= 0) { // รับค่า 0 = รับใหม่
                i--;
            }
        }
        System.out.println("Queue is full.\n");

        j = 1; // set j
        for(i = 0 ; i < 5 ; i++) {

            System.out.println("Dequeue Data " + j++ + " : " + queuelist[i] );
        }// เสร็จแล้ว

        System.out.println("Queue is Empty.");
    }
}