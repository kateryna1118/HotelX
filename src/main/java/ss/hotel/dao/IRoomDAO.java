package ss.hotel.dao;

import java.util.List;
import ss.hotel.domain.Room;


/**
 *
 * @author Kateryna
 */
public interface IRoomDAO {
    public void addRoom(Room room);
	public void updateRoom(Room room);
	public void removeRoom(Long id);
	public Room getRoom(Long id);
	public List<Room> getAllRooms();

}
