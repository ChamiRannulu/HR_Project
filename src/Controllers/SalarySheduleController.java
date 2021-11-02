/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Connection.Connector;
import Connection.HibernateUtil;
import Pojos.SalaryShedule;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class SalarySheduleController {

    private SalarySheduleController() {
    }

    private static final SalarySheduleController ssc = new SalarySheduleController();

    public static SalarySheduleController getInstance() {
        return ssc;
    }

    Session session = null;

    public void addSalaryDetails(SalaryShedule ss) {
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save(ss);
        tx.commit();
        session.close();
    }

    public void updateSalaryDetails(SalaryShedule ss) {
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.update(ss);
        tx.commit();
        session.close();
    }

    public void deleteSalaryDetails(SalaryShedule ss) {
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.delete(ss);
        tx.commit();
        session.close();
    }

    public List serchSalaryDetails() {
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        List<SalaryShedule> salary_shedule_list = new ArrayList<SalaryShedule>();

        salary_shedule_list = session.createCriteria(SalaryShedule.class).list();
        tx.commit();
        session.close();

        return salary_shedule_list;
    }

    public SalaryShedule serchSalaryDetailsByID(int id) {
        SalaryShedule ss = new SalaryShedule();
        try {
            Connection.Connector a = new Connector();

            a.getConnection();
            ResultSet rset = a.srh("SELECT * FROM salary_shedule WHERE staff_id = '" + id + "'");
            while (rset.next()) {

                ss.setSalarySheduleId(Integer.parseInt(rset.getString(1)));
                ss.setStaffId(Integer.parseInt(rset.getString(2)));
                ss.setBasicSalary(Double.parseDouble(rset.getString(3)));
                ss.setOverTimeAmount(Double.parseDouble(rset.getString(4)));
                ss.setAllowns(Double.parseDouble(rset.getString(5)));
            }

        } catch (Exception ex) {
            Logger.getLogger(SalarySheduleController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ss;
    }
}
