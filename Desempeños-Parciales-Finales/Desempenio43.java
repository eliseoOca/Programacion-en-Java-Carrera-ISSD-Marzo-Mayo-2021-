import hsa.Console;

public class Desempenio43
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();

	int precios;
	int x = 1;
	int menor = 0;
	int ambos = 0;
	int mayor = 0;

	while (x <= 12)
	{
	    c.print ("ingresa los precios:");
	    precios = c.readInt ();

	    if (precios < 50)
	    {
		menor++;

	    }

	    if (precios >= 50 && precios <= 100)
	    {
		ambos++;

	    }


	    if (precios > 100)
	    {
		mayor++;

	    }
	    x = x + 1;


	}

	c.println ("los precios menores a 50 son:" + menor);
	c.println ("los precios entre 50 y 100 son:" + ambos);
	c.println ("los precios mayores a 100 son:" + mayor);
    }
}


