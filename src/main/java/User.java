import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Book> booksList;

    public void setId(int id) {this.id = id;}
    public int getId() {return id;}
    public void setName(String name) {this.name = name;}
    public String getName() {return name;}
    public void setBooksList(List<Book> booksList) {this.booksList = booksList;}
    public List <Book> getBooksList() {return booksList;}

    public User() {}
    public User(String name) {this.name = name;}
}
