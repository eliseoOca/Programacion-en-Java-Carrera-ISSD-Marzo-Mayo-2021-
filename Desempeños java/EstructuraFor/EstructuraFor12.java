import hsa.Console;

public class EstructuraFor12
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	int n;
	int x;
	int y;
	int cont1=0;
	int cont2=0;
	int cont3=0;
	int cont4=0;
	c.print ("cantidad de puntos: ");
	    n = c.readInt ();
	for (int i = 1 ; i <= n ; i++)
	{
	    c.print ("Ingrese coordenada x: ");
	    x = c.readInt ();
	    c.print ("Ingrse coordenaday: ");
		y = c.readInt ();
	    if (x >0 && y > 0)
	    {
		cont1++;
	    }
	    else
		if (x < 0 && y > 0)
		{
		    cont2++;
		}
		else
		    if (x < 0 && y < 0)
		    {
			cont3++;
		    }
		    else
			if (x > 0 && y < 0)
			{
			    cont4++;
			}
	}
	c.println ("Cantidad de puntos primer cuadrante:" + cont1);
	c.println ("Cantidad de puntos segundo cuadrante:" + cont2);
	c.println ("Cantidad de puntoos tercer cuadrantes:" + cont3);
	c.println ("Cantidad de puntos cuarto cuadrantes:" + cont4);


    }
}
