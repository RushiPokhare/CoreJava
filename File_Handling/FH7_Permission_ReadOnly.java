package File_Handling;

import java.io.File;

public class FH7_Permission_ReadOnly {
    public static void main(String[] args) {
        File file=new File("C:\\Users\\Rushi\\OneDrive\\Desktop\\IT-Shaala\\abc.txt");
        file.setWritable(false);
        System.out.println("File Permission Read Only");
    }
}
