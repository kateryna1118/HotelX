
package ss.hotel.domain;

import java.io.Serializable;
import javax.persistence.*;


@Entity
@Table(name = "AddService")
public class AddService implements Serializable {
 @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

  @Column(name = "Name")
    private String name;

  //цена за единицу
    @Column(name = "Price")
    private double price;

 @Column(name = "Discription")
    private String discription;

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
