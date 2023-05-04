import hsa.Console;

public class Practica23
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	int x = 0;
	int a = 0;
	int n;
	while (x <= 9)
	{
	    c.print ("ingrese valores: ");
	    n = c.readInt ();
	    a = a + n;
	    x = x + 1;
	}
	if (x > 5)
	{
	    c.print ("la suma de los ultimos 5 numeros es: " + a);
	}

    }
}

