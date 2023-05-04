import hsa.Console;
class EjerEsteban
{
    static Console c;
    public static void main (String arg[])
    {
	int totalpreguntas, totalcorrectas,porcentaje;
	c = new Console ();
	c.print ("ingrese cantidad total de preguntas del examen:");
	totalpreguntas = c.readInt ();
	c.print ("ingrese cantidad de preguntas cotestadas correctamente:");
	totalcorrectas = c.readInt ();
	c.println ();
	porcentaje = totalcorrectas * 100 / totalpreguntas;
	if (porcentaje >= 90)
	{
	    c.println ("nivel maximo");
	}


	else

	    if (porcentaje >= 75)
	    {
		c.println ("nivel medio");
	    }


	else

	    if (porcentaje >= 50)
	    {
		c.println ("nivel regular");
	    }


	else
	{

	    c.println ("fuera de nivel");
	}
    }
}
