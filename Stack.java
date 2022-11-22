// ทำงานแบบ Last in First out (LIFO)
import java.util.*;

class CreateArray {
    String[] a; 

    public CreateArray(int size)
    // สร้าง constructor
    {
        a = new String[size];
    }

    public void setValue(int index, String value)
    //ค่า i จะเป็นข้อมุูลลำดับ Array ,value จะเป็นตัวหนังสือ เพื่อ set value
    {
        a[index] = value; 
    }

    public String getValue(int index)
    {
        return a[index]; // return value
    }
}

public class Stack {

    public static void main(String[] args) {
        int i, j = 1,k = 1 ;
        String msg;

        CreateArray arr;
        Scanner input = new Scanner(System.in);
            arr = new CreateArray(5); // create array size

            for (i = 0; i < 5; i++) {
                System.out.print("Push Data " + j + " : ");
                msg = input.next(); // ส่งค่าไป method setvalue
                arr.setValue(i, msg);
                j++;
            }
        System.out.println("----------------------");
        for (i = 5; i > 0; i--) {
            System.out.println("Pop Data " + k + " : " + arr.getValue(i - 1));
            k++;
        }
    }
}