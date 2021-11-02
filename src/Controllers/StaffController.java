/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Connection.HibernateUtil;
import Pojos.Staff;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class StaffController {

    private StaffController() {
    }

    private static final StaffController sc = new StaffController();

    public static StaffController getInstance() {
        return sc;
    }

    Session session = null;

    public void addStaffDetails(Staff s) {
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save(s);
        tx.commit();
        session.close();
    }

    public void updateStaffDetails(Staff s) {
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.update(s);
        tx.commit();
        session.close();
    }

    public void deleteStaffDetails(Staff s) {
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.delete(s);
        tx.commit();
        session.close();
    }

    public List serchStaffDetails() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        List<Staff> staff_list = new ArrayList<Staff>();

        staff_list = session.createCriteria(Staff.class).list();
        tx.commit();
        session.close();

        return staff_list;
    }

}
