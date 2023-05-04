import hsa.Console;
class Ejemplo7 {
 static Console c;
 public static void main (String arg [])
 {
 int n1, n2;
 c = new Console ();
 c.print ("Ingrese Primer numero: ");
 n1 = c.readInt ();
 c.print ("Ingrese Segundo numero: ");
 n2 = c.readInt ();
 c.println ();
 if (n1 > n2)
 {
 c.println ("El mayor es: " + n1);
 }
 else
 {
 c.println ("El mayor es: " + n2);
 }
 } }
