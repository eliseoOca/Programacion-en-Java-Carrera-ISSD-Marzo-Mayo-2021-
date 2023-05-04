import hsa.Console;

public class DesempenioNueve
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	int valor;
	c.print ("ingrese valor del 1 al 99:");
	valor = c.readInt ();
	if (valor >= 10)
	{
	    c.print ("tiene 2 digitos");
	}
	else
	{
	    c.print ("tiene 1 digito");
	}

    }
}
