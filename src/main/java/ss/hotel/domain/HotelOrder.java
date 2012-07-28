
package ss.hotel.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;


@Entity
@Table(name="Orders")
public class HotelOrder implements Serializable{
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //клиент
    @ManyToOne
    @JoinColumn(name = "ID")
    private Person person;

    @OneToMany(mappedBy="order")
    private Set<AddServiceHistory> addServiceHistory = new HashSet<AddServiceHistory>();

    @OneToOne(optional=false, cascade=CascadeType.ALL)
    private RoomType roomType;


    //это будет вбиваться руками конкретный номер при заселении
    //нужны корректировки по поводу roomState в Room
    @Column(nullable = true, name = "Number")
    private int number;

    //дата оказания поселения
    @Column(name = "DateIn")
    @Temporal( value = TemporalType.TIMESTAMP )
    private Date DateIn;

    //дата оказания поселения
    @Column(name = "DateOut")
    @Temporal( value = TemporalType.TIMESTAMP )
    private Date DateOut;

    //бронь - не уверена что это нужно
//    @Column(name = "Booking")
//    private double booking;

     //Баланс заказа - бронь+сумма по AddServiceHistory
    //в AddServiceHistory будет также и кол-во дней и по типу
    //цена в сутки
    @Column(name = "Balans")
    private double balans;

    public Date getDateIn() {
        return DateIn;
    }

    public void setDateIn(Date DateIn) {
        this.DateIn = DateIn;
    }

    public Date getDateOut() {
        return DateOut;
    }

    public void setDateOut(Date DateOut) {
        this.DateOut = DateOut;
    }

    public Set<AddServiceHistory> getAddServiceHistory() {
        return addServiceHistory;
    }

    public void setAddServiceHistory(Set<AddServiceHistory> addServiceHistory) {
        this.addServiceHistory = addServiceHistory;
    }

    public double getBalans() {
        return balans;
    }

    public void setBalans(double balans) {
        this.balans = balans;
    }

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

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }


}
