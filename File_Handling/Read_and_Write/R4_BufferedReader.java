package File_Handling.Read_and_Write;

import java.io.*;
//    Reading from files-->Char
public class R4_BufferedReader {
    public static void main(String[] args) throws IOException {
        File file=new File("C:\\Users\\Rushi\\OneDrive\\Desktop\\abc.txt");
        FileReader fileReader=new FileReader(file);
        BufferedReader bufferedReader=new BufferedReader(fileReader);

        int value=bufferedReader.read();
        while(value!=-1){
            System.out.print((char)value);
            value=bufferedReader.read();
        }
        bufferedReader.close();
        fileReader.close();
    }
}
