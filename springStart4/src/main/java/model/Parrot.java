package model;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Parrot {
    private String name;

    @PostConstruct
    public void init(){
        this.name = "Marley";
    }
    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }
}
