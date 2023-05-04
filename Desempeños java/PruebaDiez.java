import hsa.Console;

public class PruebaDiez
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	int n;
	c.print ("ingrese numero:");
	n = c.readInt ();
	if (n % 2 == 0)
	{
	    c.print ("es numero par");
	}
	else
	{
	    c.print ("es numero impar");
	}

    }
}


