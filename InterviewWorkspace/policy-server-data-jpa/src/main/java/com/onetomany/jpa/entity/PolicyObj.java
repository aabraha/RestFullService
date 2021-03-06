package com.onetomany.jpa.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import org.hibernate.annotations.NamedQuery;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity
@NamedQuery(name = "PolicyObj.findByPolicyNumberAndBirthDate",
	query = "select po from PolicyObj po where po.policyNumber=?1 and po.birthDate=?2")
public class PolicyObj {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private int policyNumber;
	private LocalDate birthDate;
	private String firstName;
	private String lastName;
	private LocalDate startDate;
	private LocalDate endDate;
	// age = startDate - birthDate
	@Transient	
	private LocalDate age;
	
	@OneToMany(cascade= CascadeType.ALL, targetEntity = MailingAddress.class)
	@JoinColumn(name="policy_Obj_id")
	private List<MailingAddress> mailingAddresses;

}
