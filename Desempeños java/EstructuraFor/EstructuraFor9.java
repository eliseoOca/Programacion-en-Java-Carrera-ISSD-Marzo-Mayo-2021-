import hsa.Console;

public class EstructuraFor9
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	int r=0;

	for (int i = 1 ; i <= 20 ; i++)
	{
	    r = 5 * i;
	    c.println (5 + " X " + i + " = " + r);
	}


    }
}
