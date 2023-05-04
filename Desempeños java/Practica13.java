import hsa.Console;

public class Practica13
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();

	int frecuencia;
	c.print ("ingrese rango de frecuencia segun corresponda segun la tabla:");
	frecuencia = c.readInt ();
	if (frecuencia == 3 && frecuencia == 30)
	{
	    c.print ("BANDA:ULF(f.ultra baja)");
	}
	else
	    if (frecuencia == 30 && frecuencia == 300)
	    {
		c.print ("BANDA:ELF(f.extremadamente baja)");
	    }
	    else
		if (frecuencia == 300 && frecuencia == 3)
		{
		    c.print ("BANDA:ILF(F.infra baja)");
		}
		else
		    if (frecuencia == 3 && frecuencia==30)
		    {
			c.print ("BANDA:VLF(F.MUY BAJA");
		    }
		    else
			if (frecuencia == 30 && frecuencia==300)
			{
			    c.print ("BANDA:LF(F.BAJA");
			}
			else
			    if (frecuencia == 300 && frecuencia == 3)
			    {
				c.print ("BANDA:MF(F.MEDIA)");
			    }
			    else
				if (frecuencia == 3 && frecuencia == 30)
				{
				    c.print ("BANDA:HF(F.ALTA)");
				}



    }
}

