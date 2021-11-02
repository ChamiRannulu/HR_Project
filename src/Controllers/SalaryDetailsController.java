/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Connection.HibernateUtil;
import Pojos.SalaryDetails;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class SalaryDetailsController {

    Session session = null;

    private SalaryDetailsController() {
    }

    private static final SalaryDetailsController sdc = new SalaryDetailsController();

    public static SalaryDetailsController getInstance() {
        return sdc;
    }

    public void addSalaryDetails(SalaryDetails sd) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save(sd);
        tx.commit();
        session.close();
    }

    public void updateSalaryDetails(SalaryDetails sd) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.update(sd);
        tx.commit();
        session.close();
    }

    public void deleteSalaryDetails(SalaryDetails sd) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.delete(sd);
        tx.commit();
        session.close();
    }

    public List serchSalaryDetails() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        List<SalaryDetails> salary_details_list = new ArrayList<SalaryDetails>();

        salary_details_list = session.createCriteria(SalaryDetails.class).list();
        tx.commit();
        session.close();

        return salary_details_list;
    }

}
