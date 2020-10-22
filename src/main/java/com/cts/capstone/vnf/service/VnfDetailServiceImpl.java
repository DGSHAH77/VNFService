package com.cts.capstone.vnf.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cts.capstone.vnf.entity.VnfDetails;
import com.cts.capstone.vnf.repository.VnfServiceRepository;

@Transactional
@Component
public class VnfDetailServiceImpl implements VnfDetailsServices{
	
	@Autowired
	private VnfServiceRepository vnfRepo;
	
	@Autowired
	EntityManager entityManager;

	@Override
	public VnfDetails serviceById(Integer id) {
		// TODO Auto-generated method stub
		return entityManager.find(VnfDetails.class, id);
	}

	@Override
	public List<VnfDetails> serviceByName(String name) {
		List<VnfDetails> services = vnfRepo.findAll().stream().filter(s -> s.getServiceName().equals(name)).collect(Collectors.toList());
		return services;
	}

	@Override
	public List<VnfDetails> serviceByNameandSize(String name, char size) {
		
		List<VnfDetails> services = vnfRepo.findAll().stream().filter(s -> s.getServiceName().equals(name)).sorted().collect(Collectors.toList());
		
		return services;
	}

	@Override
	public List<VnfDetails> allServices() {
		// TODO Auto-generated method stub
		return vnfRepo.findAll();
	}

}
