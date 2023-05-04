import java.awt.*;
import hsa.Console;

public class Desempeno
{
    static Console c;

    public static void main (String[] args)
    {
	int n;
	c = new Console ();
	int i = 0;
	int a = 0;

	while (i <= 10)
	{
	    c.print ("ingrese el numero:");
	    n = c.readInt ();
	    i = i + 1;
	    if (i > 6)

		a = a + n;

	}

	c.print ("la suma de los ultimos 5 digitos es:" + a);


    }
}


