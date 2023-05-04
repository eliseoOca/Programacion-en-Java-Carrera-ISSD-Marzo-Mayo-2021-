import hsa.Console;
class Ejemplo8 {
 static Console c;
 public static void main (String arg [])
 {
 int n;
 c = new Console ();
 c.print ("Ingrese un numero: ");
 n = c.readInt ();

 c.println ();
 if (n % 2 == 0)
 {
 c.println ("El numero es Par");
 }
 else
 {
 c.println ("El numero es Impar");
 }
 } }
