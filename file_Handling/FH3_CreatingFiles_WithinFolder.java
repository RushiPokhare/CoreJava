package file_Handling;

import java.io.File;
import java.io.IOException;

public class FH3_CreatingFiles_WithinFolder {
    public static void main(String[] args) throws IOException {
//        Creating Multiple Files Within folder
        for (int i=0;i<=10;i++){
            String path="C:\\Users\\Rushi\\OneDrive\\Desktop\\IT-Shaala\\New-File"+i;
            File files=new File(path);
            files.createNewFile();
        }
        System.out.println("Files are Created");
    }
}
