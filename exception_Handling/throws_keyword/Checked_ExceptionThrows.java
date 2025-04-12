package exception_Handling.throws_keyword;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
// Refer NoteBook
//WE can directly write throws in caller method signature
public class Checked_ExceptionThrows {

    /* public static void main(String[] args) {
        File file=new File("abc.txt");
        try {
            FileInputStream fileInputStream=new FileInputStream(file);
             file.length();
        } catch (FileNotFoundException e) {
             System.out.println("file not found);
        }
    }*/


    public static void main(String[] args) throws FileNotFoundException {
//        if file not be found it generates a compile time exception
        File file=new File("abc.txt");
        FileInputStream fileInputStream=new FileInputStream(file);
        file.length();
    }

}
