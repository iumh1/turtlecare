/**
 * 
 */
package logic;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 */
public class Logicparam extends Thread{
	
	protected static int setDayStart;
	protected static int setNightStart;
	
	/**
	 * Constructor of the day and night time parameters
	 * @param setDayStart
	 * @param setNightStart
	 */
	protected Logicparam(int setDayStart, int setNightStart) {
		Logicparam.setDayStart = setDayStart;
		Logicparam.setNightStart = setNightStart;
	}
	
	/**
	 * Method returns true if it is daytime based on the settings
	 * @return
	 */
	protected boolean daychecker() {
		boolean day = false;
		
		SimpleDateFormat formatter = new SimpleDateFormat("HHmm");  
	    Date date = new Date();  
	    int isTime = Integer.parseInt(formatter.format(date));
		
	    // Checking if the time matching the day value
		if (isTime < setNightStart) {
	    	if (isTime > setDayStart) {
		    	// DAY Sequence
	    		day = true;

	    	}
	    	// MORNING/NIGHT Sequence 	
	    	day = false;
	    } else {
	    	// NIGHT Sequence
	    	day = false;
	    }
		
		return day;
	}

}
