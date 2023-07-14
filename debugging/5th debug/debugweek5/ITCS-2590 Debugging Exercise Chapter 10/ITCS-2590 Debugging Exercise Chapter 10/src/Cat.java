/*
 *  This file does not require debugging.
 */
public class Cat extends Pet {
    
    public Cat(String name)
    {
        super(name);
    }

    @Override
    public void saySomething()
    {
        System.out.println("Meow.");
    }

    @Override
    public String toString()
    {
        return "Hello, I'm " + name + " the cat.";
    }
}
