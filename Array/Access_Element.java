package Array;
// we access array element using
//  1.By using index and One by One
//  2.loops [while,do while,for]
//  3. Enchance for loop or foreach
public class Access_Element {
    public static void main(String[] args) {
        int [] array1= {2,4,6,10,11,78};


        System.out.println("1. One By One");
        System.out.println(array1[0]);
        System.out.println(array1[1]);
        System.out.println(array1[2]);
        System.out.println(array1[3]);
        System.out.println(array1[4]);
        System.out.println(array1[5]);


        System.out.println("2. Using for Loop");
        for (int index = 0; index < array1.length; index++) {
            System.out.println(array1[index]);
        }

        System.out.println("Using Enhanced For Loop");
        for (int temp:array1){
            System.out.println(temp);
        }
    }
}
