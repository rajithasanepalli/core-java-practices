package com.mouritech.jsonex;

import org.json.simple.JSONObject;

public class JavaJsonEncoding {

	
	public static void main(String[] args) {
		JSONObject file = new JSONObject();
	       file.put("Full Name", "Ritu Sharma");
	       file.put("Roll No.", new Integer(1704310046));
	       file.put("Tution Fees", new Double(65400));
	  
	  
	       // To print in JSON format.
	       System.out.print(file);
	}

}
