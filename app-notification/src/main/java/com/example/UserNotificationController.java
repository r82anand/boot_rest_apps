/*
 * Copyright (c) 2017 Author(s). All rights reserved.
 * 
 * @Author	- Anand Sivadas
 * @Date	- 18 Jan, 2017
 * 
 * 
 */
package com.example;

import com.example.user.dto.UserView;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * The Class UserNotificationController.
 */
@RestController
public class UserNotificationController {

	/** The user service url. */
	@Value("${userservice.url}")
	private  String userServiceURL;

    /**
     * Gets the user.
     *
     * @param id the id
     * @return the user
     */
    @RequestMapping("/notification")
    public String getUser(@RequestParam(value="id", defaultValue="1") int id) {
        RestTemplate restTemplate = new RestTemplate();
        UserView user = restTemplate.getForObject(userServiceURL+id, UserView.class);
        String response = "NOTIFICATIONS: ";
        int number = 1;
        for(String message : user.getMessages()){
            response += "<BR> Message number "+(number++)+": "+message;
        }
        return response;
    }

}
