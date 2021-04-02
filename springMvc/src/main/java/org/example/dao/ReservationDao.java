package org.example.dao;

import org.example.model.ReservationEntity;

import java.util.List;


public interface ReservationDao {
	

    public void addRes(ReservationEntity reservationEntity);
    public ReservationEntity getResById(int id);
    public List<ReservationEntity> getAllRes();
    public void deleteRes(int id);
    public ReservationEntity updateRes(ReservationEntity reservation);
}