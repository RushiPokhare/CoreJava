package array;
// Printing array in reverse order
public class Print_Reverse {
    public static void main(String[] args) {

        int [] array1= {2,4,6,10,11,78};

        for (int index = array1.length-1; index >=0 ; index--) {
            System.out.print(array1[index]+" ");
        }
    }
}
