import org.hibernate.Session;
import unt.UserEntity;

import java.util.Calendar;

public class CRUD {

   private Session session;

    public void createUser(String name, int age, int isAdmin)  {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Calendar calendar = Calendar.getInstance();
        UserEntity user = new UserEntity();
       // user.setId(id);
        user.setName(name);
        user.setAge(age);
        user.setIsAdmin(isAdmin);
        user.setCreatedData(calendar.toString());
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
