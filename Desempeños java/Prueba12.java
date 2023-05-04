import hsa.Console;

public class Prueba12
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	String nombre;
	int preguntas, respuestas, porcentaje;
	c.print ("ingresa nombre postulante:");
	nombre = c.readLine ();
	c.println ("cantidad de preguntas(10)");

	c.print ("ingrese cantidad de respuestas correctas:");
	respuestas = c.readInt ();

	if (respuestas == 10)
	{
	    c.print ("nivel superior entre (90% y 100%)");
	}
	else
	    if (respuestas >= 7 && respuestas <= 9)
	    {
		c.print ("nivel medio entre (75% y 80%)");
	    }
	    else
		if (respuestas >= 5 && respuestas < 7)
		{
		    c.print ("nivel regular (entre 50% y 70%)");
		}
		else
		    if (respuestas < 5)
		    {
			c.print ("fuera de nivel (entre 10%y 40%)");
		    }


    }
}
