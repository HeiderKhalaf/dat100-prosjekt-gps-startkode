package no.hvl.dat100ptc.oppgave1;

import no.hvl.dat100ptc.TODO;

public class GPSPoint {

	// TODO - objektvariable
	private int time = 1;
	private double latitude = 4.0;
	private double longitude = 2.7;
	private double elevation = 3.6;
	
	public GPSPoint(int time, double latitude, double longitude, double elevation) {

		this.time = time;
		this.latitude = latitude;
		this.longitude = longitude;
		this.elevation = elevation;

		
	}


	// TODO - get/set metoder
	public int getTime() {
		return time;
		
	}
		 

	public void setTime(int time) {
			this.time = time;	
		
		
	}

	public double getLatitude() {
		return latitude;
		
		
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
		
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
		
	}

	public double getElevation() {
		return elevation;
		
	}

	public void setElevation(double elevation) {
		this.elevation = elevation;
		
	}
	
	public String toString() {
		 return time + " (" + latitude + "," + longitude + ") " + elevation + "\n";
		
		
	}

	public static GPSPoint convert(String time2, String latitude2, String longitude2, String elevation2) {
		// TODO Auto-generated method stub
		return null;
	}
}
