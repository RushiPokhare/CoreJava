package file_Handling.read_and_Write;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class W4_BufferedWriter {
    public static void main(String[] args) throws IOException {
        File file =new File("C:\\Users\\Rushi\\IdeaProjects\\CoreJava\\XYZ.txt");
        FileWriter fileWriter=new FileWriter(file,true);
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);

        System.out.println();
        bufferedWriter.write("<----Append in the file using-->BufferedWriter, for appending Purpose simple write TRUE after file parameter in FileWriter");

        bufferedWriter.close();
        fileWriter.close();
        System.out.println("Write Operation Done");
    }
}
