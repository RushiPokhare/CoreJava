package File_Handling.Read_and_Write;

import java.io.*;

//This is Check Performance of FileOutputStream VS BufferedOutputStream
public class CheckPerformance_FileOutputStream_AND_BufferedOutputStream {
    public static void main(String[] args) throws IOException {
        long fileOutputStream_Time=writeUsingFileOutputStream();
        long BufferedOutputStream_Time=writeUsingBufferedOutputStream();

        System.out.println("Difference is ::"+(fileOutputStream_Time-BufferedOutputStream_Time));

    }

    public static long writeUsingFileOutputStream() throws IOException {
        File file=new File("XYZ.txt");
        file.createNewFile();  //Create new File.in the intellij
        FileOutputStream fileOutputStream=new FileOutputStream(file);

        long startTime=System.currentTimeMillis();   // 1000 millis means 1 second


        for (int i = 0; i <=1000000; i++) {
            fileOutputStream.write('R');
        }

        long endTime=System.currentTimeMillis();

        fileOutputStream.close();
        long timeTaken=endTime-startTime;
        System.out.println("FileOutputStream Required time is :"+(endTime-startTime));

        return timeTaken;
    }

    private static long writeUsingBufferedOutputStream() throws IOException {
        File file=new File("C:\\Users\\Rushi\\IdeaProjects\\CoreJava\\XYZ.txt");
        FileOutputStream fileOutputStream =new FileOutputStream(file,true);
        BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(fileOutputStream);

        long startTime=System.currentTimeMillis();

        for (int i = 0; i <=1000000; i++) {
            bufferedOutputStream.write('A');
        }

        long endTime=System.currentTimeMillis();

        bufferedOutputStream.close();
        fileOutputStream.close();
        long timeTaken=endTime-startTime;
        System.out.println("BufferedOutputStream Required time is: "+(endTime-startTime));

        return timeTaken;
    }

}
