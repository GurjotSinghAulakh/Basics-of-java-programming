package introklasserogobjekter2 ;

public class Klokke {

    private int timer; 
    private int minutter;
    private int sekunder;

    // A constructor.
    public Klokke(int time, int minutter, int sekunder) {
        setTimer(time);
        setMinutter(minutter);
        setSekunder(sekunder);
    }

    public int getTimer() {
        return timer;
    }

    /**
     * If the timer is greater than or equal to 0 and less than 24, set the timer to the value passed
     * in. Otherwise, set the timer to 0.
     * 
     * @param timer The time in hours that the timer will run for.
     */

    public void setTimer(int timer) {
        if (timer >= 0 && timer < 24) {
            this.timer = timer;
        } else {
            this.timer = 0;
        }
    }

    public int getMinutter() {
        return minutter;
    }

    /**
     * If the parameter is between 0 and 59, the function sets the instance variable to the parameter.
     * Otherwise, the function sets the instance variable to 0
     * 
     * @param minutter The number of minutes to set the clock to.
     */

    public void setMinutter(int minutter) {
        if (minutter >= 0 && minutter < 60) {
            this.minutter = minutter;
        } else {
            this.minutter = 0;
        }
    }

    public int getSekunder() {
        return sekunder;
    }

    /**
     * If the parameter is between 0 and 59, the function sets the instance variable to the parameter.
     * Otherwise, the function sets the instance variable to 0
     * 
     * @param sekunder The number of seconds.
     */

    public void setSekunder(int sekunder) {
        if (sekunder >= 0 && sekunder < 60) {
            this.sekunder = sekunder;
        } else {
            this.sekunder = 0;
        }
    }

    /**
     * It prints the time
     */
    public void visTiden() {
        System.out.println(timer + ":" + minutter + ":" + sekunder);
    }
}
