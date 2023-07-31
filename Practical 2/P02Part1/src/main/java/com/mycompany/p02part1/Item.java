package com.mycompany.p02part1;
public class Item
{
    private int location;
    private String description;
    
    public Item(int location,String desc)
    {
        this.location=location;
        this.description=desc;
    }
    public void getter()
    {
        System.out.println("Location:"+location);
        System.out.println("description"+description);
    }
}
