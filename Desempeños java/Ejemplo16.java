import hsa.Console;
class Ejemplo16
{
    static Console c;
    public static void main (String arg[])
    {
	int dia, mes, anio, cantidad;
	c = new Console ();
	c.print ("Ingrese dia: ");
	dia = c.readInt ();
	c.print ("Ingrese mes: ");
	mes = c.readInt ();
	c.print ("Ingrese anio: ");
	anio = c.readInt ();
	cantidad = 0;
	switch (mes)
	{
	    case 1:
	    case 3:
	    case 5:
	    case 7:
	    case 8:
	    case 10:
	    case 12:
		cantidad = 31;
		break;
	    case 4:
	    case 6:
	    case 9:
	    case 11:
		cantidad = 30;
		break;
	    case 2:
		if (((anio % 4 == 0) &&
			    !(anio % 100 == 0))
			|| (anio % 400 == 0))
		    cantidad = 29;
		else
		    cantidad = 28;
		break;
	}
	c.println ();
	c.println ("Al mes de esa fecha, le coresponden:" + cantidad + " dias");
    }
}
