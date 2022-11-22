public class simplearray {
    public static void main(String[] args)
    {
        array arr; // reference
        arr = new array(100); // create LowArray object
        int nElems = 0; // number of items in array
        int j; // loop variable

        arr.setElem(0, 77); // insert 10 items
        arr.setElem(1, 99); // ถ้าไม่มีค่าใน Array จะแสดง Array is empty.
        arr.setElem(2, 44);
        arr.setElem(3, 55);
        arr.setElem(4, 22);
        arr.setElem(5, 88);
        arr.setElem(6, 11);
        arr.setElem(7, 00);
        arr.setElem(8, 66);
        arr.setElem(9, 33);
        arr.setElem(10, 103);
        arr.setElem(11, 330);
        nElems = 12; // now 10 items in array

        for(j=0; j<nElems; j++) // display items
            System.out.print(arr.getElem(j) + " ");
        System.out.println("");

        System.out.println("index number "+ arr.findMax(nElems));

        arr.removeMax(nElems);
        nElems--;
        for(j=0; j<nElems; j++) // display items after remove max
            System.out.print(arr.getElem(j) + " ");
        System.out.println("");

    }
}

class array {
    private long[] a; // ref to array a


    public array(int size) // constructor
    { a = new long[size]; } // create array


    public void setElem(int index, long value) // set value
    { a[index] = value; }


    public long getElem(int index) // get value
    { return a[index]; }

    public int findMax(int nElems){ //find max
        int maxValue = -1;
        long max = a[0];
        if (nElems <= 0) {
            return -1;}
        for(int i=0;i < nElems;i++){
            if (a[i] > max){
                maxValue = i;
                max = a[i];
            }
        }
        return maxValue;
    }
    public long removeMax(int nElems) {  //removemax
        int maxIndex = findMax(nElems);
        if (maxIndex == -1) {
            System.out.println("Cannot find max. Array is empty.");
            return -1;
        }
        System.out.println(a[maxIndex] + " has been removed.");
        for (int i = maxIndex; i < nElems - 1; i++) {
            a[i] = a[i + 1];
        }
        return a[maxIndex];
    }
}