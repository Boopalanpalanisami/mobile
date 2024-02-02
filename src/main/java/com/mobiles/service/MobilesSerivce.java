package com.mobiles.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobiles.dao.MobilesDao;
import com.mobiles.entity.Mobiles;

@Service

public class MobilesSerivce {
	
	@Autowired
	MobilesDao md;
	
	public String postData(Mobiles mb) {
		return md.postData(mb);
	}
	
	public String postDatas(List<Mobiles> mm) {
		return md.postDatas(mm);
	}
	
	public Mobiles findOne(int a) {
		return md.findOne(a);
	}
	
	public String findDeleted(int b) {
		return md.findDeleted(b);
	}
	
	public String findUpdate(Mobiles aa) {
		return md.findUpdate(aa);
	}

}
