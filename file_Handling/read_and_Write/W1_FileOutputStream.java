package file_Handling.read_and_Write;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
//    Writing to the files-->BYTE
public class W1_FileOutputStream {
    public static void main(String[] args) throws IOException {
        File file=new File("XYZ.txt");
        file.createNewFile();  //Create new File.in the intellij
        FileOutputStream fileOutputStream=new FileOutputStream(file);
        fileOutputStream.write('R'); //**Here we Only give OneCharacter because this is used for BYTE only
        fileOutputStream.close();
        System.out.println("File Write Operation Done");
    }
}
