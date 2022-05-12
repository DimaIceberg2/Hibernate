import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;

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

        User user = new User("Author#1");
        Book book = new Book("Book#1", user);
        user.setBooksList(Arrays.asList(book));
        session.save(user);

        session.getTransaction().commit();

        session.close();
        sessionFactory.close();
    }
}
