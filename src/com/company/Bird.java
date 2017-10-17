package com.company;

public class Bird extends Animal {

    private String color;
    private int weight;

    public String getColor()
    {
        return  color;
    }
    public void setColor(String value)
    {
        this.color = value;
    }

    public int getWeight()
    {
        return weight;
    }

    public void setWeight(int value)
    {   if (value < 100) {
        this.weight = value;
    }else
        {
             this.weight = 1;
        }
    }

    public String fly()
    {
        return "A bird files...";
    }

    @Override
    public String speak()
    {
        return "A bird tweets";
    }
}
