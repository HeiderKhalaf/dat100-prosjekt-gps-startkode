package no.hvl.dat100ptc.oppgave3;

import static java.lang.Math.*;

import no.hvl.dat100ptc.oppgave1.GPSPoint;
import no.hvl.dat100ptc.TODO;

public class GPSUtils {

	public static double findMax(double[] da) {

		double max; 
		
		max = da[0];
		
		for (double d : da) {
			if (d > max) {
				max = d;
			}
		}
		
		return max;
	}

	public static double findMin(double[] da) {

		double min;
		
		min = da[0];
		
		for(double d : da) {
			if(d < min) {
				min = d;
				
			}
		}
		return min;
	}

	public static double[] getLatitudes(GPSPoint[] gpspoints) {

		double[] latitudes = new double[gpspoints.length];
		
		for (int i = 0; i < latitudes.length; i++) {
			latitudes[i] = gpspoints[i].getLatitude();
		}
		
		return latitudes;
	}

	public static double[] getLongitudes(GPSPoint[] gpspoints) {

		
double[] longitudes = new double[gpspoints.length];
		
		for (int i = 0; i < longitudes.length; i++) {
			longitudes[i] = gpspoints[i].getLongitude();
		}
		
		return longitudes;

	}

	private static final int R = 6371000; // jordens radius

	public static double distance(GPSPoint gpspoint1, GPSPoint gpspoint2) {

		double latitude1, longitude1, latitude2, longitude2;
		
		latitude1 = Math.toRadians(gpspoint1.getLatitude());
		latitude2 = Math.toRadians(gpspoint2.getLatitude());
		longitude1 = Math.toRadians(gpspoint1.getLongitude());
		longitude2 = Math.toRadians(gpspoint2.getLongitude());
		
		double deltalat = latitude2 - latitude1;
		double deltalong = longitude2 - longitude1;
		
		double a = compute_a(latitude1, latitude2, deltalat, deltalong);
		
		double c = compute_c(a);
		
		double d = R * c;
		
		return d;
	
	}
	
	private static double compute_a(double phi1, double phi2, double deltaphi, double deltadelta) {
		
		return Math.pow(Math.sin(deltaphi/2),2) +
				Math.cos(phi1) * Math.cos(phi2) + 
				Math.pow(Math.sin(deltadelta/2),2);

	}

	private static double compute_c(double a) {

		return Math.atan2(Math.sqrt(a),Math.sqrt(1-a));

	}

	
	public static double speed(GPSPoint gpspoint1, GPSPoint gpspoint2) {

		int sec1 = gpspoint1.getTime();	
		int sec2 = gpspoint2.getTime();                                               
		int secs = sec2-sec1;
		
		double d = distance(gpspoint1, gpspoint2);
		
		double speed;
		
		speed = d / secs;
		
		return speed;
		

	}

	public static String formatTime(int secs) {

		String timestr;
		String TIMESEP = ":";

		
		int h = secs / 3600;
		int m = (secs % 3600) / 60;
		int s = secs % 60;
		
		timestr = String.format(TIMESEP, h, TIMESEP, m, TIMESEP, s);
		
		return timestr;
	}
	
	private static int TEXTWIDTH = 10;

	public static String formatDouble(double d) {

		String str;

		str = String.format("%10.2f",d).substring(0, TEXTWIDTH);
		
		return String.format("%10.2f", d);
		 
		 
		
	}
}
