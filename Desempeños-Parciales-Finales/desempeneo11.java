import hsa.Console;
class desempeneo11
{
 static Console c;
 public static void main (String arg [])
 {
 int dia, mes , aneo;
 c = new Console ();
 c.print ("Ingrese día: ");
 dia = c.readInt ();
 c.print ("Ingrese mes: ");
 mes = c.readInt ();
 c.print ("ingrese el aneo: ");
 aneo = c.readInt();
 c.println ();
 if (mes <= 3 )
 {
 c.println("Corresponde al primer trimestre");
 }
 else
 {
 c.println("No corresponde al primer trimestre");
  }
 }
}
