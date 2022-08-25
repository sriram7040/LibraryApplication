package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.NotificationRepository;
import com.example.demo.entities.Notifications;

@Service
public class NotificationService {

	@Autowired
	NotificationRepository notifRepo;
	
	public void save (Notifications notification) {
		notifRepo.save(notification);
	}
	
	public void saveById (Long id) {
		Notifications notification = notifRepo.findById(id).get();
		notifRepo.save(notification);
	}
	
	public List<Notifications> findAll(){
		List<Notifications> notifications = (ArrayList<Notifications>) notifRepo.findAll();
		return notifications;
	}
	
	public void deleteById(Long id) {
		notifRepo.deleteById(id);
	}
}
