import hsa.Console;
class Desempenio
 {
  static Console c;
  public static void main(String arg[])
   {
    float preciopormenor , preciopormayor;
    String nombrearticulo;
    c = new Console();
    c.print ("Ingrese el ART: ");
    nombrearticulo = c.readString();
    c.print ("Ingrese precio por Menor: $");
    preciopormenor = c.readFloat();
    c.print("Igrese precio por mayor: $");
    preciopormayor = c.readFloat();
    c.print("Los precios por mayor es con descuento del 12%.");
    

    preciopormenor=  preciopormenor ; 
    preciopormayor= preciopormayor * 88/100;
    c.println();
    c.println("Precio a pagar por el producto: $" + preciopormayor);
   }
 }

