package org.example.service;


import org.example.model.TypereservationEntity;
import org.example.model.UtilisateurEntity;

import java.util.List;

public interface TypeReservationService {

	TypereservationEntity getById(int id);
	List<TypereservationEntity> getAllTypeReservation();
	void addTypeReservation(TypereservationEntity tr);
	void removeTypeReservation(int id);
	TypereservationEntity updateTypeReservation(TypereservationEntity tr);

}