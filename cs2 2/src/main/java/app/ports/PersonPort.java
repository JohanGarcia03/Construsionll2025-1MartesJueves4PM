package app.ports;

import app.domain.models.Person;

public interface PersonPort {
    public boolean existPerson(Person person);
}
