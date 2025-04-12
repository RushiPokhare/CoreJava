package File_Handling.Read_and_Write;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
//    Reading from files-->Char
public class R3_FileReader {
    public static void main (String[] args) throws IOException {
        File file=new File("C:\\Users\\Rushi\\OneDrive\\Desktop\\abc.txt");
        FileReader fr=new FileReader(file);
        int value=fr.read();

//        also used while(value>=0)
        while(value!=-1){
            System.out.print((char) value);
            value=fr.read();
        }
    fr.close();
    }
}
