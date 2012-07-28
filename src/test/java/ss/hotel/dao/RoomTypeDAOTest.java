package ss.hotel.dao;

import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import ss.hotel.domain.RoomType;

/**
 *
 * @author Kateryna
 */
@ContextConfiguration("/test-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
public class RoomTypeDAOTest {

    @Autowired
    private IRoomTypeDAO roomTypeDAO;

    @Ignore
    @Test
    public void testSave() throws Exception {
        RoomType roomType = new RoomType();
        roomType.setName("Lux");
        roomType.setNumberOfPlaces(2);

        System.out.println(roomType);
        roomTypeDAO.addRoomType(roomType);
        List<RoomType> roleList = roomTypeDAO.getAllRoomTypes();
        Assert.assertEquals(roomType, roleList.get(roleList.size() - 1));
        Assert.assertEquals(roomType.getName(),
                roleList.get(roleList.size() - 1).getName());
    }

    @Ignore
    @Test
    public void testGet() throws Exception {

        RoomType roomType = new RoomType();
        roomType.setName("Lux");
        roomType.setNumberOfPlaces(2);

        roomTypeDAO.addRoomType(roomType);
        List<RoomType> roomlList = roomTypeDAO.getAllRoomTypes();

        RoomType loadedRoomType = roomlList.get(roomlList.size() - 1);
        Long loadedId = loadedRoomType.getId();
        Assert.assertEquals(loadedRoomType, roomTypeDAO.getRoomType(loadedId));
    }
}
