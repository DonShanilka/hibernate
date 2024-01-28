package lk.ijse;


import lk.ijse.config.FactoryCongfigaration;
import lk.ijse.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Student student = new Student();

        student.setId(2);
        student.setName("Shanilka");
        student.setAddress("Maharagama");

        Session session = FactoryCongfigaration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.save(student);
        session.update(student);
        session.delete(student);
        session.remove(student);
        //session.

        System.out.println(session.get(Student.class,student.getId(2)));
        transaction.commit();
        session.close();
    }
}