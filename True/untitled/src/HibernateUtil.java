
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;




public class HibernateUtil {

    private static SessionFactory sessionFactory;

   static  {
       try {
           // Create the SessionFactory from hibernate.cfg.xml
          // sessionFactory = new Configuration().configure().buildSessionFactory();
           sessionFactory = new Configuration().configure().buildSessionFactory();
       } catch (Throwable ex) {
           // Make sure you log the exception, as it might be swallowed
           System.err.println("Initial SessionFactory creation failed." + ex);
           throw new ExceptionInInitializerError(ex);

       }
   }

        public static SessionFactory getSessionFactory() {
            return sessionFactory;
        }
    }

/**    private static SessionFactory ourSessionFactory;
    private static ServiceRegistry serviceRegistry;

    static {
        try {
            Configuration configuration = new Configuration();
            configuration.configure();

            serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
            ourSessionFactory = configuration.buildSessionFactory(serviceRegistry);
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

     protected static SessionFactory buildSessionFactory() {

        Configuration configuration = new Configuration();
        configuration.configure();

         serviceRegistry  = new ServiceRegistryBuilder()
                .configure() // configures settings from hibernate.cfg.xml
                .buildServiceRegistry();
        try {
            ourSessionFactory = configuration.buildSessionFactory(serviceRegistry);
        }
        catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
        return ourSessionFactory;
    }

    public static Session getSession() throws HibernateException {
        return ourSessionFactory.openSession();
    }


    public static void SessionFactory () {
        final Session session = getSession();
        try {
            System.out.println("querying all the managed entities...");
            final Map metadataMap = session.getSessionFactory().getAllClassMetadata();
            for (Object key : metadataMap.keySet()) {
                final ClassMetadata classMetadata = (ClassMetadata) metadataMap.get(key);
                final String entityName = classMetadata.getEntityName();
                final Query query = session.createQuery("from" + entityName);
                System.out.println("executing: " + query.getQueryString());
                for (Object o : query.list()) {
                    System.out.println("  " + o);
                }
            }
        } finally {
            session.close();
        }
    }*/


