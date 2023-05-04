import hsa.Console;

public class EstructuraFor7
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	int suma = 0;
	int numero;
	for (int i = 1 ; i <= 15 ; i++)
	{
	    c.print ("ingrese numero: ");
	    numero = c.readInt ();
	    if (i > 5)
	    {
		suma = suma + numero;
	    }
	}
	c.println ("sumas de los ultimos 10 numeros: " + suma);

    }
}
