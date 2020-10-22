package com.cts.capstone.vnf.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cts.capstone.vnf.entity.VnfDetails;

@Service
public interface VnfDetailsServices {

	VnfDetails serviceById (Integer Id);
	List<VnfDetails> serviceByName (String name);
	List<VnfDetails> serviceByNameandSize (String name, char size); 
	List<VnfDetails> allServices ();
}
