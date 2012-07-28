
package ss.hotel.dao;

import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import ss.hotel.domain.Room;

/**
 *
 * @author Kateryna
 */
public class RoomDAO implements IRoomDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addRoom(Room room) {
        sessionFactory.getCurrentSession().save(room);
    }

    @Override
    public void updateRoom(Room room) {
        sessionFactory.getCurrentSession().update(room);
    }

    @Override
    public void removeRoom(Long id) {
        Room toDelete = (Room) sessionFactory.getCurrentSession().
				get(Room.class, id);
		if (toDelete != null) {
			sessionFactory.getCurrentSession().delete(toDelete);
		}
    }

    @Override
    public Room getRoom(Long id) {
      Room toReturn = (Room) sessionFactory.getCurrentSession().
				get(Room.class, id);
		return toReturn;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Room> getAllRooms() {
       List<Room> rooms = sessionFactory.getCurrentSession().
				createQuery("from Room").list();
		return rooms;
	}

}
