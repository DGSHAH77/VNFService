package com.cts.capstone.vnf.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.capstone.vnf.entity.VnfDetails;

public interface VnfServiceRepository extends JpaRepository<VnfDetails, Integer>{

}
