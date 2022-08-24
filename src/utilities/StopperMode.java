package utilities;

public class StopperMode extends Mode {
    private int second;
    private int minute;
    private int hour;
    private boolean start;
    private boolean pause;
    public StopperMode(Watch watch) {
        super(watch);
        this.hour=0;
        this.minute=0;
        this.second=0;
        this.start = false;
        this.pause = false;
    }

    @Override
    public void buttonA() {
        watch.changeMode(new BrandMode(watch));
    }

    @Override
    public void buttonB() {
        if(!start){
            start=true;
            this.setSecond(1);
        }
        else {
            if(!this.pause) {
                this.pause=true;
            }
            else {
                timeIncrement();
//                this.second++;
                this.pause=false;
            }
        }
        printStopWatch();

    }

    @Override
    public void buttonC() {
        resetStopper();
        printStopWatch();
    }
    public void setSecond(int second) {
        this.second = second;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
    public void printStopWatch(){
        System.out.println( +this.hour+":" +this.minute +":"+ + this.second);
    }
    public void timeIncrement(){
        handleSeconds();
        handleMinutes();
    }
    public void handleSeconds(){
        this.second++;
        if(this.second==60) {
            this.second = 0;
            this.minute++;
        }
    }
    public void handleMinutes(){
        if(this.minute==60) {
            this.hour++;
            this.minute = 0;
        }
            if(this.hour == 24){
                resetStopper();
            }

    }
    public void resetStopper(){
        setHour(0);
        setMinute(0);
        setSecond(0);
    }


}
