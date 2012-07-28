package ss.hotel.dao;

import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ss.hotel.domain.RoomType;

/**
 *
 * @author Kateryna
 */
@Repository
public class RoomTypeDAO implements IRoomTypeDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addRoomType(RoomType roomType) {
       sessionFactory.getCurrentSession().save(roomType);
    }

    @Override
    public void updateRoomType(RoomType roomType) {
        sessionFactory.getCurrentSession().update(roomType);
    }

    @Override
    public void removeRoomType(Long id) {
        RoomType toDelete = (RoomType) sessionFactory.getCurrentSession().
				get(RoomType.class, id);
		if (toDelete != null) {
			sessionFactory.getCurrentSession().delete(toDelete);
		}
    }

    @Override
    public RoomType getRoomType(Long id) {
       RoomType toReturn = (RoomType) sessionFactory.getCurrentSession().
				get(RoomType.class, id);
		return toReturn;
    }

    @Override
    public List<RoomType> getAllRoomTypes() {
       List<RoomType> roomTypes = sessionFactory.getCurrentSession().
				createQuery("from RoomType").list();
		return roomTypes;
	}
}
