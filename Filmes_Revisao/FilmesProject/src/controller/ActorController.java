package controller;

import dto.ActorDto;
import model.entity.Actor;
import model.service.ActorService;

import java.util.ArrayList;
import java.util.List;

public class ActorController {

    private ActorService service;

    public ActorController(){
        service = new ActorService();
    }

    public List<ActorDto> getAllActors(){
        List<ActorDto> list = new ArrayList<>();
        for(Actor actor : service.getAllActors()){
            list.add(new ActorDto(actor));
        }
        return list;
    }
}
