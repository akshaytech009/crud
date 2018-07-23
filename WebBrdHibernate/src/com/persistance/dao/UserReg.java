package com.persistance.dao;

import com.model.pojo.Customer;
import java.util.*;
import com.model.pojo.User;

public interface UserReg {

	boolean insert(User user);
    boolean validate(String userid, String userpass);
    boolean addUser(Customer cust);
	Customer validateuser(String customercode);
	List<Customer> validateAllUser();
	Customer validateupdate(String customercode);
	boolean updateCustomer(Customer cust);
	
	boolean deleteCustomer(String customercode);

}
