package com.masai.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.VaccineInventoryException;
import com.masai.model.Vaccine;
import com.masai.model.VaccineInventory;
import com.masai.repository.VaccineInventoryRepo;


@Service
public class VaccineInventoryServiceImpl implements VaccineInventoryService{
	

    @Autowired
	private VaccineInventoryRepo inventryRepo;
    
	@Override
	public List<VaccineInventory> allVaccineInventory() {
       List<VaccineInventory> inventories=inventryRepo.findAll();
       if(inventories.isEmpty()) {
    	   throw new VaccineInventoryException("Vaccine Inventry data nou found...");
       }else {
    	   return inventories;
       }
       
    }

	
	
	@Override
	public VaccineInventory getVaccineInventoryByCentre(Integer centreId) throws VaccineInventoryException {
		//VaccineInventory inventory=inventryRepo.findB
		// TODO Auto-generated method stub
		return null;
	}

	
	
	@Override
	public VaccineInventory addVaccineCount(VaccineInventory vaccineInventory) throws VaccineInventoryException {
		if(vaccineInventory==null) {
			throw new VaccineInventoryException("Vaccine Inventry data not saved..");
		}else {
			return inventryRepo.save(vaccineInventory);
		}
		
	}

	
	
	
	@Override
	public VaccineInventory updateVaccineInventory(VaccineInventory inventory) throws VaccineInventoryException {
		Optional<VaccineInventory> inventory2=inventryRepo.findById(inventory.getVaccineInventoryId());
		if(inventory2.isEmpty()) {
			VaccineInventory inventory3=inventory2.get();
			return inventryRepo.save(inventory3);
		}
		else {
			throw new VaccineInventoryException("VaccineInvenry Data not Found...");
		}
	}

	
	
	@Override
	public VaccineInventory deleteVaccineInventory(VaccineInventory vaccineInventory) throws VaccineInventoryException {
		Optional<VaccineInventory> inventory2=inventryRepo.findById(vaccineInventory.getVaccineInventoryId());
		if(inventory2.isEmpty()) {
			new VaccineInventoryException("VaccineInvenry Data not Found...");
		}
		VaccineInventory inventory=inventory2.get();
			 inventryRepo.delete(inventory);
			 return inventory;
		
		
	}
	@Override
	public List<VaccineInventory> getVaccineInventoryByDate(LocalDate date) throws VaccineInventoryException {
		List<VaccineInventory> list=inventryRepo.findByDate(date);
		if(list.isEmpty()) {
			throw new VaccineInventoryException("Vacciniation Inventry data not found...");
		}else {
			return list;
		}
		
	}

	@Override
	public List<VaccineInventory> getVaccineInventoryByVaccine(Vaccine vaccine) throws VaccineInventoryException {
		
		// TODO Auto-generated method stub
		return null;
	}



}