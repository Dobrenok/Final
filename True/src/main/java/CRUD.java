import org.hibernate.Session;
import unt.UserEntity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CRUD {

    private Session session;

    public void createUser(String name, int age, int isAdmin) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Date date = new Date();
        UserEntity user = new UserEntity();
       // int id = findForId();
       // user.setId(id);
        user.setName(name);
        user.setAge(age);
        user.setIsAdmin(isAdmin);
        user.setCreatedData(new SimpleDateFormat("dd.mm.yyyy").format(date));
        session.save(user);
        session.getTransaction().commit();
    }

    private int findForId() {
        return 0;
    }

    private void deleteUser(Object o) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.delete(o);
        session.flush();
        session.getTransaction().commit();
    }

    public void updateUser(int id,String name, int age, int isAdmin) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        UserEntity user;
        user = (UserEntity) session.get(UserEntity.class,id);
        Date date = new Date();
        user.setName(name);
        user.setAge(age);
        user.setIsAdmin(isAdmin);
        user.setCreatedData(new SimpleDateFormat("dd.mm.yyyy").format(date));
        session.save(user);
        session.getTransaction().commit();

    }
}
