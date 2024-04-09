package model.logger;

class TerminalLogger implements Logger{

    @Override
    public void log(String message) {
        System.out.println(message);
    }
}
