package com.springboot.main.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.main.model.Vendor;
import com.springboot.main.repository.VendorRepository;

@Service
public class VendorService {

	@Autowired
	private VendorRepository vendorRepository; 
	
	public Vendor insert(Vendor vendor) {
		return vendorRepository.save(vendor);
	}

	public Vendor getById(int vendorId) {
		Optional<Vendor> optional = vendorRepository.findById(vendorId);
		return optional.orElse(null);
	}

	public Vendor update(Vendor vendor) {
		return vendorRepository.save(vendor);
	}

	public void delete(Vendor vendor) {
		vendorRepository.delete(vendor);
	}
}

