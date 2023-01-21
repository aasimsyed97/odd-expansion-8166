package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.AdharCard;




@Repository
public interface AdharCardRepo extends JpaRepository<AdharCard, Integer> {

	public AdharCard findByadharNo(String adharNo);
}
