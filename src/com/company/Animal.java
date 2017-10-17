package com.company;

public class Animal {

    private String name;
    // This is the default constructor
    public Animal(){
        System.out.println("An animal has been created...");
    }

    //This is an overloaded constructor
    public Animal(String message){
        name="Bob the Animal";
        System.out.println(message);
    }

    public String getName()
    {
        return name;
    }
    public String setName(String value)
    {
        return name = value;
    }

    public String eat()

    {
        return "An animal eats...";
    }

    public String sleep()
    {
        return "An animal sleeps...";
    }
    public String speak()
    {
        return "An animal makes noise";
    }

    public String displayWhatAnAnimalDoes()
    {
        String output;
        output = this.eat()+" "+ this.sleep();
        return output;
    }

}
