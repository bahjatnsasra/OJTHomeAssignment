package utilities;

import java.time.format.DateTimeFormatter;

public class HourMode extends Mode {
    private String pattern;
    public HourMode(Watch watch) {
        super(watch);
        this.pattern="hh:mm a";
    }

    @Override
    public void buttonA() {
        watch.changeMode(new DateMode(watch));
    }

    @Override
    public void buttonB() {
        System.out.println(watch.getTime().format(DateTimeFormatter.ofPattern(pattern)));
    }

    @Override
    public void buttonC() {
        System.out.println("Light");
    }
}
