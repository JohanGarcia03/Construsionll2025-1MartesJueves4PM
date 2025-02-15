package app.domain.models;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Veterinarian extends Person {
    private String user;
    private String password;

    public Veterinarian(long personId, String name, int age, String rol, String user, String password) {
        super(personId, name, age, rol);
        this.user = user;
        this.password = password;
    }
}
