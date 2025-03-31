package File_Handling;

import java.io.File;

public class FH4_DeleteFile {
    public static void main(String[] args) {
        File file=new File("C:\\Users\\Rushi\\OneDrive\\Desktop\\abc.txt");
        boolean isFileDeleted= file.delete();
        System.out.println("File Deleted :"+isFileDeleted);
    }
}
