package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.repo.profileRepo;
import com.example.user.Guest;

@RestController
	@RequestMapping("/profile1")
	public class controller {
		 @Autowired
		    private profileRepo profileRepository1;

		    @GetMapping(value = "/list")
		    public List<Guest> getAllDetails(){
		        return profileRepository1.findAll();
		    }
		    @PostMapping(value = "/add")
		    public Guest addNewGuest(@RequestBody Guest up){
		        return profileRepository1.save(up);
		    }
	}

