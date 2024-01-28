package lk.ijse.config;


import lk.ijse.entity.Student;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.DriverManager;
import java.sql.SQLException;

public class FactoryCongfigaration {
    private static FactoryCongfigaration factoryCongfigaration;
    private SessionFactory sessionFactory;

    private FactoryCongfigaration() throws SQLException {

        Configuration configuration = new Configuration().configure()
                .addAnnotatedClass(Student.class);
        sessionFactory = configuration.buildSessionFactory();
    }

    public static FactoryCongfigaration getInstance() throws SQLException {
        return (factoryCongfigaration == null) ? factoryCongfigaration =
                new FactoryCongfigaration() : factoryCongfigaration;
    }

    public org.hibernate.Session getSession(){
        return sessionFactory.openSession();
    }

}
