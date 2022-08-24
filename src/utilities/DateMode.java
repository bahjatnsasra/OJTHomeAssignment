package utilities;

public class DateMode extends Mode {
    public DateMode(Watch watch) {
        super(watch);
    }

    @Override
    public void buttonA() {
        watch.changeMode(new StopperMode(watch));
    }

    @Override
    public void buttonB() {
        System.out.println(watch.getTime().getYear());
    }

    @Override
    public void buttonC() {
        System.out.println(watch.getTime().getDayOfWeek());
    }
}
