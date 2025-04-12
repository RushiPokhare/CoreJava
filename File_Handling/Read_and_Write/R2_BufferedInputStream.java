package File_Handling.Read_and_Write;

import java.io.*;

public class R2_BufferedInputStream {
    //    Reading from files-->Bytes
    public static void main(String[] args) throws IOException {
        File file=new File("C:\\Users\\Rushi\\OneDrive\\Desktop\\abc.txt");
        FileInputStream fis=new FileInputStream(file);
        BufferedInputStream bis=new BufferedInputStream(fis);

        int value=bis.read();
        while(value>=0){
            System.out.print((char)value);
            value=bis.read();
        }
        bis.close();
        fis.close();
    }
}
