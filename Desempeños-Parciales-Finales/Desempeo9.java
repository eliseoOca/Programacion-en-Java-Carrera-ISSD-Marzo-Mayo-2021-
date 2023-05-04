import hsa.Console;
class  Desempeo9 {
 static Console c;
 public static void main (String arg [])
 {
 int n;
 c = new Console ();
 c.print ("Ingrese un numero: ");
 n = c.readInt ();

 c.println ();
 if (n <10 )
 {
 c.println ("El tiene un caracter");
 }
 else
 {
 c.println ("El numero tiene dos caracteres");
 }
 } }
