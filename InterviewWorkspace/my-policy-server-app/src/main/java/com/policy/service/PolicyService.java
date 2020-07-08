package com.policy.service;

import java.util.List;

import com.policy.entity.PolicyName;

public interface PolicyService {
	
	// delegate get all
	public List<PolicyName> getPolicies();
	
	// delegate get a single
	public PolicyName getPolicy(int theId);
		
	// delegate save or update
	public void savePolicy(PolicyName thePolicy);
	
	// delegate delete
	public void deletePolicy(int theId);

}
