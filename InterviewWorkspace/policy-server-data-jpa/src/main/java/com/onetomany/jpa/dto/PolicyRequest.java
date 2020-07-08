package com.onetomany.jpa.dto;

import com.onetomany.jpa.entity.PolicyObj;
import com.onetomany.jpa.entity.MailingAddress;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class PolicyRequest {
	
	private PolicyObj policyObj;

}
