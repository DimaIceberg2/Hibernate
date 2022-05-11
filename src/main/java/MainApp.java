import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainApp {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure()
                .addAnnotatedClass(Book.class)
                .addAnnotatedClass(User.class)
                .buildSessionFactory();

        Session session = null;

        session = sessionFactory.getCurrentSession();
        session.beginTransaction();

        Book book = new Book("Book#1");
        session.save(book);

        session.getTransaction().commit();

        session.close();
        sessionFactory.close();
    }
}
