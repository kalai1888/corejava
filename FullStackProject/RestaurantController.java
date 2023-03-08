package com.BasicExample.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BasicExample.demo.ServiceImplement.ServiceImplement;
import com.BasicExample.demo.model.SwiggyModel;

/*@RestController-having 2 annotations:Response body and Controller
 * This annotation is used at the class level and allows the class to handle the requests made by the client. 
 * 
 * @RequestMapping-used to map the web request
 * 
 * */
@RestController
@RequestMapping("/Swiggy.com")
public class RestaurantController {

	
	
		public ServiceImplement resServ;
		public RestaurantController(ServiceImplement resServ) {
			this.resServ=resServ;
			}
		/* @PostMapping- method handles the Http POST requests matched with the specified URL
		 * @RequestBody- Objects are passed as a parameter to swiggy model table
		 * 
		 * In this Mapping ,we get all the restaurant details in the form of Swiggy model object   */
			
		@PostMapping("/saveresDetails")//create and save
		public ResponseEntity<SwiggyModel> saveHotel(@RequestBody SwiggyModel hotel){
			return new ResponseEntity<SwiggyModel>(resServ.saveHotel(hotel), HttpStatus.CREATED);
		}
		/* @GetMapping-Display all the details of the restaurants by using http  get request*/
		@GetMapping("/readresDetails")
		public List<SwiggyModel> getAllHotel(){
			return resServ.getHotelFromDb();
		}
		/* @GetMapping-Display all the details of the restaurant of a particular id. to get this id ,we use @PathVariable 
		 * by using http  get request*/
		@GetMapping("/readresDetails/{id}")
		public ResponseEntity<SwiggyModel>  gethotelById(@PathVariable("id")  int hotelId){
			return new ResponseEntity<SwiggyModel>(resServ.getHotelById(hotelId), HttpStatus.OK);
		}
		/*@PutMapping- Update the restaurant details of the particular id. By using @DynamicUpdate we change the 
		 * particular attribute by using http put request */
		@PutMapping("/updateresDetails/{hotelId}")
		public ResponseEntity<SwiggyModel> updatehotelById(@PathVariable("hotelId") int id,
				@RequestBody SwiggyModel hotel){
			return new ResponseEntity<SwiggyModel>(resServ.updateHotelDetails(hotel, id), HttpStatus.OK);
		}
		/*@DeleteMapping-Delete the particular id of the restaurant detail by using http delete request*/

		@DeleteMapping("/deleteresDetails/{id}")
		public ResponseEntity<String> deletehotelById(@PathVariable("id")  int hotelId){
			resServ.deleteHotelById(hotelId);
			return new ResponseEntity<String>("deleted successfully", HttpStatus.OK);
		}

	}


