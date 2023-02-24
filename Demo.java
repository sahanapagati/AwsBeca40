package com;

import java.util.LinkedHashMap;
import java.util.Set;

class Demo {

	public static void main(String[] args) 
	{
       LinkedHashMap<Double, String> map=new LinkedHashMap<Double, String>();
       map.put(22.1, "Apple");
       map.put(22.6, "Sony");
       map.put(22.2, "Samsung");
       Set<Double> keys= map.keySet();
       for(double key: keys)
       {
    	   System.out.println(key+" -> "+map.get(key));
       }
	}

}
