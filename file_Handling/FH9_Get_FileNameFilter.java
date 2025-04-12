package file_Handling;

import java.io.File;
import java.io.FilenameFilter;

public class FH9_Get_FileNameFilter {
    public static void main(String[] args) {
        File file=new File("C:\\Users\\Rushi\\OneDrive\\Desktop\\IT-Shaala");
        FilenameFilter filenameFilter=(dir,name)->name.startsWith("New-File10");
        String[] array= file.list(filenameFilter);
        for (String fileName:array){
           System.out.println(fileName);
       }
    }
}
