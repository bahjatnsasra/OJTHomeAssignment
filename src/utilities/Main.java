package utilities;

public class Main {

    public static void main(String[] args) {
        Watch watch = new Watch();
        watch.buttonB();
        watch.buttonC();

        watch.buttonA();
        watch.buttonB();
        watch.buttonC();

        watch.buttonA();
        for (int i = 0 ; i<200 ; i++){
            watch.buttonB();
        }
        watch.buttonC();

        watch.buttonA();
        watch.buttonB();

        watch.buttonA();
        watch.buttonB();



    }
}
