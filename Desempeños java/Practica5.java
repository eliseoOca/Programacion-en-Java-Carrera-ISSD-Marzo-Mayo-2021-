import hsa.Console;

public class Practica5
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	float precio, codigo, descuento;
	c.print ("ingrese precio del art:");
	precio = c.readFloat ();
	c.print ("ingrese codigo del 1 al 2:");
	codigo = c.readFloat ();

	if (codigo == 1)
	{
	    precio = precio * 95 / 100;
	    c.println ("pago al contado con descuento:" + precio);
	}
	else
	{
	    if (codigo == 2)
		;
	}
	{
	    precio = precio *(float)1.1;
	    c.println ("pago por tarjeta con recargo:" + precio);
	}

    }
}


