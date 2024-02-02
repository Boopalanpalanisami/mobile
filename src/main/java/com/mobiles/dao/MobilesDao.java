package com.mobiles.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mobiles.entity.Mobiles;
import com.mobiles.repository.MobilesRepository;

@Repository

public class MobilesDao {
	@Autowired
	MobilesRepository mr;
	
	public String postData(Mobiles mc) {
		mr.save(mc);
		return "Success";
	}
	
	public String postDatas(List<Mobiles> ma) {
		mr.saveAll(ma);
		return "Success";
	}
	
	public Mobiles findOne(int a) {
		return mr.findById(a).get();
		
	}
	public String findDeleted(int b) {
		 mr.deleteById(b);
		 return "Successfully deleted";
	}
	
	public String findUpdate(Mobiles aa) {
		mr.save(aa);
		return "Succesfullu Updated";
		
	}

}
