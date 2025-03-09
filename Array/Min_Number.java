package Array;

public class Min_Number {
    public static void main(String[] args) {
        int [] array={10,11,12,13,24,5,101,205};
        int minNum=Integer.MAX_VALUE;

        for (int temp:array){
            if (temp<minNum){
                minNum=temp;
            }
        }
        System.out.println("Minimun Number in givien array is :"+minNum);
    }
}
