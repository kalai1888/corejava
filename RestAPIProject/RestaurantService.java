package com.BasicExample.demo.Service;

import java.util.List;

import com.BasicExample.demo.model.SwiggyModel;
/* here we declare some of the methods like save hotel details,get hotel details ,
 * get hotel details by id, updating and delete details by id*/


public interface RestaurantService {
	SwiggyModel saveHotel(SwiggyModel hotel);
	List<SwiggyModel>  getHotelFromDb();
	

	SwiggyModel getHotelById(int hotelId);
	SwiggyModel updateHotelDetails(SwiggyModel hotel, int hotelId);
	void deleteHotelById(int hotelId);
}
