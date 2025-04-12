package array;
// find an element in given array
public class LinearSearch {
    public static void main(String[] args) {
        int [] array={10,11,12,13,24,101};
        int Element=101;
        boolean isFound=false;

        for (int index = 0; index < array.length; index++) {
            if (Element==array[index]){
                isFound=true;
                break;
            }
        }
        System.out.println(isFound?"element is found":"element not found");

    }
}
