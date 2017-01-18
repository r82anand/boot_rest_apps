/*
 * Copyright (c) 2017 Author(s). All rights reserved.
 * 
 * @Author	- Anand Sivadas
 * @Date	- 18 Jan, 2017
 * 
 * 
 */
package com.example.user.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * The Class UserView.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserView {

    /** The id. */
    private long id;
    
    /** The first name. */
    private String firstName;
    
    /** The last name. */
    private String lastName;
    
    /** The depart ment. */
    private String departMent;
    
    /** The messages. */
    private List<String> messages;
    
    /** The credit points. */
    private long creditPoints;

    /**
     * Gets the id.
     *
     * @return the id
     */
    public long getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(long id) {
		this.id = id;
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
	 * Sets the first name.
	 *
	 * @param firstName the new first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
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
	 * Sets the last name.
	 *
	 * @param lastName the new last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Gets the depart ment.
	 *
	 * @return the depart ment
	 */
	public String getDepartMent() {
		return departMent;
	}

	/**
	 * Sets the depart ment.
	 *
	 * @param departMent the new depart ment
	 */
	public void setDepartMent(String departMent) {
		this.departMent = departMent;
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
	 * Sets the messages.
	 *
	 * @param messages the new messages
	 */
	public void setMessages(List<String> messages) {
		this.messages = messages;
	}

	/**
	 * Gets the credit points.
	 *
	 * @return the credit points
	 */
	public long getCreditPoints() {
		return creditPoints;
	}

	/**
	 * Sets the credit points.
	 *
	 * @param creditPoints the new credit points
	 */
	public void setCreditPoints(long creditPoints) {
		this.creditPoints = creditPoints;
	}

	/**
	 * Instantiates a new user view.
	 */
	public UserView(){

    }

}
