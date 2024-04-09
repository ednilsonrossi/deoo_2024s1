package model.logger;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class FileLogger implements Logger{

    private String fileName = "logger.txt";

    @Override
    public void log(String message) {
        File file = new File(fileName);
        try (var buffer = new BufferedWriter(new FileWriter(file, true))){
            buffer.write(message + "\n");
        } catch (IOException e){
            System.err.println("Erro: " + e.getMessage());
        }
    }
}
