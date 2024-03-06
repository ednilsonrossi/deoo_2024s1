package view;

import controller.ActorController;
import controller.DirectorController;
import controller.MovieController;
import dto.ActorDto;
import dto.MovieDto;

import java.util.ArrayList;
import java.util.List;

public class Console {

    private MovieController movieController;
    private ActorController actorController;
    private DirectorController directorController;

    public Console(){
        actorController = new ActorController();
        directorController = new DirectorController();
        movieController = new MovieController();
    }

    public void run(){
        MenuOption option;
        do{
            option = Utils.menu();

            switch (option){
                case CADASTRO:
                    MovieDto movieDto = Utils.readMovie();
                    if (movieController.save(movieDto))
                        Utils.showMessage("Filme salvo com sucesso.");
                    else
                        Utils.showMessage("Erro ao tentar salvar o filme.");
                    break;

                case LISTAR_TODOS:
                    for(MovieDto movie : movieController.getAllMovies()){
                        Utils.showMovie(movie);
                    }
                    break;

                case LISTAR_DIRETORES:
                    System.out.println("\nDIRETORES");
                    for(String str : directorController.allDirectors()){
                        System.out.println("\t" + str);
                    }
                    break;

                case LISTAR_ATORES:
                    System.out.println("\nATORES");
                    for (ActorDto actor : actorController.getAllActors()){
                        Utils.showActor(actor);
                    }
                    break;

                case FILME_POR_DIRETOR:
                    String director = Utils.selectPerson(directorController.allDirectors(), PersonType.DIRECTOR);
                    for(MovieDto movie : movieController.getMoviesFromDirector(director)){
                        Utils.showMovie(movie);
                    }
                    break;

                case FILMES_POR_ATOR:
                    List<String> list = new ArrayList<>();
                    for(ActorDto actorDto : actorController.getAllActors()){
                        list.add(actorDto.getName());
                    }
                    String actor = Utils.selectPerson(list, PersonType.ACTOR);
                    for(MovieDto movie : movieController.getMoviesFromActor(actor)){
                        Utils.showMovie(movie);
                    }
                    break;

                case FILMES_POR_NOTA:
                    int mark = Utils.readInteger("seleciona a nota mínima: ");
                    for(MovieDto movie : movieController.getMoviesFromMark(mark)){
                        Utils.showMovie(movie);
                    }
                    break;

            }
        }while (option != MenuOption.SAIR);
    }
}
