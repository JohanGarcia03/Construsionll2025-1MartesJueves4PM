package app.ports;

import app.domain.models.Person;
import app.domain.models.User;

public interface UserPort {
    public boolean existUserName(User user);

}
