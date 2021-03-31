package org.example.dao;

import java.util.List;

import org.example.model.ReservationEntity;




public interface ReservationDao {
	

    public void addRes(ReservationEntity reservationEntity);
    public ReservationEntity getResById(int id);
    public List<ReservationEntity> getAllRes();
    public void deleteRes(int id);
    public ReservationEntity updateRes(ReservationEntity reservation);
}