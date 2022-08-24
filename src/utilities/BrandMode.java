package utilities;

public class BrandMode extends Mode {
    Logger logger;
    public BrandMode(Watch watch) {
        super(watch);
        logger=new TextFileLogger();

    }

    @Override
    public void buttonA() {
        watch.changeMode(new HourMode(watch));

    }

    @Override
    public void buttonB() {
        logger.log("The One s2");
    }

    @Override
    public void buttonC() {

    }
}
