package com.policy.client.service;

import java.util.List;

import com.policy.client.model.Policy;


public interface PolicyService {
	
	public List<Policy> getPolices();

	public void savePolciy(Policy thePolciy);

	public Policy getPolicy(int theId);

	public void deletePolicyr(int theId);

}
