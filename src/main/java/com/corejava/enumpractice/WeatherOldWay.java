package com.corejava.enumpractice;

public class WeatherOldWay {
	
	private String value;
	
	static WeatherOldWay[] values = new WeatherOldWay[3];
	int ordinal = -1;
	
	public static final WeatherOldWay HOT = new WeatherOldWay("HOT", 0);
	public static final WeatherOldWay COLD = new WeatherOldWay("COLD", 1);
	public static final WeatherOldWay WARM = new WeatherOldWay("WARM", 2);
			
	private WeatherOldWay(String s , int ordinal) {
		this.value = s;
		this.ordinal = ordinal;
		values[ordinal] = this;
	}
	
	public String toString() {
		return value;
	}
	
	public static WeatherOldWay valueOf(String s) throws Exception {
		for(WeatherOldWay v: values) {
			if (v.toString().equals(s)) {
				return v;
			}
		}
		throw new Exception();		
	}
	
	
	public static void main(String args[]) {
		try {
			WeatherOldWay.valueOf("HOT");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
