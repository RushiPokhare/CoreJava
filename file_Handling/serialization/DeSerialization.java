package file_Handling.serialization;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file=new File("C:\\Users\\Rushi\\IdeaProjects\\CoreJava\\Serialization.txt");
        FileInputStream fileInputStream=new FileInputStream(file);
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);

        Student student=(Student)objectInputStream.readObject();
        System.out.println(student);
        objectInputStream.close();
        fileInputStream.close();
    }
}
