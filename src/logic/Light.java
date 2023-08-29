/**
 * 
 */
package logic;

/**
 * 
 */
public class Light extends Logicparam {
		
	/**
	 * Constructor with the day and night parameters, calling the super class
	 * @param setDayStart
	 * @param setNightStart
	 */
	public Light(int setDayStart, int setNightStart) {
		super(setDayStart, setNightStart);
	}
	
	/**
	 * Methods sets the ligh on
	 * @param lightOn
	 */
	private void setLight(boolean lightOn) {
		
	}
	
	/**
	 * 
	 */
	public void run() {
		while (true) {
			try {
			    			    
				if (daychecker()) {
					setLight(true);
			    } else {
			    	setLight(false);
			    }
				
				// Sleep 60 seconds, than repeat
                //((((1000ms = 1s) * 60 = 1m) * 15 = 900.000)
                Thread.sleep(900000);
                
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
		}
	}
	
}
