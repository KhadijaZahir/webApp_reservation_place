package org.example.service;

import org.example.dao.ReservationDao;
import org.example.dao.UtilisateurDao;
import org.example.model.ReservationEntity;
import org.example.model.UtilisateurEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Component("reservationService")
public class ReservationServiceImpl implements ReservationService {
	@Autowired
	private ReservationDao resDAO;

	@Override
	@Transactional
	public void addRes(ReservationEntity reservationEntity) {
		resDAO.addRes(reservationEntity);

	}

	@Override
	@Transactional
	public ReservationEntity getResById(int id) {
		return resDAO.getResById(id);
	}

	@Override
	@Transactional
	public List<ReservationEntity> getAllRes() {
		return resDAO.getAllRes();
	}

	@Override
	@Transactional
	public void deleteRes(int id) {
		resDAO.deleteRes(id);
	}

	@Override
	@Transactional
	public ReservationEntity updateRes(ReservationEntity reservation) {
		return resDAO.updateRes(reservation);
	}
}