/*
 * Copyright (c) 2017 Author(s). All rights reserved.
 * 
 * @Author	- Anand Sivadas
 * @Date	- 18 Jan, 2017
 * 
 * 
 */
package com.example;

import java.util.ArrayList;
import java.util.List;

/**
 * The Class User.
 */
public class User {

    /** The id. */
    private final long id;
    
    /** The first name. */
    private final String firstName;
    
    /** The last name. */
    private final String lastName;
    
    /** The department. */
    private final String department;
    
    /** The messages. */
    private final List<String> messages;
    
    /** The points. */
    private final long creditPoints;
    
    /** The colleagues. */
    @Deprecated
    private final List<String> colleagues;

    /**
     * Gets the id.
     *
     * @return the id
     */
    public long getId() {
		return id;
	}

	/**
	 * Gets the first name.
	 *
	 * @return the first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Gets the last name.
	 *
	 * @return the last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Gets the department.
	 *
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * Gets the messages.
	 *
	 * @return the messages
	 */
	public List<String> getMessages() {
		return messages;
	}

	/**
	 * Gets the points.
	 *
	 * @return the points
	 */
	public long getCreditPoints() {
		return creditPoints;
	}

	/**
	 * Gets the colleagues.
	 *
	 * @return the colleagues
	 */
	public List<String> getColleagues() {
		return colleagues;
	}

	/**
	 * Instantiates a new user.
	 *
	 * @param id the id
	 */
	public User(int id) {
        String[] firstNames = {"Albert", "Diana", "Sara", "Thomas"};
        String[] lastNames = {"Cooper", "Poker", "Muller", "Peter"};
        String[] organisations = {"Hoffmans Ltd.", "Patric and Sons Inc."};

        firstName = firstNames[id%3];
        lastName = lastNames[id%4];
        department = organisations[id%2];
        messages= new ArrayList<>();
        messages.add("Your cab request has been approved!");
        messages.add("Sorry, we regret to inform that your can has been delayed by an hour.");
        messages.add("Sorry, we regret to inform that your cab has been cancelled.");
        messages.add("Your can request has been rescheduled to next hour. Thank you!");
        
        creditPoints = id * 31 % 1000;

        //You have no friends
        colleagues = new ArrayList<>();

        this.id = id;
    }

}
