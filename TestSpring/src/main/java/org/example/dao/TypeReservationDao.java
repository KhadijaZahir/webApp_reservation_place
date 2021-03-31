package org.example.dao;

import java.util.List;

import org.example.model.TypereservationEntity;


public interface TypeReservationDao {
	

	TypereservationEntity getById(int id);
	List<TypereservationEntity> getAllTypeReservation();
	void addTypeReservation(TypereservationEntity tr);
	void removeTypeReservation(int id);
	TypereservationEntity updateTypeReservation(TypereservationEntity tr);
}
