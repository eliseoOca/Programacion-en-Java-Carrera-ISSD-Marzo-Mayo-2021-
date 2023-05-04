import hsa.Console;

public class PruebaOnce
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	int dia;
	int mes;
	c.print ("ingrese dia:");
	dia = c.readInt ();
	c.print ("ingrese mes:");
	mes = c.readInt ();
	if (dia == 25 && mes == 12)
	{
	    c.print ("si corresponde a navidad");
	}
	else
	{
	    c.print ("no corresponde a navidad");
	}
    }
}
