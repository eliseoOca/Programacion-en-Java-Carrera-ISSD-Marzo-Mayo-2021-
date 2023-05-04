import hsa.Console;

public class EstructuraFor13
{

    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	int valor = 0;
	int negativos = 0;
	int positivos = 0;
	int multi9 = 0;
	int suma = 0;
	for (int i = 1 ; i <= 10 ; i++)
	{
	    c.print ("Ingrese valor: ");
	    valor = c.readInt ();
	    if (valor < 0)
	    {
		negativos++;
	    }
	    if (valor > 0)
	    {
		positivos++;
	    }
	    if (valor % 9 == 0 && valor != 0)
	    {
		multi9++;
	    }
	    if (valor % 2 == 1 && valor != 0)
	    {
		suma = suma + valor;

	    }

	}
	c.println ("Cantidad de valores negativos: " + negativos);
	c.println ("Cantidad de valores positivos: " + positivos);
	c.println ("Cantidad de valores multiplos de 9: " + multi9);
	c.println ("Suma de los valores  impares: " + suma);


    }



}


