package file_Handling.serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
//SERIALIZATION
public class Serialization {
    public static void main(String[] args) throws IOException {
        Student studentSerialization =new Student(1,"Rushi","Rushi@123","Pune");
        File file =new File("Serialization.txt");
        file.createNewFile();

        FileOutputStream fileOutputStream=new FileOutputStream(file);
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(studentSerialization);

        objectOutputStream.close();
        fileOutputStream.close();

        System.out.println("Object Save Successfully");
    }
}
