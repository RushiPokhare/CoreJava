package array;

public class Reverse_Actual_Array {
    public static void main(String[] args) {
        int [] array={10,5,6,34,8,9,78};
        int left=0;
        int right= array.length-1;

        while(left<=right){
            int temp=array[left];
            array[left]=array[right];
            array[right]=temp;
            left++;
            right--;
        }
        System.out.println("Reverse Actual Array :");
        for (int temp:array){
            System.out.print(temp+" ");
        }
    }
}
