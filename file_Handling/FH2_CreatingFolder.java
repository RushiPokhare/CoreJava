package file_Handling;

import java.io.File;

public class FH2_CreatingFolder {
    public static void main(String[] args) {
        File folder=new File("C:\\Users\\Rushi\\OneDrive\\Desktop\\IT-Shaala");
        boolean isFolderCreated=folder.mkdir();
        System.out.println("Folder is Created: "+isFolderCreated);

    }
}
