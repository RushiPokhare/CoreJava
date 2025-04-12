package file_Handling;

import java.io.File;

public class FH8_GetFileNames {
    public static void main(String[] args) {
        File file=new File("C:\\Users\\Rushi\\OneDrive\\Desktop\\IT-Shaala");
       String[] array= file.list();
       for (String fileName:array){
           System.out.println(fileName);
       }

    }
}
