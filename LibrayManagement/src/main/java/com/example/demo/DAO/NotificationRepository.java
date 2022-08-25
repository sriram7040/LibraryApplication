package com.example.demo.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Notifications;

@Repository
public interface NotificationRepository extends CrudRepository<Notifications, Long> {

}