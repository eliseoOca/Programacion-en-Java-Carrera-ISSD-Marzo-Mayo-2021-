import hsa.Console;

public class Practica20
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	int n = 0;
	int x = 0;

	while (x <= 99)
	{

	    n = n + 1;
	    x = x + 1;
	    c.print (n + " + ");
	}


    }
}
