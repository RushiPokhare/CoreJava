package file_Handling.read_and_Write;

import java.io.*;

public class W3_BufferedOutputStream {
    public static void main(String[] args) throws IOException {
        File file=new File("C:\\Users\\Rushi\\IdeaProjects\\CoreJava\\XYZ.txt");
        FileOutputStream fileOutputStream =new FileOutputStream(file,true);
        BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(fileOutputStream);

        bufferedOutputStream.write('A');
        bufferedOutputStream.close();
        fileOutputStream.close();
        System.out.println("Written Char Operation Done using--> BufferedOutputStream");
    }
}
