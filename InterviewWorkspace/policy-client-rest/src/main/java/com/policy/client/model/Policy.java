package com.policy.client.model;

import java.time.LocalDate;
import java.util.List;


public class Policy {
	
	private int policyNumber;
	private LocalDate birthDate;
	private String firstName;
	private String lastName;
	private LocalDate startDate;
	private LocalDate endDate;
	
	private LocalDate age;

	private List<MailingAddress> mailingAddresses;

	public Policy() {

	}

	public int getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(int policyNumber) {
		this.policyNumber = policyNumber;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public LocalDate getAge() {
		return age;
	}

	public void setAge(LocalDate age) {
		this.age = age;
	}

	public List<MailingAddress> getMailingAddresses() {
		return mailingAddresses;
	}

	public void setMailingAddresses(List<MailingAddress> mailingAddresses) {
		this.mailingAddresses = mailingAddresses;
	}

	@Override
	public String toString() {
		return "Policy [policyNumber=" + policyNumber + ", birthDate=" + birthDate + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", startDate=" + startDate + ", endDate=" + endDate + ", age=" + age
				+ ", mailingAddresses=" + mailingAddresses + "]";
	}
	
	
	

}
