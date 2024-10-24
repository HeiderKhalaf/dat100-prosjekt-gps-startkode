package no.hvl.dat100ptc.oppgave2;

import no.hvl.dat100ptc.oppgave1.GPSPoint;

public class Main {

	
	public static void main(String[] args) {

		// TODO
		GPSPoint punkt1 = new GPSPoint(2024, 32, 421, 12);
		GPSPoint punkt2 = new GPSPoint(321, 313, 32, 45);
		
		
		GPSData gpsData = new GPSData(2);
		
		gpsData.insertGPS(punkt1);
		gpsData.insertGPS(punkt2);
		
		gpsData.print();
	}
}
