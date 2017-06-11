package com.gem.Service.Impl;

import com.gem.DAO.LeageDAO;
import com.gem.Model.Leage;
import com.gem.Service.LeageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by MINHHOANG-PC on 10/06/2017.
 */
@Service
public class LeageServiceImpl implements LeageService {
    @Autowired
    private LeageDAO leageDAO;

    public void setLeageDAO(LeageDAO leageDAO) {
        this.leageDAO = leageDAO;
    }

    @Override
    @Transactional
    public void addLeage(Leage l) {
        this.leageDAO.addLeage(l);
    }

    @Override
    @Transactional
    public void updateLeage(Leage l) {
        this.leageDAO.updateLeage(l);
    }

    @Override
    @Transactional
    public List<Leage> listLeages() {
        return this.leageDAO.listLeages();
    }

    @Override
    @Transactional
    public Leage getLeageById(int id) {
        return this.leageDAO.getLeageById(id);
    }

    @Override
    @Transactional
    public void removeLeage(int id) {
        this.leageDAO.removeLeage(id);
    }
}
