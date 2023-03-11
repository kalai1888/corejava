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
/*@RestController-having 2 annotations:Response body and Controller
* This annotation is used at the class level and allows the class to handle the requests made by the client. 
* 
* @RequestMapping-used to map the web request
* 
* */
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/Swiggy/")
public class RestaurantController {
	@Autowired
	private RestaurantRepository restaurantRepo;
	/* @PostMapping- method handles the Http POST requests matched with the specified URL
	 * @RequestBody- Objects are passed as a parameter to swiggy model table
	 * 
	 * In this Mapping ,we get all the restaurant details in the form of Swiggy model object   */
		
	@PostMapping("/SaveHotelDetails")
	public SwiggyDetails createHotel(@RequestBody SwiggyDetails hotel) {
		return restaurantRepo.save(hotel);
	}
	/* @GetMapping-Display all the details of the restaurants by using http  get request*/
	@GetMapping("/DisplayAll")
	public List<SwiggyDetails> getAllHotels(){
		return restaurantRepo.findAll();
	}
	/* @GetMapping-Display all the details of the restaurant of a particular id. to get this id ,we use @PathVariable 
	 * by using http  get request*/
	@GetMapping("/searchHotel/{hotelId}")
	public ResponseEntity<SwiggyDetails> getHotelById(@PathVariable("hotelId") int id) {
		SwiggyDetails hotel= restaurantRepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Restaurant not exist with id :" + id));
		return ResponseEntity.ok(hotel);
	}
	/*@PutMapping- Update the restaurant details of the particular id. By using @DynamicUpdate we change the 
	 * particular attribute by using http put request */
	@PutMapping("/updateHotels/{hotelId}")
	public ResponseEntity<SwiggyDetails> updateHotel(@PathVariable("hotelId") int id, @RequestBody SwiggyDetails hotel){
		SwiggyDetails hotelUpd = restaurantRepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Restaurant not exist with id :" + id));
		
		hotelUpd.setFoodType(hotel.getFoodType());
		hotelUpd.setLocation(hotel.getLocation());
		hotelUpd.setRestaurantName(hotel.getRestaurantName());
		
		SwiggyDetails updatedHotels = restaurantRepo.save(hotelUpd);
		return ResponseEntity.ok(updatedHotels);
	}
	/*@DeleteMapping-Delete the particular id of the restaurant detail by using http delete request*/
	@DeleteMapping("/deleteHotels/{hotelId}")
	public ResponseEntity<Map<String, Boolean>> deleteHotels(@PathVariable("hotelId") int id){
		SwiggyDetails delHotel=restaurantRepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Restaurant not exist with id :" + id));
		
		restaurantRepo.delete(delHotel);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}

}

	


