import hsa.Console;

public class Practica19
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	int precio, dias, vehiculo;
	c.print ("vehiculo 1 = $80.vehiculo 2 = $100. vehiculo 3=$120. vehiculo 4=$150(precios por dia):");
	precio = c.readInt ();
	c.print ("ingrese tipo de vehiculo 1(sedan 4 puertas),2(coupe),3(pick ap),4(4 x 4):");
	vehiculo = c.readInt ();
	c.print ("ingrese los dias de contrato 1 al 7:");
	dias = c.readInt ();
	if (vehiculo == 1)
	{
	    precio = precio * dias;
	    c.print ("precio total a pagar:" + precio);
	}
	else
	    if (vehiculo == 2)
	    {
		precio = precio * dias;
		c.print ("precio total a pagar:" + precio);
	    }
	    else
		if (vehiculo == 3)
		{
		    precio = precio * dias;
		    c.print ("precio total a pagar:" + precio);
		}
		else
		    if (vehiculo == 4)
		    {
			precio = precio * dias;
			c.print ("precio total a pagar:" + precio);
		    }
    }
}
