package model.logger;

public class FileLoggerFactory implements LoggerFactory{

    @Override
    public Logger factory() {
        return new FileLogger();
    }
}
