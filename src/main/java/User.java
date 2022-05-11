import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    public void setId(int id) {this.id = id;}
    public int getId() {return id;}
    public void setName(String name) {this.name = name;}
    public String getName() {return name;}

    public User() {}
    public User(String name) {this.name = name;}
}
