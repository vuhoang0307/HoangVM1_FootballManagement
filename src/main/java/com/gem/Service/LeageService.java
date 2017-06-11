package com.gem.Service;

import com.gem.Model.Leage;

import java.util.List;

/**
 * Created by MINHHOANG-PC on 10/06/2017.
 */
public interface LeageService {
    public void addLeage(Leage l);
    public void updateLeage(Leage l);
    public List<Leage> listLeages();
    public Leage getLeageById(int id);
    public void removeLeage(int id);
}
