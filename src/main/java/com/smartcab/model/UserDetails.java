package com.smartcab.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserDetails {
@Id	
private int userId;
/**
 * @return the userId
 */
public int getUserId() {
	return userId;
}
/**
 * @return the userName
 */
public String getUserName() {
	return userName;
}
/**
 * @param userId the userId to set
 */
public void setUserId(int userId) {
	this.userId = userId;
}
/**
 * @param userName the userName to set
 */
public void setUserName(String userName) {
	this.userName = userName;
}
private String userName;
	

}
