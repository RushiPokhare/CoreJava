package Array;

public class SecoundMax {
    public static void main(String[] args) {
        int [] array={10,5,6,34,100,8,9,78};
        int maxNum=Integer.MIN_VALUE;
        int secoundMax=Integer.MIN_VALUE;

        for(int temp:array){
            if(temp>maxNum){
                secoundMax=maxNum;
                maxNum=temp;
            }
            if (temp>secoundMax && temp< maxNum){
                secoundMax=temp;
            }
        }
        System.out.println("Frist Max --> "+maxNum);
        System.out.println("Secound Max --> "+secoundMax);
    }
}
