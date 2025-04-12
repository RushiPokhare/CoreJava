package file_Handling.serialization;

import lombok.*;

import java.io.*;

@AllArgsConstructor
@NoArgsConstructor
public class Transients implements Serializable {
    private int id;
    private String name;
    private transient String password;

    public static void main(String[] args) throws IOException {
        File file=new File("Transient.txt");
        Transients transients=new Transients(1,"Sudhir","sai");

        file.createNewFile();
        FileOutputStream fileOutputStream=new FileOutputStream(file);
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(transients);

        objectOutputStream.close();
        fileOutputStream.close();
        System.out.println("Object Added Success with TRANSIENT");
    }
}
