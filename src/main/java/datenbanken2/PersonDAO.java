package datenbanken2;

public interface PersonDAO {
    Person getPerson(int id);

    void updatePerson(Person person);

    void deletePerson(Person person);

    void addPerson(Person person);
}
