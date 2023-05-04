import hsa.Console;

public class PruebaNueve
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	int valor1;
	int valor2;
	int total;
	int promedio;
	c.print ("primer valor:");
	valor1 = c.readInt ();
	c.print ("segund valor:");
	valor2 = c.readInt ();
	total = valor1 + valor2;
	promedio = (valor1 + valor2) / 2;
	if (promedio > 10)
	{
	    total = total - 2;

	}
	total = total - 2;
       
	c.println ("total a pagar:" + total);
    }
}
