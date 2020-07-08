package com.policy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.policy.dao.PolicyDAO;
import com.policy.entity.PolicyName;

@Service
public class PolicyServiceImpl implements PolicyService {

	@Autowired
	private PolicyDAO policyDAO;
	
	@Override
	@Transactional
	public List<PolicyName> getPolicies() {
		
		return policyDAO.getPolicies();
	}

	@Override
	@Transactional
	public PolicyName getPolicy(int theId) {

		return policyDAO.getPolicy(theId);
	}

	@Override
	@Transactional
	public void savePolicy(PolicyName thePolicy) {
		
		policyDAO.savePolicy(thePolicy);
		
	}

	@Override
	@Transactional
	public void deletePolicy(int theId) {
		
		policyDAO.deletePolicy(theId);
		
	}

}
