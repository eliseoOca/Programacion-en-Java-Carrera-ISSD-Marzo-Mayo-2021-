import java.awt.*;
import hsa.Console;

public class FinalExamen
{
    static Console c;
    String Nombre[] = new String [3];
    int precio[] = new int [3];
    int cantidad[] = new int [3];

    void nombreArticulo ()
	/*2- Ingresar el Nombre de un artículo y mostrar el precio y la cantidad que le corresponde,
	comoseindicaacontinuación*/
    {
	for (int f = 0 ; f < Nombre.length ; f++)
	{
	    c.print ("Ingrese nombre de articulo: ");
	    Nombre [f] = c.readLine ();
	    c.print ("Ingrese precio del articulo:");
	    precio [f] = c.readInt ();
	    c.print ("Ingrese cantidad: ");
	    cantidad [f] = c.readInt ();

	}
    }


    void cantidad ()  //3- Realizar un listado ordenado por precio en forma descendente
    {
	c.println ("Listado ordenado");
	for (int f = 0 ; f < precio.length ; f++)

	    {

		c.println ("Precio: " + precio [f] + "-----" + "NomBre: " + Nombre [f] + "-----" + "Cantidad: " + cantidad [f]);
	    }
    }


    void listadoArti ()  //3- Realizar un listado ordenado por precio en forma descendente
    {
	for (int k = 0 ; k < 2 ; k++)
	{
	    for (int f = 0 ; f < 2 ; f++)
	    {
		if (precio [f] < precio [f + 1])
		{
		    int aux;
		    aux = precio [f];
		    precio [f] = precio [f + 1];
		    precio [f + 1] = aux;
		}

	    }
	    c.println ("**********************");

	}
    }


    void ArticuloMayor ()  //4- Mostrar los datos del artículo que posee mayor cantidad.
    {
	c.println ("Articulos que poseen mayor cantidad");
	for (int f = 0 ; f < cantidad.length ; f++)
	{

	    c.println ("cantidad: " + cantidad [f] + "-----" + "Nombre: " + Nombre [f] + "-----" + "Precio: " + precio [f]);

	}
    }


    void mayorSi ()
    {
	for (int k = 0 ; k < 2 ; k++)
	{
	    for (int f = 0 ; f < 2 ; f++)
	    {
		if (cantidad [f] < cantidad [f + 1])
		{
		    int aux;
		    aux = cantidad [f];
		    cantidad [f] = cantidad [f + 1];
		    cantidad [f + 1] = aux;
		}

	    }

	}

    }


    void Alternativas ()
    {
	String aux;
	c.print ("Ingrese su consulta por nombre e art:");
	aux = c.readLine ();
	int existe = 0;
	for (int f = 0 ; f < Nombre.length ; f++)
	{
	    if (aux.equals (Nombre [f]))
	    {
		c.println ("Tu consulta por el articulo:" + "Nombre: " + Nombre [f] + "Precio: " + precio [f] + "Cantidad: " + cantidad [f]);
		existe = 1;
	    }
	}
	if (existe == 0)
	{
	    c.println ("No existe este art");
	}
    }


    public static void main (String[] args)
    {
	c = new Console ();
	FinalExamen f = new FinalExamen ();
	f.nombreArticulo (); //1
	f.listadoArti (); //3
	f.cantidad (); //2
	f.listadoArti (); //3
	f.mayorSi ();
	f.ArticuloMayor ();
	f.mayorSi ();
	f.Alternativas ();




    }
}


