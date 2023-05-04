import hsa.Console;

public class Desempeno39
{
    static Console c;

    public static void main (String[] args)
    {
	int x, np, nn, nneg, n;
	c = new Console ();
	x = 1;
	np = 0;
	nn = 0;
	nneg = 0;

	while (x <= 15)
	{
	    c.println ("ingrese un numero:");
	    n = c.readInt ();
	    x = x + 1;
	    if (n == 0)

		nn = nn + 1;
	    if (n >= 0)
		np = np + 1;
	}

	{
	    nneg = nneg + 1;





	}
	c.println ("numeros positivivos:" + np);
	c.println ("numeros negativos:" + nneg);
	c.println ("numeros con ceros:" + nn);
    }
}

