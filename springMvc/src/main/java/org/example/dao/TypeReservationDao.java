package org.example.dao;

import org.example.model.TypereservationEntity;

import java.util.List;


public interface TypeReservationDao {
	

	TypereservationEntity getById(int id);
	List<TypereservationEntity> getAllTypeReservation();
	void addTypeReservation(TypereservationEntity tr);
	void removeTypeReservation(int id);
	TypereservationEntity updateTypeReservation(TypereservationEntity tr);
}
