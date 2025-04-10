package File_Handling.Read_and_Write;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class RW1_FileInputStream {
//    Reading from files-->Bytes
public static void main(String[] args) throws IOException {
    File file=new File("C:\\Users\\Rushi\\OneDrive\\Desktop\\abc.txt");
    FileInputStream fis=new FileInputStream(file);

    int read= fis.read();   //it stores char into int

    while (read!=-1){
        
    }

    }
}
