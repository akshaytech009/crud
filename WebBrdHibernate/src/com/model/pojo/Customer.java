
package com.model.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


	@Entity
	@Table(name="CustomerTable18060170")
	public class Customer {
		@Id 
		@GeneratedValue(strategy=GenerationType.TABLE) 
		private int customerId;
		@Column(nullable=false,unique=true,name="CUSTOMERCODE")
		private String customerCode;
		@Column(name="CUSTOMERNAME")
		private String customerName;
		@Column(name="CUSTOMERADDRESS1")
		private String customerAddress1;
		@Column(name="CUSTOMERADDRESS2")
		private String customerAddress2;
		@Column(name="CUSTOMERPINCODE")
		private int customerPinCode;
		@Column(name="EMAILADDRESS")
		private String emailAddress;
		@Column(name="CONTACTNUMBER")
		private long contactNumber;
		@Column(name="PRIMARYCONTACTPERSON")
		private String primaryContactPerson;
		@Column(name="RECORDSTATUS")
		private String recordStatus;
		@Column(name="ACTIVEINACTIVEFLAG")
		private String activeInactiveFlag;
		@Column(name="CREATEDATE")
		private Date createDate;
		@Column(name="CREATEDBY")
		private String createdBy;
		@Column(name="MODIFIEDDATE")
		private String modifiedDate;
		@Column(name="MODIFIEDBY")
		private String modifiedBy;
		@Column(name="AUTHORIZEDDATE")
		private String authorisedDate;
		@Column(name="AUTHORIZEDBY")
		private String authorisedBy;
		public int getCustomerId() {
			return customerId;
		}
		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}
		public String getCustomerCode() {
			return customerCode;
		}
		public void setCustomerCode(String customerCode) {
			this.customerCode = customerCode;
		}
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		public String getCustomerAddress1() {
			return customerAddress1;
		}
		public void setCustomerAddress1(String customerAddress1) {
			this.customerAddress1 = customerAddress1;
		}
		public String getCustomerAddress2() {
			return customerAddress2;
		}
		public void setCustomerAddress2(String customerAddress2) {
			this.customerAddress2 = customerAddress2;
		}
		public int getCustomerPinCode() {
			return customerPinCode;
		}
		public void setCustomerPinCode(int customerPinCode) {
			this.customerPinCode = customerPinCode;
		}
		public String getEmailAddress() {
			return emailAddress;
		}
		public void setEmailAddress(String emailAddress) {
			this.emailAddress = emailAddress;
		}
		public long getContactNumber() {
			return contactNumber;
		}
		public void setContactNumber(long contactNumber) {
			this.contactNumber = contactNumber;
		}
		public String getPrimaryContactPerson() {
			return primaryContactPerson;
		}
		public void setPrimaryContactPerson(String primaryContactPerson) {
			this.primaryContactPerson = primaryContactPerson;
		}
		public String getRecordStatus() {
			return recordStatus;
		}
		public void setRecordStatus(String recordStatus) {
			this.recordStatus = recordStatus;
		}
		public String getActiveInactiveFlag() {
			return activeInactiveFlag;
		}
		public void setActiveInactiveFlag(String activeInactiveFlag) {
			this.activeInactiveFlag = activeInactiveFlag;
		}
		public Date getCreateDate() {
			return createDate;
		}
		public void setCreateDate(Date createDate) {
			this.createDate = createDate;
		}
		public String getCreatedBy() {
			return createdBy;
		}
		public void setCreatedBy(String createdBy) {
			this.createdBy = createdBy;
		}
		public String getModifiedDate() {
			return modifiedDate;
		}
		public void setModifiedDate(String modifiedDate) {
			this.modifiedDate = modifiedDate;
		}
		public String getModifiedBy() {
			return modifiedBy;
		}
		public void setModifiedBy(String modifiedBy) {
			this.modifiedBy = modifiedBy;
		}
		public String getAuthorisedDate() {
			return authorisedDate;
		}
		public void setAuthorisedDate(String authorisedDate) {
			this.authorisedDate = authorisedDate;
		}
		public String getAuthorisedBy() {
			return authorisedBy;
		}
		public void setAuthorisedBy(String authorisedBy) {
			this.authorisedBy = authorisedBy;
		}
		public Customer(String customerCode,
				String customerName, String customerAddress1,
				String customerAddress2, int customerPinCode,
				String emailAddress, long contactNumber,
				String primaryContactPerson, String recordStatus,
				String activeInactiveFlag, Date createDate, String createdBy) {
			super();
			
			this.customerCode = customerCode;
			this.customerName = customerName;
			this.customerAddress1 = customerAddress1;
			this.customerAddress2 = customerAddress2;
			this.customerPinCode = customerPinCode;
			this.emailAddress = emailAddress;
			this.contactNumber = contactNumber;
			this.primaryContactPerson = primaryContactPerson;
			this.recordStatus = recordStatus;
			this.activeInactiveFlag = activeInactiveFlag;
			this.createDate = createDate;
			this.createdBy = createdBy;
			
		}
		public Customer() {
			
		}
		@Override
		public String toString() {
			return "Customer [customerId=" + customerId + ", customerCode="
					+ customerCode + ", customerName=" + customerName
					+ ", customerAddress1=" + customerAddress1
					+ ", customerAddress2=" + customerAddress2
					+ ", customerPinCode=" + customerPinCode
					+ ", emailAddress=" + emailAddress + ", contactNumber="
					+ contactNumber + ", primaryContactPerson="
					+ primaryContactPerson + ", recordStatus=" + recordStatus
					+ ", activeInactiveFlag=" + activeInactiveFlag
					+ ", createDate=" + createDate + ", createdBy=" + createdBy
					+ ", modifiedDate=" + modifiedDate + ", modifiedBy="
					+ modifiedBy + ", authorisedDate=" + authorisedDate
					+ ", authorisedBy=" + authorisedBy + "]";
		}
		
		
	}
	