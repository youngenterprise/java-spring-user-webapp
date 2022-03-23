package company.MyWebapp.user;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false, unique = true, length=15)
    private String email;
    @Column(length=15, nullable = false)
    private String password;
    @Column(length=45, nullable = false)
    private String firstName;
    @Column(length=45, nullable = false)
    private String lastName;

}
