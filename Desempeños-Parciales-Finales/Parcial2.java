
import hsa.Console;
import java.lang.String.*;
import java.util.Arrays;

public class LibreriaDeCordoba
{
    static Console c;
    static int largoCadena = 3;
    static int codigo[] = new int [largoCadena];
    static String desc[] = new String [largoCadena];
    static String descAux[] = new String [largoCadena];
    static int auxGenero = 0;
    static String gen[] = new String [largoCadena];
    static int cantUnidad[] = new int [largoCadena];
    static int cantReservado[] = new int [largoCadena];
    static String elejirGenero[] = {"Aventura", "Ficcion", "Infantil"};


    public static void main (String[] args)
    {
	cargarLibro ();
	mostrarLibroOrdenados ();
	consultarPorDescripcion();
	consultarTotalLibrosReservados ();
	consultarGeneroMayorReserva();

    }


    static void cargarLibro ()
    {
	c = new Console ();

	for (int i = 0 ; i < largoCadena ; i++)
	{

	    codigo [i] = 1000 + (i + 1);
	    c.print ("Ingrese descripcion del libro: ");
	    desc [i] = c.readLine ();
	    c.print ("Ingrese el genero del libro: ");
	    auxGenero = c.readInt ();

	    if (auxGenero == 1)
	    {
		gen [i] = elejirGenero [0];
	    }
	    if (auxGenero == 2)
	    {
		gen [i] = elejirGenero [1];
	    }
	    if (auxGenero == 3)
	    {
		gen [i] = elejirGenero [2];
	    }

	    c.print ("Ingrese cantidad de unidades: ");
	    cantUnidad [i] = c.readInt ();
	    c.print ("Ingrese cantidad de reservados: ");
	    cantReservado [i] = c.readInt ();
	    c.println ("Libro ingresado:");
	    c.println ("ID: " + codigo [i] + ", Libro ingresado: " + desc [i] + ", Genero: " + gen [i] + ", Cantidad Unidades: " + cantUnidad [i] + ", Cantidad reservado: " + cantReservado [i]);

	}
	c.println ("------------------------------------------------------");
    }


    static void mostrarLibroOrdenados ()
    {

	for (int k = 0 ; k < largoCadena ; k++)
	{
	    descAux [k] = desc [k];
	}

	Arrays.sort (desc);
	c.println ("Lista de libros ordenados alfabeticamente");

	for (int j = 0 ; j < largoCadena ; j++)
	{
	    for (int i = 0 ; i < largoCadena ; i++)
	    {
		if (desc [j] == descAux [i])
		{
		    c.println ("ID: " + codigo [i] + ", Libro: " + descAux [i] + ", Genero: " + gen [i] + ", Cant. Unidades: " + cantUnidad [i] + ", Cant. reservado: " + cantReservado [i]);
		}
	    }
	}
	c.println ("------------------------------------------------------");
    }


    static void consultarPorDescripcion ()
    {
	c.print ("Ingrese el nombre del libro que desee buscar: ");
	String descripcion = c.readLine ();

	for (int i = 0 ; i < largoCadena ; i++)
	{
	    if (desc [i].equalsIgnoreCase (descripcion))
	    {
		c.println ("Libro buscado: ID: " + codigo [i] + ", Libro: " + desc [i] + ", Genero: " + gen [i] + ", Cant. Unidades: " + cantUnidad [i] + ", Cant. reservado: " + cantReservado [i]);
		break;
	    }
	}
	c.println ("------------------------------------------------------");
    }


    static void consultarTotalLibrosReservados ()
    {
	c.print ("Consultando cantidad de libros reservados.....");
	int cantidadReservados = c.readInt ();
	
	for (int i = 0 ; i < largoCadena ; i++)
	{
	    cantidadReservados += cantReservado [i];
	}

	c.print ("Cantidad de libros reservados: " + cantidadReservados);
	c.println ("------------------------------------------------------");
    }


    static void consultarGeneroMayorReserva ()
    {
	c.print ("Consultando libro con genero con mayor reserva...");

	int contUno = 0;
	int contDos = 0;
	int contTres = 0;

	for (int i = 0 ; i < largoCadena ; i++)
	{
	    if (gen[i].equalsIgnoreCase ("Aventura"))
	    {
		contUno++;
	    }
	    if (gen[i].equalsIgnoreCase ("Ficcion"))
	    {
		contDos++;
	    }
	    if (gen[i].equalsIgnoreCase ("Infantil"))
	    {
		contTres++;
	    }
	}

	if (contTres > contUno && contTres > contDos)
	{
	    for (int i = 0 ; i < largoCadena ; i++)
	    {
		if (gen[i].equalsIgnoreCase ("Infantil"))
		{
		    c.println ("Genero con mayor reserva: ID: " + codigo [i] + ", Libro: " + desc [i] + ", Genero: " + gen [i] + ", Cant. Unidades: " + cantUnidad [i] + ", Cant. reservado: " + cantReservado [i]);
		}
	    }
	}
	if (contDos > contTres && contDos > contUno)
	{
	    for (int i = 0 ; i < largoCadena ; i++)
	    {
		if (gen[i].equalsIgnoreCase ("Ficcion"))
		{
		    c.println ("Genero con mayor reserva: ID: " + codigo [i] + ", Libro: " + desc [i] + ", Genero: " + gen [i] + ", Cant. Unidades: " + cantUnidad [i] + ", Cant. reservado: " + cantReservado [i]);
		}
	    }
	}
	if (contUno > contDos && contUno > contTres)
	{
	    for (int i = 0 ; i < largoCadena ; i++)
	    {
		if (gen[i].equalsIgnoreCase ("Aventura"))
		{
		    c.println ("Genero con mayor reserva: ID: " + codigo [i] + ", Libro: " + desc [i] + ", Genero: " + gen [i] + ", Cant. Unidades: " + cantUnidad [i] + ", Cant. reservado: " + cantReservado [i]);
		}
	    }
	}

	c.println ("------------------------------------------------------");
    }
}
