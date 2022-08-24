package utilities;

import java.time.LocalDateTime;

public class Watch {
    private Mode mode;
    LocalDateTime time;

    public Watch() {
        this.time =LocalDateTime.now();
        this.mode= new HourMode(this);
    }

    public void changeMode(Mode mode){
        this.mode=mode;
    }

    protected LocalDateTime getTime() {
        return time;
    }
    public void buttonA(){
        mode.buttonA();
    }
    public void buttonB(){
        mode.buttonB();
    }
    public void buttonC(){
        mode.buttonC();
    }
}
