package com.example.FullStackProject.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.FullStackProject.exception.ResourceNotFoundException;
import com.example.FullStackProject.model.SwiggyDetails;
import com.example.FullStackProject.repository.RestaurantRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/Swiggy/")
public class RestaurantController {
	@Autowired
	private RestaurantRepository restaurantRepo;
	
	@PostMapping("/SaveHotelDetails")
	public SwiggyDetails createHotel(@RequestBody SwiggyDetails hotel) {
		return restaurantRepo.save(hotel);
	}
	
	@GetMapping("/DisplayAll")
	public List<SwiggyDetails> getAllHotels(){
		return restaurantRepo.findAll();
	}
	@GetMapping("/searchHotel/{id}")
	public ResponseEntity<SwiggyDetails> getHotelById(@PathVariable int id) {
		SwiggyDetails hotel= restaurantRepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Restaurant not exist with id :" + id));
		return ResponseEntity.ok(hotel);
	}
	
	@PutMapping("/updateHotels/{id}")
	public ResponseEntity<SwiggyDetails> updateHotel(@PathVariable int id, @RequestBody SwiggyDetails hotel){
		SwiggyDetails hotelUpd = restaurantRepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Restaurant not exist with id :" + id));
		
		hotelUpd.setFoodType(hotel.getFoodType());
		hotelUpd.setLocation(hotel.getLocation());
		hotelUpd.setRestaurantName(hotel.getRestaurantName());
		
		SwiggyDetails updatedHotels = restaurantRepo.save(hotelUpd);
		return ResponseEntity.ok(updatedHotels);
	}
	
	@DeleteMapping("/deleteHotels/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteHotels(@PathVariable int id){
		SwiggyDetails delHotel=restaurantRepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Restaurant not exist with id :" + id));
		
		restaurantRepo.delete(delHotel);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}

}

	


