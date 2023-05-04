import hsa.Console;

public class Prueba11
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	int x, y;
	c.print ("ingrese coordenada x:");
	x = c.readInt ();
	c.print ("ingrese coordenada y:");
	y = c.readInt ();
	if (x > 0 && y > 0)
	{
	    c.print ("coordenadas del cuadrante 1");
	}
	else
	    if (x < 0 && y > 0)
	    {
		c.print ("coordenadas del cuadrante 2");
	    }
	    else
		if (x < 0 && y < 0)
		{
		    c.print ("coordenadas del cuadrante 3");
		}
		else
		    if (x > 0 && y < 0)
		    {
			c.print ("coordenadas del cuadrante 4");
		    }


    }
}
