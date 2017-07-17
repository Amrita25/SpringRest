package com.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.Shop;

@Controller
@RequestMapping(value="/kfc/brands")
public class JSONController {

	@RequestMapping(value="/{name}", method=RequestMethod.GET)
	public  @ResponseBody Shop getShopInJSON(@PathVariable String name){
		
		Map<String,List<Date>> map = populateMap();
		Shop shop = new Shop();
		shop.setName(name);
		shop.setMymap(map);
		
		return shop;
	}
	
	private Map<String, List<Date>> populateMap(){
		Map<String,List<Date>> finalmap = new HashMap<String, List<Date>>();
		
		List<Date> augustdates=new ArrayList();
		augustdates.add(parseMyDateString("28/08/2017"));
		augustdates.add(parseMyDateString("27/08/2017"));
		
		List<Date> septdates=new ArrayList();
		septdates.add(parseMyDateString("01/09/2017"));
		septdates.add(parseMyDateString("02/09/2017"));
		
		finalmap.put("August",augustdates);
		finalmap.put("September",septdates);
		
		return finalmap;
	}
	
	private Date parseMyDateString(String datestr){
		
		SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
		Date date=null;
		try {
			date = format.parse(datestr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date;
	}
	
}
