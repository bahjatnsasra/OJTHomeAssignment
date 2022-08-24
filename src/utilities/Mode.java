package utilities;

public abstract class Mode {
    Watch watch;
    public abstract void buttonA();
    public abstract void buttonB();
    public abstract void buttonC();

    public Mode(Watch watch) {
        this.watch = watch;
    }
}
