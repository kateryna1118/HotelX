package ss.hotel.domain;

import java.io.Serializable;
import javax.persistence.*;


@Entity
@Table(name = "RoomType")
public class RoomType implements Serializable {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Name")
    private String name;

    @Column(name = "RoomsView")
    private String RoomsView;

    @Column(name = "NumberOfPlaces")
    private int numberOfPlaces;

//количество комнат
    @Column(name = "NumberOfRooms")
    private int numberOfRooms;
//цена в сутки
    @Column(name = "Price")
    private double price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPlaces() {
        return numberOfPlaces;
    }

    public void setNumberOfPlaces(int numberOfPlaces) {
        this.numberOfPlaces = numberOfPlaces;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getRoomsView() {
        return RoomsView;
    }

    public void setRoomsView(String RoomsView) {
        this.RoomsView = RoomsView;
    }


}
