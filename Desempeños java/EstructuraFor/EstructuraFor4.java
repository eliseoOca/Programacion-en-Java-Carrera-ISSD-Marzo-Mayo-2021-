import hsa.Console;

public class EstructuraFor4
{
    static Console c;
    public static void main (String[] args)
    {
	c = new Console ();
	for (int i = 100 ; i <= 200 ; i++)
	{
	    if (i % 6 == 0)
	    {
		c.print (i + " ");
	    }
	}


    }
}
