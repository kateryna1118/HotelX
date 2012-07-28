/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ss.hotel.dao;

import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ss.hotel.domain.Person;

/**
 *
 * @author Kateryna
 */
@Repository
public class PersonDAO implements IPersonDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addPerson(Person person) {
        sessionFactory.getCurrentSession().save(person);
    }

    @Override
    public void updatePerson(Person person) {
        sessionFactory.getCurrentSession().update(person);
    }

    @Override
    public void removePerson(Long id) {
        Person toDelete = (Person) sessionFactory.getCurrentSession().
                get(Person.class, id);
        if (toDelete != null) {
            sessionFactory.getCurrentSession().delete(toDelete);
        }
    }

    @Override
    public Person getPerson(Long id) {
        Person toReturn = (Person) sessionFactory.getCurrentSession().
                get(Person.class, id);
        return toReturn;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Person> getAllPersons() {
        List<Person> persons = sessionFactory.getCurrentSession().
                createQuery("from Person").list();
        return persons;
    }
}
