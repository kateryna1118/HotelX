package ss.hotel.domain;

import java.io.Serializable;
import javax.persistence.*;
/**
 *
 * @author Kateryna
 */
@Entity
@Table(name = "Users")
public class User implements Serializable {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name = "Login")
    private String login;

    @Column
    @ManyToOne
    @JoinColumn(name = "Name")
    private Role role;

  @Column(nullable = false, name="Password")
    private String password;

  @Column
    private String post;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {

        this.role = role;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }
}
