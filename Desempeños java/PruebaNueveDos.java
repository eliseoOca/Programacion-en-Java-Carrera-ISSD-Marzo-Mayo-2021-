import hsa.Console;

public class PruebaNueveDos
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	int n1;
	int n2;
	c.print ("ingrese primer numero:");
	n1 = c.readInt ();
	c.print ("ingrese segundo numero:");
	n2 = c.readInt ();
	if (n1 > n2)
	{
	    c.print ("el mayor es:" + n1);

	}
	else
	{
	    c.print ("el mayor es:" + n2);
	}
    }
}


