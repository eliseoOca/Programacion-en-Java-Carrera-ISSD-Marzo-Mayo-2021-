//Realiza un programa que solicite el ingreso de un valor entero y muestre los números pares
//desde dicho valor hasta el 0 utilizando un ciclo repetitivo. Calcular y mostrar la suma de los
//valores generados. Por ejemplo, si se ingresa el número 10, la salida por pantalla debería ser:
//10-8-6-4-2-0
//La suma es 30
import hsa.Console;

public class R1234
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	int valor;
	int suma = 0;
	c.print ("Ingrese valor: ");
	valor = c.readInt ();
	for (int x = valor ; x >= 0 ; x--)
	{
	    if (x % 2 == 0)
	    {
		suma += x;
		c.print (x + " ");
	    }
	}
	c.println ();
	c.println ("Suma total de numeros pares del valor ingresado es: " + suma);

    }
}
