package model.logger;

public class TerminalLoggerFactory implements LoggerFactory{

    @Override
    public Logger factory() {
        return new TerminalLogger();
    }

}
