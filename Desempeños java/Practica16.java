import hsa.Console;

public class Practica16
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();

	int dia;
	c.print ("ingrese numero de dia del 1 al 7:");
	dia = c.readInt ();
	if (dia == 1)
	{
	    c.print ("Corresponde al dia domingo");
	}
	else
	    if (dia == 2)
	    {
		c.print ("corresponde al dia lunes");
	    }
	    else
		if (dia == 3)
		{
		    c.print ("corresponde al dia martes");
		}
		else
		    if (dia == 4)
		    {
			c.print ("corresponde al dia miercoles");
		    }
		    else
			if (dia == 5)
			{
			    c.print ("corresponde al dia jueves");
			}
			else
			    if (dia == 6)
			    {
				c.print ("corresponde al dia viernes");
			    }
			    else
				if (dia == 7)
				{
				    c.print ("corresponde al dia sabado");
				}


    }
}
