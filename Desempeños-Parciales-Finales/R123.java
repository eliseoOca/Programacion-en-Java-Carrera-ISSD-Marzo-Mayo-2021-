//Realiza un programa que solicite el ingreso de un valor entero y luego muestre sus cifras.
//Para lograrlo, deber�s utilizar una operaci�n matem�tica y un ciclo repetitivo. Luego indica
//cuantos d�gitos tiene el n�mero que ingresaste.
import java.awt.*;
import hsa.Console;

public class R123
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	int num;
	int x = 0;
	c.println ("Ingrese un valor: ");
	num = c.readInt ();
	while (num > 0)
	{
	    num = num / 10;
	    if (num != 0)

		{
		    c.println (num);
		}
	    x++;
	}
	c.println ("El valor ingrasado tiene " + x + " cifras ");


    }
}


