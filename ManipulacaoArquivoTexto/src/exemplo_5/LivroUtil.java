package exemplo_5;

import java.io.*;

public class LivroUtil {

    public static boolean gravarLivros(String caminho, Object object) throws IOException{
        File file = new File(caminho);

        if(!file.exists()){
            file.createNewFile();
        }

        var objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
        objectOutputStream.writeObject(object);
        objectOutputStream.flush();
        objectOutputStream.close();

        return true;
    }

    public static Object recuperarLivros(String caminho) throws IOException, ClassNotFoundException {
        File file = new File(caminho);

        var objectInputStream = new ObjectInputStream(new FileInputStream(file));

        Object object = objectInputStream.readObject();

        objectInputStream.close();

        return object;
    }
}
