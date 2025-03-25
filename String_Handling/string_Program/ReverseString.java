package String_Handling.string_Program;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Rushikesh,Aniket,Pravin";
        char [] charArray=str.toCharArray();
        for (int left=0,right=charArray.length-1;left<right;left++,right--){
            char temp=charArray[left];
            charArray[left]=charArray[right];
            charArray[right]=temp;
        }
        String reverse=new String(charArray);
        System.out.println(reverse);
    }
}
