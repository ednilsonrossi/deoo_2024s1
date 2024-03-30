package exemplo_6;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro(
                "C Programming Absolute Beginner's Guide",
                "Greg Perry, Dean Miller",
                "3rd",
                2014,
                30.00);

        ObjectMapper objectMapper = new ObjectMapper();

        String json = null;
        try {
            json = objectMapper.writeValueAsString(livro);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        System.out.println(json);


        try{
            Livro outro = objectMapper.readValue(json, Livro.class);
            System.out.println(outro);
        } catch (Exception e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}
