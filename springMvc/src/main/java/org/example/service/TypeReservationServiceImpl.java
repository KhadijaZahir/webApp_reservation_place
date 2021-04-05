package org.example.service;

import org.example.dao.TypeReservationDaoImpl;
import org.example.dao.UtilisateurDao;
import org.example.model.TypereservationEntity;
import org.example.model.UtilisateurEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Component("typeReservationService")
public class TypeReservationServiceImpl implements TypeReservationService {

	@Autowired
	private TypeReservationDaoImpl typReseDAO;

	@Override
	@Transactional
	public TypereservationEntity getById(int id) {
		return typReseDAO.getById(id);
	}

	@Override
	@Transactional
	public List<TypereservationEntity> getAllTypeReservation() {
		return typReseDAO.getAllTypeReservation();
	}

	@Override
	@Transactional
	public void addTypeReservation(TypereservationEntity tr) {
		typReseDAO.addTypeReservation(tr);
	}

	@Override
	@Transactional
	public void removeTypeReservation(int id) {
		typReseDAO.removeTypeReservation(id);
	}

	@Override
	@Transactional
	public TypereservationEntity updateTypeReservation(TypereservationEntity tr) {
		return typReseDAO.updateTypeReservation(tr);
	}


}