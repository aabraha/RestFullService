package com.onetomany.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onetomany.jpa.entity.MailingAddress;

public interface MailingAddressRepository extends JpaRepository<MailingAddress, Integer> {

}
