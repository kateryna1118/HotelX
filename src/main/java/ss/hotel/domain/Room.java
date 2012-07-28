package ss.hotel.domain;

import java.io.Serializable;
import javax.persistence.*;


@Entity
@Table(name = "Room")
public class Room implements Serializable {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(nullable = false, name = "Number")
    private int number;

    @ManyToOne
    @JoinColumn(name = "Name")
    private RoomType roomType;

    //занят, в резерве или своболен
    //это как-то должно ссвязываться с конкретными номерами из Order
    //и с датами заказов
    @Column(nullable = false, name = "RoomState")
    private String roomState;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getRoomState() {
        return roomState;
    }

    public void setRoomState(String roomState) {
        this.roomState = roomState;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }


}
