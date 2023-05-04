import hsa.Console;

public class EstructuraFor6
{
    static Console c;
    

	public static void main (String[] args)
    {
	c = new Console ();
	int cant = 0;
	int n;
	int b;
	int h;
	int superficie;
	c.print ("medida de dato: ");
	n = c.readInt ();
	c.println ();
	for (int i = 1 ; i <= n ; i++)
	{
	    c.println ("ingrese base: ");
	    b = c.readInt ();
	    c.println ("ingrese altura: ");
	    h = c.readInt ();
	    superficie = b * h;
	    c.println ("la superficie es: " + superficie);
	    c.println ("la base es: " + b);
	    c.println ("la altura es: " + h);

	    if (superficie > 12)
	    {
		cant++;
	    }
	}
	c.println ("la cantidad de triangulos sur a 12: " + cant);
    }
}
