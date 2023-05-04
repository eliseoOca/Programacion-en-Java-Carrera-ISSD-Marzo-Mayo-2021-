import hsa.Console;

public class Prueba10
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	int valor, valor2, valor3;
	c.print ("ingrese primer valor:");
	valor = c.readInt ();
	c.print ("ingrese segundo valor:");
	valor2 = c.readInt ();
	c.print ("ingrese tercer valor:");
	valor3 = c.readInt ();
	if (valor == valor2)
	{
	    valor3 = (valor + valor2) * valor3;
	    c.print ("la suma de los valores es:" + valor3);
	}
	else
	{
	    c.print ("ninguno es igual");
	}
    }
}
