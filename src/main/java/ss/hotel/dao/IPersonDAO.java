package ss.hotel.dao;

import java.util.List;
import ss.hotel.domain.Person;

/**
 *
 * @author Kateryna
 */
public interface IPersonDAO {
	public void addPerson(Person person);
	public void updatePerson(Person person);
	public void removePerson(Long id);
	public Person getPerson(Long id);
	public List<Person> getAllPersons();
}
