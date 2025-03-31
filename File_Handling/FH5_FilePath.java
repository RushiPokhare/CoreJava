package File_Handling;

import java.io.File;

public class FH5_FilePath {
    public static void main(String[] args) {
        File file=new File("C:\\Users\\Rushi\\OneDrive\\Desktop\\IT-Shaala\\abc.txt");
        System.out.println(file.getAbsoluteFile());
    }
}
