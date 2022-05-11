import javax.persistence.*;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "title")
    private String title;

    public void setId(int id) {this.id = id;}
    public int getId() {return id;}
    public void setTitle(String title) {this.title = title;}
    public String getTitle() {return title;}

    public Book() {}
    public Book(String title) {this.title = title;}
}
