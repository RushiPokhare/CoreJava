package file_Handling;

import java.io.File;
import java.io.IOException;

public class FH1_CreatingFile {
    public static void main(String[] args) throws IOException {
        //    Pass the path in Constructor Para
        File file=new File("C:\\Users\\Rushi\\OneDrive\\Desktop\\abc.txt");
        boolean isFileCreated= file.createNewFile();
        System.out.println("File Created :"+isFileCreated);
    }
}
