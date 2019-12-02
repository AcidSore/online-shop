package persist.model;
import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
@Table(name = "users")
@Data
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable =false)
    private Long id;

    @Column(name = "name",nullable = false)
    private String userName;

    @Column(name = "login", nullable = false)
    private String login;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "address")
    private String address;

    @Column(name = "role",nullable = false)
    private Integer role;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "roles",
            joinColumns = @JoinColumn(name = "role"),
            inverseJoinColumns = @JoinColumn(name = "id"))
    private List<Role> roles;

    public User() {
    }

    public User(String userName, String login, String password, String email ) {
        this.userName = userName;
        this.login = login;
        this.password = password;
        this.email = email;
    }

    public User(String userName, String password, String email, List<Role> roles) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", userName='" + userName + '\'' + ", password='" + "*********" + '\''
                + ", firstName='" + '\'' + ", email='" + email + '\''
                + ", roles=" + roles + '}';
    }

}
