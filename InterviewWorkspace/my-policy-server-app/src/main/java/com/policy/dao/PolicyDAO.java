package com.policy.dao;

import java.util.List;

import com.policy.entity.PolicyName;

public interface PolicyDAO {
	
	// get all
	public List<PolicyName> getPolicies();
	
	//get a single
	public PolicyName getPolicy(int theId);
	
	// save or update
	public void savePolicy(PolicyName thePolicy);
	
	// delete a single
	public void deletePolicy(int theId);

}
