
	package com.example.demo.controller;

	import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.SetRates.SetRates;
import com.example.demo.SetRates.SetRates.RoomDetails;
	@RestController
	@RequestMapping("/SetRates")
	public class RoomController<RoomRepo> {
		 private static final SetRates Rates = null;
		@Autowired
		    private RoomRepo roomRepository;

		    @SuppressWarnings("rawtypes")
			@GetMapping(value = "/list")
		    public List<RoomDetails> getAllRoomDetails(){
		        return ((Object) roomRepository).findAll();
		    }
		    @SuppressWarnings("rawtypes")
			@PostMapping(value = "/add")
		    public SetRates addNewRoom(@RequestBody RoomDetails up){
		        return ((Object) roomRepository).save(up);
		    }
		    @DeleteMapping(value = "/delete/{membercode}")
		    public void deleteRoom(@PathVariable String membercode) {
		        System.out.println("Delete method called");
		        ((Object) roomRepository).deleteById(membercode);
		    }
		    @PutMapping(value="/update/{membercode}")
		    public SetRates updateRoomDetails(@PathVariable SetRates membercode) {
		    	 System.out.println("Update method called");
		    	return Rates Repository.save(membercode);
		    }
	}

