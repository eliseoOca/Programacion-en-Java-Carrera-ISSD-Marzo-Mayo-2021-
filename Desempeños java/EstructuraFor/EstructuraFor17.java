//Ingres� un n�mero y mostr� todos los
//divisores de ese n�mero.
import hsa.Console;
//Ingres� un n�mero y mostr� todos los
//divisores de ese n�mero.
public class EstructuraFor17
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	int n;
	c.print ("Introduce un numero: ");
	n = c.readInt ();
	for (int i = 1 ; i <= n ; i++)
	{
	    if (n % i == 0)
	    {
		c.print (i + " " );
	    }
	}











    }



}
