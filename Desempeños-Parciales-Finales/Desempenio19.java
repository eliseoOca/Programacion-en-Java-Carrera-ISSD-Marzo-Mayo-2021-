import hsa.Console;
class Desempenio19
{
    static Console c;
    public static void main (String arg[])
    {
	int valor1, valor2, valor3, resultado;
	c = new Console ();
	c.print ("ingrese el primer valor: ");
	valor1 = c.readInt ();
	c.print ("ingrese el segundo valor: ");
	valor2 = c.readInt ();
	c.print ("ingrese el tercer valor: ");
	valor3 = c.readInt ();
	c.println ();
	if (valor1 == valor2)
	{
	    c.println ("los tres valores son iguales.solucion:" + valor1 + valor2 * valor3);
	}
	else
	    if (valor2 > valor1)
	    {
		c.println ("los tres valores no son iguales");
	    }
	    else
	    {
		c.println ("los valores son iguales");
	    }
    }
}
