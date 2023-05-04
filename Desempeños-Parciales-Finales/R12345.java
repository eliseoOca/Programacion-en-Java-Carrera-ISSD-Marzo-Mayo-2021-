//Calcular y mostrar la suma de los 15 términos de la serie:
//23 x 6 + 27 x 6 + 31 x 6 + 35 x 6 + … =
//15 Términos
import hsa.Console;

public class R12345
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	int suma = 0;
	int multi;
	int num = 23;
	int x = 0;
	do
	{
	    multi = num * 6;
	    suma += multi;
	    num = num + 4;

	    c.println (num + " x 6 = " + multi);
	    x++;
	}
	while (x < 15);
	c.println ("la suma de los 15 terminos es: " + suma);


    }
}
