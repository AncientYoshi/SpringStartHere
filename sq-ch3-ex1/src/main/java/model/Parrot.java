package model;

import java.security.SecureRandom;

public class Parrot {
    private String name;

    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return "Parrot : " + name;
    }
}
