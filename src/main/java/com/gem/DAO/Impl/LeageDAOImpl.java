package com.gem.DAO.Impl;

import com.gem.DAO.LeageDAO;
import com.gem.Model.Leage;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by MINHHOANG-PC on 10/06/2017.
 */
@Repository
public class LeageDAOImpl implements LeageDAO {
    private Session session;
    private static final Logger logger = LoggerFactory.getLogger(LeageDAO.class);

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf) {
        this.sessionFactory = sf;
    }

    @Override
    public void addLeage(Leage l) {
        session = this.sessionFactory.getCurrentSession();
        session.persist(l);
        logger.info("Leage saved successfully, Leage Details=" + l);
    }

    @Override
    public void updateLeage(Leage l) {
        session = this.sessionFactory.getCurrentSession();
        session.update(l);
        logger.info("Leage saved successfully, Leage Details=" + l);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Leage> listLeages() {
        session = this.sessionFactory.getCurrentSession();
        List<Leage> leagesList = session.createQuery("from Leage").list();
        for (Leage l : leagesList) {
            logger.info("Leage List::" + l);
        }
        return leagesList;
    }

    @Override
    public Leage getLeageById(int id) {
        session = this.sessionFactory.getCurrentSession();
        Leage l = (Leage) session.load(Leage.class, new Integer(id));
        logger.info("Leage loaded successfully, Leage details=" + l);
        return l;
    }

    @Override
    public void removeLeage(int id) {
        session = this.sessionFactory.getCurrentSession();
        Leage l = (Leage) session.load(Leage.class, new Integer(id));
        if (null != l) {
            session.delete(l);
        }
        logger.info("Leage deleted successfully, Leage details=" + l);
    }
}
