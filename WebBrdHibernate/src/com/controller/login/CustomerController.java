package com.controller.login;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.SessionFactory;

import com.model.pojo.Customer;
import com.model.pojo.ProfileUser;
import com.model.pojo.User;
import com.persistance.dao.UserReg;
import com.persistance.dao.UserRegImpl;

@WebServlet("/CustomerController")
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	SessionFactory sf=null;
	@Override
	public void init(ServletConfig config) throws ServletException {
		
		super.init(config);
		sf=(SessionFactory) getServletContext().getAttribute("sessionfactory");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String operation=request.getParameter("operation");
		System.out.println(operation);
		if(operation.equals("new"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/jsp/newcustomer.jsp");
			rd.forward(request, response);
		}
		else if(operation.equals("viewall"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/jsp/askcustomercode1.jsp");
			rd.forward(request, response);
		}
		else if(operation.equals("viewsingle"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/jsp/askcustomercode.jsp");
			rd.forward(request, response);
		}
		else if(operation.equals("update"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/jsp/askcustomercode2.jsp");
			rd.forward(request, response);
		}
		else if(operation.equals("delete"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/jsp/askcustomercode3.jsp");
			rd.forward(request, response);
		}
		else if(operation.equals("logout"))
		{
			HttpSession hs=request.getSession(false);
			hs.invalidate();
			request.setAttribute("msg1", "Logout Done Successfully");
			  RequestDispatcher rd=request.getRequestDispatcher("Login");
			  rd.forward(request, response);
			
		}
		else if(operation.equals("roar"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("WEB-INF/jsp/registeruser.jsp");
			rd.forward(request, response);
		}
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String s=request.getParameter("operation");
		if(s.equals("hello"))
		{
			String customercode=request.getParameter("customercode");
			viewUser(request,response,customercode);
		}
		else if(s.equals("hye"))
		{
			
		
		String custcode=request.getParameter("custcode");
		String custname=request.getParameter("custname");
		String custaddress1=request.getParameter("custaddress1");
		String custaddress2=request.getParameter("custaddress2");
		int custpincode=Integer.parseInt(request.getParameter("custpincode"));
		String custemail=request.getParameter("custemail");
		long custnumber=Long.parseLong(request.getParameter("custnumber"));
		String custcontperson=request.getParameter("custcontperson");
		String custrecordstatus=request.getParameter("custrecordstatus");
		String flag=request.getParameter("flag");
		
		
		
		
	
		HttpSession hs=request.getSession(false);
		String createdby=(String) hs.getAttribute("userid");
		
		
		Date CreatedDate=new Date();
		Customer cust=new Customer(custcode, custname, custaddress1, custaddress2, custpincode, custemail, custnumber, custcontperson, custrecordstatus, flag, CreatedDate, createdby);
		
		UserReg userdao=new UserRegImpl(sf);
		boolean c=userdao.addUser(cust);
		
		if(c)
		{
			RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/jsp/maker.jsp");
			rd.forward(request, response);
			
			
		}
		
	}
		else if(s.equals("yoyo"))
		{
			String customercode=request.getParameter("customercode1");
			viewUserAll(request,response,customercode);
			
			
		}
		else if(s.equals("poke"))
		{
			String customercode=request.getParameter("customercode2");
			updateUser(request,response,customercode);
			
		}
		else if(s.equals("off"))
		{
			String customercode=request.getParameter("customercode3");
			deleteCustomer(request,response,customercode);
			
		}
		else if(s.equals("gogo"))
		{
			String username=request.getParameter("username");
			String userpass=request.getParameter("userpass");
			//String roleid=request.getParameter("selection");
			ProfileUser pu=new ProfileUser("maker");
			
			
				User user=new User(username,userpass);
				
				UserReg ur=new 	UserRegImpl(sf);
				boolean a=ur.insert(user);
				if(a)
				{
					request.setAttribute("msg1", "Registered Succesfully");
					RequestDispatcher rd=request.getRequestDispatcher("WEB-INF/jsp/login.jsp");
					rd.forward(request, response);
				}
				
			
		}
		
		
		else if(s.equals("joke"))
		{
			String custid=request.getParameter("custid");
			String custcode=request.getParameter("custcode");
			String custname=request.getParameter("custname");
			String custaddress1=request.getParameter("custaddress1");
			String custaddress2=request.getParameter("custaddress2");
			int custpincode=Integer.parseInt(request.getParameter("custpincode"));
			String custemail=request.getParameter("custemail");
			long custnumber=Long.parseLong(request.getParameter("custnumber"));
			String custcontperson=request.getParameter("custcontactper");
			String custrecordstatus=request.getParameter("custrecordstatus");
			String flag=request.getParameter("flag");
			
			HttpSession hs=request.getSession(false);
			String createdby=(String) hs.getAttribute("userid");
			
			
			Date CreatedDate=new Date();
			
			Customer customer=new Customer(custcode, custname, custaddress1, custaddress2, custpincode, custemail, custnumber, custcontperson, custrecordstatus, flag, CreatedDate, createdby);
			
			UserReg userdao=new UserRegImpl(sf);
			boolean x=userdao.updateCustomer(customer);
			if(x)
			{
				RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/jsp/maker.jsp");
				rd.forward(request, response);
				
				
			}
			
		}
	}
private void deleteCustomer(HttpServletRequest request,HttpServletResponse response, String customercode)throws ServletException, IOException {
	UserReg userdao=new UserRegImpl(sf);
	
	boolean y=userdao.deleteCustomer(customercode);
	if(y)
	{
		RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/jsp/login.jsp");
		rd.forward(request, response);
	}
		
	
	}

private void updateUser(HttpServletRequest request,HttpServletResponse response, String customercode)throws ServletException, IOException {
		
		UserReg userdao=new UserRegImpl(sf);
		Customer cust=userdao.validateuser(customercode);
		request.setAttribute("customer", cust);
		
		RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/jsp/update.jsp");
		rd.forward(request, response);
	
	
		
	}

private void viewUserAll(HttpServletRequest request,HttpServletResponse response, String customercode)throws ServletException, IOException  {
		
		UserReg userdao=new UserRegImpl(sf);
		List<Customer> cust=userdao.validateAllUser();
	    request.setAttribute("customer", cust);
		RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/jsp/viewAllcustomer.jsp");
		rd.forward(request, response);
		
	}

public void viewUser(HttpServletRequest request, HttpServletResponse response,String customercode) throws ServletException, IOException {
		
	UserReg userdao=new UserRegImpl(sf);
	Customer cust=userdao.validateuser(customercode);
	request.setAttribute("customer", cust);
		RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/jsp/viewcustomer.jsp");
		rd.forward(request, response);
		

	
	
	}


}
