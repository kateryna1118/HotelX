package ss.hotel.dao;
/**
 *
 * @author Kateryna
 */
import java.util.List;
import ss.hotel.domain.User;

public interface IUserDAO {
	public void addUser(User user);
	public void updateUser(User user);
	public void removeUser(Long id);
	public User getUser(Long id);
	public List<User> getAllUsers();
}
