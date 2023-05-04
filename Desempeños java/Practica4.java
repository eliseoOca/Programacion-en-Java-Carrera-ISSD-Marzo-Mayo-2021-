import hsa.Console;

public class Practica4
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	int dia, mes, anio;
	c.print ("ingrese dia del 1 al 31:");
	dia = c.readInt ();
	c.print ("ingrese mes del 1 al 12:");
	mes = c.readInt ();
	c.print ("ingrese anio(2021):");
	anio = c.readInt ();
	if (mes <= 3)
	{
	    c.println ("corresponde al primer trimestre");
	}
	else
	{
	    if (mes > 3)
	    {
		c.println ("no corresponde al primer trimestre");
	    }
	}
    }
}
