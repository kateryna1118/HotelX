package ss.hotel.domain;

import java.io.Serializable;
import javax.persistence.*;


@Entity
@Table(name = "Person")
public class Person implements Serializable {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name = "FName")
    private String fName;

    @Column(name = "LName")
    private String lName;

    @Column(name = "Email")
    private String email;

    @Column(name = "Phon")
    private int phon;

    @OneToOne(optional=false, cascade=CascadeType.ALL)
    private User user;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getPhon() {
        return phon;
    }

    public void setPhon(int phon) {
        this.phon = phon;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
