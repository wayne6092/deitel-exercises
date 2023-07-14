/*
 *  This file does not require debugging.
 */
public class Dog extends Pet {

    public Dog (String name)
    {
        super(name);
    }

    @Override
    public void saySomething()
    {
        System.out.println("Ruff, ruff!");
    }

    @Override
    public String toString()
    {
        return "Hello, I'm " + name + " the dog.";
    }
}
