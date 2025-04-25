package collection.wrapper_classes;

public class W1_autoboxing_unboxing {
    public static void main(String[] args) {
        byte value=10;

        Byte object=value; //Autoboxing -->Converting Primitive into Object Format

        Byte object1=object;//Unboxing -->Converting Wrapper Object into Primitive format

        System.out.println(value);
        System.out.println(object);
        System.out.println(object1);


//        If  we have String (Its non-primitive data type) Converting into Primitive or Wrapper Object format
        System.out.println("Parsing String");
        String str="12"; //we know this is a number, but we convert it into primitive format.... we can't type cast it.
        System.out.println(Byte.parseByte(str));
        System.out.println(Byte.valueOf(str));
    }
}
