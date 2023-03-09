package com.BasicExample.demo.ServiceImplement;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.BasicExample.demo.Repository.RestaurantRepository;
import com.BasicExample.demo.Service.RestaurantService;
import com.BasicExample.demo.model.SwiggyModel;
/*@Service-  allows developers to add business functionalities.
 * here we have to implement the 'restaurant service' interface by 
 * giving definitions to the method declaration of 'restaurant service'
 */
/*restaurant repository class acts as an attribute by calling the method like save,find all,
 * find by id, update by id and delete by id 
  */
@Service
public class ServiceImplement implements RestaurantService {
		
		RestaurantRepository resrepo;
			
			public ServiceImplement(RestaurantRepository resrepo) {
				this.resrepo = resrepo;
			}
			
			/*save Hotel-here we create and save the restaurant  details.
			 * */
			@Override
			public SwiggyModel saveHotel(SwiggyModel hotel) {
				return resrepo.save(hotel) ;
			}
			/*  get hotel from db- display all the details from the database by find all method*/
			@Override
			public List<SwiggyModel> getHotelFromDb() {
				return resrepo.findAll();
			}
			/* get hotel by id -display the particular details of the id in which we want to see
			 * Optional - provides methods for getting the values.
			 *  You can check isPresent() for the presence of the value and then make a call to get() */
			@Override
			public SwiggyModel getHotelById(int hotelId) {
				Optional<SwiggyModel>resDetails  = resrepo.findById(hotelId);
				if(resDetails.isPresent()) {
					return resDetails.get();
				}
				else {
					return null;
				}
				
			}
			/*Update Hotel details- update the hotel details of the id if we want to change the values of attribute
			 *Optional - provides methods for getting the values.
			 *  You can check isPresent() for the presence of the value  update the value by set () and  get()*/

			@Override
			public SwiggyModel updateHotelDetails(SwiggyModel newHotel, int hotelId) {
				Optional<SwiggyModel>resDetails = resrepo.findById(hotelId);
				if(resDetails.isPresent()) {
					SwiggyModel existingHotel = resDetails.get();  //'2', 'mny@123', 'abc', 'xyz'

					existingHotel.setLocation(newHotel.getLocation());
					existingHotel.setFoodType(newHotel.getFoodType());
					resrepo.save(existingHotel);
					return existingHotel;
				}
				else {
					return null;
				}
				
			}

			/*Delete hotel by id- Delete the hotel details of the id. 
			 * Optional - provides methods for getting the values.
			 *  You can check isPresent() for the presence of the value and delete  */
			 
			
			@Override
			public void deleteHotelById(int hotelId) {
				Optional<SwiggyModel>resDetails = resrepo.findById(hotelId);
				if(resDetails.isPresent()) {
					resrepo.deleteById(hotelId);
				}	
				
			}

		}



