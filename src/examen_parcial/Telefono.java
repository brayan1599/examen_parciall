
package examen_parcial;


  public class Telefono {
        public String nombre="";
        public String Pantalla="";
        public String Procesador="";
        public String camara="";
    
  public void celular(String nom) { 
   
         switch(nom){
             case "1":
                     nombre="Samsung S7";
                     Pantalla="4.7 pulgadas";
                     Procesador="1.4 GHz";
                     camara="8MP";
             System.out.println ("\nPantalla: "+Pantalla
                                + "\nProcesador: "+Procesador
                                + "\nCamara:"+camara
                                + "Precio S/ 9" );
                break;
             case "2":
                     nombre="iPhone 6";
                     Pantalla="4.7 pulgadas";
                     Procesador="1.4 GHz";
                     camara="8MP";
             System.out.println ("\nPantalla: "+Pantalla
                                + "\nProcesador: "+Procesador
                                + "\nCamara:"+camara
                                + "Precio S/ 49");
                break;
             case "3":
                     nombre="Huawei P8";
                     Pantalla="4.7 pulgadas";
                     Procesador="1.4 GHz";
                     camara="8MP";
             System.out.println ("\nPantalla: "+Pantalla
                                + "\nProcesador: "+Procesador
                                +  "\nCamara:"+camara
                                + "Precio S/ 1" );
                break; 
        }
    
    }
}

