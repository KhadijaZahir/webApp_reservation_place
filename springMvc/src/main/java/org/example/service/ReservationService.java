package org.example.service;


import org.example.model.ReservationEntity;
import org.example.model.UtilisateurEntity;

import java.util.List;

public interface ReservationService {
	public void addRes(ReservationEntity reservationEntity);
	public ReservationEntity getResById(int id);
	public List<ReservationEntity> getAllRes();
	public void deleteRes(int id);
	public ReservationEntity updateRes(ReservationEntity reservation);

}