import hsa.Console;

public class Desempeno42
{
    static Console c;

    public static void main (String[] args)
    {
	int i, serie, a;
	c = new Console ();
	i = 1;
	serie = 500;
	a = 0;

	while (i <= 15)
	{
	    c.println (serie + " ");
	    a = a + serie;
	    serie = serie + 25;
	    i++;
	}


    }
}


