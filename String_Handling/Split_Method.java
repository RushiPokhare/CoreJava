package String_Handling;

public class Split_Method {
    public static void main(String[] args) {
        String str = "Rushikesh,Aniket,Pravin";

//        delimeter(,)
//        we seprate the string by delimeter and here delimeter is (,)
        String[] array = str.split(",");
        for (String temp : array) {
            System.out.println(temp);
        }
    }
}