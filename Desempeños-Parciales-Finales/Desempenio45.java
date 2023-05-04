import hsa.Console;

public class Desempenio45
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	int x = 0;
	int valor = 0;
	int b = 0;
	int cuenta = 0;
	int cliente = 0;
	int deposito = 1;
	int a = 0;





	while (x <= 9)
	{

	    c.print ("ingrese numero de cuenta: ");
	    cuenta = c.readInt ();
	    c.print ("ingrese monto a depositar hasta 10 o menos clientes: ");
	    valor = c.readInt ();
	    a=a+valor;
	    b=b+valor/10;

	    if (cuenta >= 1)
	    {
		cliente++;

	    }
	    if (valor > 2000)
	    {
		deposito++;



	    }
	    else
	    {
		if (valor < 0)
		{
		    c.print ("cerramos programa: ");
		}
	    }
	    x = x + 1;




	}

	c.println ("cantidad de clientes procesados: " + cliente);
	c.println ("clientes con despositos mayores a 2000:" + deposito);
	c.println ("suma de todos los depositos:" + a);
	c.println ("promedio de depositos:" + b);


    }
}
