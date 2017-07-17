package com.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Shop {

	String name;
	
	private Map<String,List<Date>> mymap;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, List<Date>> getMymap() {
		return mymap;
	}

	public void setMymap(Map<String, List<Date>> mymap) {
		this.mymap = mymap;
	}

	
	
	
	
}
