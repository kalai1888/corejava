package com.example.FullStackProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.FullStackProject.model.SwiggyDetails;
@Repository
public interface RestaurantRepository extends JpaRepository<SwiggyDetails,Integer> {

}
 


