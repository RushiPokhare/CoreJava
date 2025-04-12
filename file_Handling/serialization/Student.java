package file_Handling.serialization;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Student implements Serializable {
    private int id;
    private String name;
    private String password;
    private String address;
}
