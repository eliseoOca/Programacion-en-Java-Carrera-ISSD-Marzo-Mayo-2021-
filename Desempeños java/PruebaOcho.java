import hsa.Console;

public class PruebaOcho
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	int sueldo;
	int descuento;
	int sueldoAcobrar;
	c.print ("Sueldo Operario:");
	sueldo = c.readInt ();
	if (sueldo > 5000)
	{
	    descuento = sueldo * 10 / 100;
	    sueldoAcobrar = sueldo - descuento;
	    c.print ("sueldo a cobrar:" + sueldoAcobrar);
	}
	if (sueldo < 5000)
	{
	    c.print ("sueldo a cobrar:" + sueldo);
	}
    }
}
