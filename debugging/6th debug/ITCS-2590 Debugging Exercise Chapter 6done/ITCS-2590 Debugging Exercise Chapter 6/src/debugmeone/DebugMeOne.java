package debugmeone;

/*
 * Debugging Exercise - Chapter 6, Part I
 *
 * Debug the error(s) and submit to the Dropbox
 * Please do not submit if it is not debugged
 *
 * NOTE:    There are two methods below, foo and foobar, that should
 *          print to the console the words
 *
 *          foo!
 *          foobar!
 *
 *          Neither method functions correctly.
 */
public class DebugMeOne
{
    public static void main(String[] args)
    {
        foo();
        foobar();
    }
        public static void foo() 
        {
            System.out.println("foo!");
        }

        public static void foobar() 
        {
            System.out.println("foobar!");
        }
    }

