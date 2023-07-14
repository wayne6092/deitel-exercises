/*
 *  This file does not require debugging.
 */
public class Parrot extends Bird {

    public Parrot (String name)
    {
        super(name);
    }

    @Override
    public void saySomething()
    {
        System.out.println("Pauly want a craker?");
    }

    @Override
    public String toString()
    {
        return "Hello, I'm " + name + " the parrot.";
    }

}
