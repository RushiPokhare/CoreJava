package array;

public class Max_Number {
    public static void main(String[] args) {
        int [] array={10,11,12,13,24,101,205};
        int maxNum=Integer.MIN_VALUE;

        for(int temp:array){
            if(temp>maxNum){
                maxNum=temp;
            }
        }
        System.out.println("Maximum number is :"+maxNum);
    }
}
