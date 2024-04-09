import model.logger.FileLoggerFactory;
import model.logger.Logger;
import model.logger.TerminalLoggerFactory;

public class ClientCode {
    public static void main(String[] args) {
        int number = 3;

        //Logger logger = new FileLoggerFactory().factory();
        Logger logger = new TerminalLoggerFactory().factory();

        for(int i=0; i <= 10; i++){
            logger.log(String.format("%d x %d = %d", number, i, number * i));
        }
    }
}
