package utilities;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class TextFileLogger implements Logger {
    BufferedWriter logger ;


    public TextFileLogger() {
    }

    @Override
    public void log(String mess){
        try {
            this.logger =  new BufferedWriter(new FileWriter("output.txt",true));
            logger.write(mess);
            logger.newLine();
            logger.close();
        } catch (IOException e) {
            System.out.println("Writing failed");
            e.printStackTrace();
        }

    }
}
