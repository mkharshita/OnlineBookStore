package com.capgemini.onlinebookstore.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserBookStore
{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private long userId;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private String userName;
	@Column
	private String emailId;
	@Column
	private String password;
	@Column
	private String mobileNumber;
	@Column
	private String userGender;
//	private List<Role> userRole;
//	private Cart cart;
//	private List<Payment> paymentList;
//	private List<Order> orderList;

	public long getUserId()
	{
		return userId;
	}

	public void setUserId(long userId)
	{
		this.userId = userId;
	}

	public String getUserName()
	{
		return userName;
	}

	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public String getEmailId()
	{
		return emailId;
	}

	public void setEmailId(String emailId)
	{
		this.emailId = emailId;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getMobileNumber()
	{
		return mobileNumber;
	}

	public void setMobileNumber(String phoneNumber)
	{
		this.mobileNumber = phoneNumber;
	}

	public String getUserGender()
	{
		return userGender;
	}

	public void setUserGender(String userGender)
	{
		this.userGender = userGender;
	}

//	public List<Role> getUserRole()
//	{
//		return userRole;
//	}
//
//	public void setUserRole(List<Role> userRole)
//	{
//		this.userRole = userRole;
//	}
//
//	public Cart getCart()
//	{
//		return cart;
//	}
//
//	public void setCart(Cart cart)
//	{
//		this.cart = cart;
//	}
//
//	public List<Payment> getPaymentList()
//	{
//		return paymentList;
//	}
//
//	public void setPaymentList(List<Payment> paymentList)
//	{
//		this.paymentList = paymentList;
//	}
//
//	public List<Order> getOrderList()
//	{
//		return orderList;
//	}
//
//	public void setOrderList(List<Order> orderList)
//	{
//		this.orderList = orderList;
//	}

}
