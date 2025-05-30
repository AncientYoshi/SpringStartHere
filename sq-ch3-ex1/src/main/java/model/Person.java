package model;

public class Person {
    private String name;
    private Parrot parrot;

    public void setName(String n){
        name = n;
    }

    public void setParrot(String p){
        parrot.setName(p);
    }

    public String getName(){
        return name;
    }

    public Parrot getParrot(){
        return parrot;
    }
}
