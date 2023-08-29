/**
 * 
 */
package logic;

/**
 * 
 */
public class Temperature extends Logicparam {
	
	private static double setTmpDay;
	private static double setTmpNight;
	private static double tmpBorder;
	
	/**
	 * Constructor with the day, night, dayheat, nightheat and temperatureborder parameters
	 * @param setTmpDay
	 * @param setTmpNight
	 * @param setDayStart
	 * @param setNightStart
	 * @param tmpBorder
	 */
	public Temperature(double setTmpDay, double setTmpNight, int setDayStart, int setNightStart, double tmpBorder) {
		super(setDayStart, setNightStart);
		Temperature.setTmpDay = setTmpDay;
		Temperature.setTmpNight = setTmpNight;
		Temperature.tmpBorder = tmpBorder;
	}
	
	/**
	 * Method controls the temperature difference of the is and set
	 * @param isTmp
	 * @param setTmp
	 */
	private void tempholder(double isTmp, double setTmp) {
		if (isTmp < setTmp-tmpBorder) {
			// turn heater ON
		} 
		if (isTmp > setTmp+tmpBorder) {
			// turn heater OFF
		} 
		// nothing happens between these values
	}
	
	/**
	 * 
	 */
	public void run() {
		while (true) {
			try {
			    			    
			    // If it is day, call the day cycle, otherwise night
			    if (daychecker()) {
			    	tempholder(0, setTmpDay);
			    } else {
			    	tempholder(0, setTmpNight);
			    }
				
				// Sleep 60 seconds, than repeat
                //((1000ms = 1s) * 60 = 1m)
                Thread.sleep(60000);
                
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
		}
	}

}
