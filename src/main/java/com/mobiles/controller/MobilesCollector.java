package com.mobiles.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mobiles.entity.Mobiles;
import com.mobiles.service.MobilesSerivce;

@RestController

public class MobilesCollector {
	@Autowired
	MobilesSerivce ms;
	
	@PostMapping(path="/mobs")
	public String postData(@RequestBody Mobiles m) {
		return ms.postData(m);
		
	}
	
	@GetMapping(path="/mob")
	public String postDat(@RequestBody List<Mobiles> mo) {
		return ms.postDatas(mo);
	}
	
	@GetMapping(path="/mos/{a}") //http://localhost:8080/mos/4 //
	public Mobiles findPrice(@PathVariable int a) {
		return ms.findOne(a);
	}
	
	@DeleteMapping(path="/mnm/{b}")  // http://localhost:8080/mnm/2 //
	public String findDelet(@PathVariable int b) {
		return ms.findDeleted(b);
	}
	
	@PutMapping(path="/update")  //http://localhost:8080/update //
	public String findUpdate(@RequestBody Mobiles a) {
		return ms.findUpdate(a);
	}

}
