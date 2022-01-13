package com.notification.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@RestController
@RequestMapping(path="/api/notifications")
public class NotificationController {

	private static final Logger logger = LogManager.getLogger(NotificationController.class);
	
	@PostMapping("/{customerId}")
	public void publishNotification(@PathVariable int customerId) {
		logger.info("Notification published for customer id : - " + customerId);
	}
	
}
