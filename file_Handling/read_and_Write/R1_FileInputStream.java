package file_Handling.read_and_Write;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class R1_FileInputStream {
//    Reading from files-->Bytes
public static void main(String[] args) throws IOException {
    File file=new File("C:\\Users\\Rushi\\OneDrive\\Desktop\\abc.txt");
    FileInputStream fis=new FileInputStream(file);

    int value= fis.read();   //it stores char into int

    while (value!=-1){
        System.out.println((char) value);
        value=fis.read();
    }
        fis.close();
    }
}
