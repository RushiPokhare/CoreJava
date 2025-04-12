package array;

public class Demo1 {
        public static void main(String[] args) {

//        CASE1 --> If we know the value
            int [] rushi={10,20,30,34,45};

//        rushi= refrance Variable
//        RHS=Object
            System.out.println(rushi);  //return --> Hexadecimal Number
            System.out.println(rushi.hashCode()); //return--> HashCode Number
//        it prints the hash code because of RHS side object and we know toString method return the HExadecimal number of the object here also same it return the hexadecimal number.




//        CASE2--> we dont's know the values to be stored.
            int[] aniket= new int[3];
//        array will be initialize with default values.


//        Object Contain the INSTANCE variable... legth vairibe is automatically created in the array
//        we access the instance varible using refrance varibale and here rushi is a instance varible
            System.out.println("Lenght of an array is "+rushi.length);

        }
    }


