package ss.hotel.dao;

import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import ss.hotel.domain.Room;

/**
 *
 * @author Kateryna
 */
@ContextConfiguration("/test-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
public class RoomDAOTest {

    @Autowired
    private IRoomDAO roomDAO;

    @Ignore
    @Test
    public void testSave() throws Exception {
        Room room = new Room();
        room.setNumber(1);
        room.setRoomState("free");

        System.out.println(room);
        roomDAO.addRoom(room);
        List<Room> roleList = roomDAO.getAllRooms();

        Assert.assertEquals(room, roleList.get(roleList.size() - 1));
        Assert.assertEquals(room.getNumber(),
                roleList.get(roleList.size() - 1).getNumber());
    }

    @Ignore
    @Test
    public void testGet() throws Exception {

        Room room = new Room();
        room.setNumber(1);
        room.setRoomState("free");

        roomDAO.addRoom(room);
        List<Room> rolelList = roomDAO.getAllRooms();

        Room loadedRoom = rolelList.get(rolelList.size() - 1);
        Long loadedId = loadedRoom.getId();
        Assert.assertEquals(loadedRoom, roomDAO.getRoom(loadedId));
    }
}
