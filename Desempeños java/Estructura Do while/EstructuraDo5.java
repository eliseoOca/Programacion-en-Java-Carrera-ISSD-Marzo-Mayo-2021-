//Se realizó un censo provincial y se desea
//procesar la información obtenida. De cada
//una de las personas censadas se tiene la
//siguiente información: número de documento,
//edad y sexo ("femenino" o "masculino").
//Confeccioná un programa que lea los datos
//de cada persona censada (luego de ingresar
//un juego de datos, se debe preguntar si
//se quiere ingresar otro juego). Informá lo
//siguiente:
//a | Cantidad de personas censadas.
//b | Cantidad de varones.
//c | Cantidad de mujeres.
//d | Cantidad de varones mayores o iguales a
//18 años.
import hsa.Console;

public class EstructuraDo5
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	int documento;
	int edad;
	char genero;
	int cantidad = 0;
	int contvarones = 0;
	int contmujeres = 0;
	int mayores = 0;


	do
	{
	    c.print ("Ingrese numero DNI(0 PARA FINALIZAR): ");
	    documento = c.readInt ();
	    if (documento != 0)
	    {


		c.print ("Ingrese edad: ");
		edad = c.readInt ();
		c.print ("Ingrese el genero (m/f): ");
		genero = c.readChar ();
		if (genero == 'm')
		{
		    contvarones = contvarones + 1;
		}
		if (genero == 'f')
		{
		    contmujeres = contmujeres + 1;
		}
		if (edad >= 18)
		{
		    mayores++;
		}
		cantidad++;
	    }

	}





	while (documento != 0)
	    ;
	c.println ("Cantidad total de personas censadas: " + cantidad);
	c.println ("Cantidad de varones: " + contvarones);
	c.println ("Cantidad de mujeres: " + contmujeres);
	c.println ("Cantidad de mayores: " + mayores);




    }
}


