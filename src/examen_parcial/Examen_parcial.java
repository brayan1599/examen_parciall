
package examen_parcial;

import java.util.Scanner;


public class Examen_parcial {

  
    public static void main(String[] args) {
           Telefono tel = new Telefono();
           Operadores ope=new Operadores();
           String plan;
           Scanner input= new Scanner(System.in);
           System.out.println("Examen Parcial");
           System.out.println("Brayan Ñahuis");
           System.out.println("");
           System.out.println("Catalogo de Telefonos Moviles\n");
           System.out.println("");
           op();
           String marca=input.nextLine();
           tel.celular(marca);        
           System.out.println("\nSelccione Operador"
                                 + "\nC: Claro"
                                 + "\nM: Movistar"
                                 + "\nE: Entel");
        String operador=input.nextLine();
        switch(operador)
        {
            case "C":
                System.out.println("Selecione Plan"
                        
                               + "\n99"
                               + "\n145"
                               + "\n180");   
                   plan=input.nextLine();
                   ope.Claro(plan);
                   if(marca.equals("S7")){System.out.println("Precio Total: "+ope.precio+9);}
                   else if(marca.equals("H8")){System.out.println("Precio Total: "+ope.precio+1);}
                   else{System.out.println("Precio Total: "+ope.precio+49);}
                    break;
            case "M":
                System.out.println("Selecione Plan"
                        
                             + "\n99"
                             + "\n145"
                             + "\n199");   
                    plan=input.nextLine();
                    ope.Movistar(plan);                
                    if(marca.equals("S7")){System.out.println("Precio Total: "+ope.precio+9);}
                    else if(marca.equals("H8")){System.out.println("Precio Total: "+ope.precio+1);}
                    else{System.out.println("Precio Total: "+ope.precio+49);}
                     break;
            case "E":
                System.out.println("Selecione Plan"
                        
                             + "\n29"
                             + "\n39"
                             + "\n45");   
                       plan=input.nextLine();
                       ope.Entel(plan);
                
                if(marca.equals("1")){System.out.println("Precio Total: "+ope.precio+9);}
                else if(marca.equals("3")){System.out.println("Precio Total: "+ope.precio+1);}
                else{System.out.println("Precio Total: "+ope.precio+49);}
                    break;
        }
    }
        public static void op()
    {
                System.out.println("SELECCIONE TELEFONO CELULAR:"
                             + "\n1: SAMSUNG S7"
                             + "\n2: iPhone 6"
                             + "\n3: Huawei P8");
    }
        
    }
    

