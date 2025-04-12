package file_Handling.read_and_Write;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class W2_FileWriter {
    public static void main(String[] args) throws IOException {
        File file=new File("C:\\Users\\Rushi\\IdeaProjects\\CoreJava\\XYZ.txt");
        FileWriter fileWriter=new FileWriter(file);
        fileWriter.write("This is written from the fileWriter.. we can write multiple character because this is used for writing a character");
        fileWriter.close();
        System.out.println("File Written Operation Successful");
    }
}
