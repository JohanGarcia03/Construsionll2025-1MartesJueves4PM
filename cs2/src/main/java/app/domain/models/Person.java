package app.domain.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Person {

    private long PersonId;
    private String Name;
    private int Age;
    private String Rol;

    public Person(long personId, String name, int age, String rol) {
        PersonId = personId;
        Name = name;
        Age = age;
        Rol = rol;
    }
}


