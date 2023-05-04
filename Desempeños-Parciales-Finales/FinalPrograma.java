import java.awt.*;
import hsa.Console;

public class FinalPrograma
{
    static Console c;
    String[] orden = new String [3];
    String[] peliculas = new String [3];
    int[] cantidad = new int [3];
    int[] cantidadAl = new int [3];
    int[] stock = new int [3];
    int[] codigos = new int [3];
    int[] stockMas = new int [3];
    int[] stockMenor = new int [3];
    int[] codigo = new int [3];


    void peliculas ()  //a | Ingresar N cantidad de datos, mediante un menú de opciones.
    {
	for (int f = 0 ; f < orden.length ; f++)
	{
	    c.print ("Ingrese descripcion(titulo) de la pelicula:");
	    orden [f] = c.readLine ();
	    c.print ("Ingresar codigo de pelicula: ");
	    codigo [f] = c.readInt ();
	   



	}
	c.println ("********************************************");

    }


    void codigoPelocula ()  //h | Mostrar un Listado ordenados por Código de película.
    {
	for (int f = 0 ; f < codigo.length ; f++)
	{
	    c.println (" * " + "Cod.Pel: " + codigo [f] + " Pelicula: " + orden [f]);
	}
    }


    void imprimir4 ()  //h | Mostrar un Listado ordenados por Código de película.
    {
	for (int k = 0 ; k > 2 ; k++)
	{
	    for (int f = 0 ; f > 2 ; f++)
	    {
		if (codigo [f] < codigo [f + 1])
		{
		    int aux;
		    aux = codigo [f];
		    codigo [f] = codigo [f + 1];
		    codigo [f + 1] = aux;

		}

	    }

	}
    }


    void imprimir3 ()  //d | Mostrar un Listado de películas ordenadas por descripción
    {
	c.println ("**Menu ordenado segun descripcion**");
	for (int f = 0 ; f < orden.length ; f++)
	    c.println ("Cod Pel >>> " + codigo [f] + " / " + "<<<<" + orden [f] + ">>>>");
	c.println ("********************************************");
    }


    void ordenar ()  //d | Mostrar un Listado de películas ordenadas por descripción
    {
	for (int k = 0 ; k < orden.length - 1 ; k++)
	{
	    for (int f = 0 ; f < orden.length - 1 ; f++)
	    {
		if (orden [f].compareTo (orden [f + 1]) > 0)
		{
		    String aux = orden [f];
		    orden [f] = orden [f + 1];
		    orden [f + 1] = aux;
		}
	    }
	}
	c.println ("********************************************");
    }


    void cargar ()  //b | Indicar cantidad de películas por género.
    {
	for (int f = 0 ; f < peliculas.length ; f++)
	{
	    c.print ("pelicula seleccionada" + "*** " + orden [f] + " ***" + "Ingresar genero:");
	    peliculas [f] = c.readLine ();
	    c.print ("Ingrese la cantidad de copias:");
	    cantidad [f] = c.readInt ();

	}
	c.println ("********************************************");
    }


    void imprimir ()  //b | Indicar cantidad de películas por género.
    {
	c.println ("Listado de cantidad de pelicula por genero");
	for (int f = 0 ; f < peliculas.length ; f++)
	{
	    c.println (peliculas [f] + " " + cantidad [f]);

	}
	c.println ("********************************************");
    }


    void alquiler ()  //c | Indicar la cantidad total de copias alquiladas.
    {
	for (int f = 0 ; f < cantidadAl.length ; f++)
	{

	    c.print ("Copias alquiladas de  " + " *** " + orden [f] + " *** " + ":");
	    cantidadAl [f] = c.readInt ();

	}
	c.println ("********************************************");
    }


    void orden ()  //g | Mostrar qué género se alquila más (Búsqueda del mayor).
    {
	for (int k = 0 ; k < 1 ; k++)
	{
	    for (int f = 0 ; f < 1 ; f++)
	    {
		if (cantidadAl [f] < cantidadAl [f + 1])
		{
		    int aux;
		    aux = cantidadAl [f];
		    cantidadAl [f] = cantidadAl [f + 1];
		    cantidadAl [f + 1] = aux;

		}

	    }

	}
    }





    void imprimir2 ()  //c | Indicar la cantidad total de copias alquiladas.
    {
	c.println ("Total de copias y sus Generos mas alquilados");
	for (int f = 0 ; f < cantidadAl.length ; f++)
	{
	    c.println (peliculas [f] + " >>>> " + cantidadAl [f] + " copias alquiladas de: " + orden [f]);

	}


	c.println ("********************************************");
    }


    void sumaVectores ()
    {
	for (int f = 0 ; f < stock.length ; f++)
	{
	    stock [f] = cantidad [f] - cantidadAl [f];
	}
    }


    void imprimirVec ()  //e | Por cada película indicar la cantidad de películas que quedan en stock. El stock de películas está dado por la diferencia entre las Cantidad de copias y las Copias alquiladas. Generar un vector llamado stock con esta información.
    {
	for (int f = 0 ; f < stock.length ; f++)
	{
	    stock [f] = cantidad [f] - cantidadAl [f];
	    c.println ("Copias restante de la pelicula " + "'" + orden [f] + "'" + " es >>> " + stock [f] + " ");
	}
	c.println ("********************************************");
	c.println ();
    }



    void imprimirStockMasDeCinco ()  //i | Mostrar todas las películas que posean en Stock de más de 5 películas.
    {
	c.println ("Peliculas con stock mayor de cinco");
	for (int f = 0 ; f < stockMas.length ; f++)
	{
	    if (stock [f] > 5)
	    {
		c.println (orden [f] + " --- " + " con stock de: " + stock [f]);
	    }
	    else
	    {
		c.println (orden [f] + " ---No hay Stock mayor a 5 ");
	    }
	}
	c.println ("********************************************");
	c.println ();
    }


    void imprimirConsulta ()  //j | Realizar una consulta por descripción.
    {
	String aux;
	c.print ("Ingrese nombre de la pelicula a consultar:");
	aux = c.readLine ();
	int existe = 0;
	for (int f = 0 ; f < orden.length ; f++)
	{
	    if (aux.equals (orden [f]))
	    {
		c.println ("Tu consulta por la pelicula:" + orden [f] + " --- Genero: " + peliculas [f] + " --- su stock es de: " + stock [f]);
		existe = 1;
	    }
	}
	if (existe == 0)
	{
	    c.println ("No existe el nombre de esa pelicula");
	}
	c.println ("********************************************");
	c.println ();
    }


    void imprimirCodigo ()  //f | Ingresar un Código de película y mostrar todos sus datos.(listo)
    {
	int aux;
	c.print ("Ingresar codigo a consultar:");
	aux = c.readInt ();
	int exis2 = 0;
	for (int f = 0 ; f < codigo.length ; f++)
	{
	    if (aux == codigo [f])
	    {
		c.print ("Cod Pel: " + codigo [f] + " /Descripcion: " + orden [f] + " /Genero: " + peliculas [f] + " /Cant de Copias:  " + cantidad [f] + " /Cop.Alquiladas: " + cantidadAl [f]);
		exis2 = 1;
	    }

	}
	if (exis2 == 0)
	{
	    c.print ("Codigo erroneo");
	}
    }



    void imprimirStockMenos ()  //k | Mostrar todas las películas en las que el Stock es inferior a 3.
    {
	c.println ("Peliculas con stock menor a tres");
	for (int f = 0 ; f < stockMenor.length ; f++)
	{
	    if (stock [f] < 3)
	    {
		c.println (orden [f] + " --- " + "con stock de: " + stock [f]);
	    }
	    else
	    {
		c.println ("el stock es mayor a 3");
	    }
	}


	c.println ("********************************************");
	c.println ();
    }









    public static void main (String[] args)
    {
	c = new Console ();

	FinalPrograma f = new FinalPrograma ();
	f.peliculas ();
	f.imprimir4 ();
	f.codigoPelocula ();
	f.imprimir4 ();
	f.ordenar ();
	c.println ("Descripcion ordenadas alfabaticamente.");
	f.imprimir3 ();
	f.cargar ();
	f.imprimir ();
	f.orden ();
	f.alquiler ();
	f.orden ();
	f.imprimir2 ();
	f.imprimirVec ();
	f.imprimirStockMasDeCinco ();
	f.imprimirStockMenos ();
	f.imprimirConsulta ();
	f.imprimirCodigo ();



    }
}


