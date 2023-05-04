import hsa.Console;

public class EstructuraFor8
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	int m = 0;
	int numero;
	for (int i = 1 ; i <= 20 ; i++)
	{
	    c.print ("ingresamos los numeros: ");
	    numero = c.readInt ();
	    if (i == 1)
	    {
		m = numero;
	    }
	    if (numero > m)
	    {
		m = numero;
	    }
	}
	c.println ("el mayor numero ingresados es: " + m);

    }
}
