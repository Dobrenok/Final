import org.hibernate.Session;
import unt.HibernateUtil;
import unt.UserEntity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CRUD {

   private Session session;

    public void createUser(String name, int age, int isAdmin)  {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Date date = new Date();
        UserEntity user = new UserEntity();
       // user.setId(id);
        user.setName(name);
        user.setAge(age);
        user.setIsAdmin(isAdmin);
        user.setCreatedData(new SimpleDateFormat("dd.mm.yyyy").format(date));
        session.save(user);
        session.getTransaction().commit();
    }

    private void deleteUser(Object o) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.delete(o);
        session.flush();
        session.getTransaction().commit();
    }

    private void updateUser(Object o)
    {


    }

}
