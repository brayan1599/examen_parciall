
package examen_parcial;


public class Operadores {
            public String plan="";public String Minutos,RPC,Internet,sms;
            public double precio;
 public void Entel(String planes){
     
     if(planes.equals("29")) {
   
             plan="Chip 29"; 
             Minutos="200 Minutos";
             RPC="Ilimitados";
             Internet="1 GB";
             sms="500 mensajes";
              precio=29;
      System.out.println("\nPlan: "+plan
                        + "\nMinutos: "+Minutos
                        + "\nRPE: "+RPC
                        + "\nInternet: "+Internet
                        + "\nSMS: "+sms
                        + "\nPrecio S/."+precio);
          
 }
        else if(planes.equals("39")){
    
             plan="Chip 39";
             Minutos="500 sms";
             RPC="Ilimitados";
             Internet="1.5 GB";
             sms="Ilimitados";
             precio=149;
    
     
      System.out.println("\nPlan: "+plan
                        + "\nMinutos: "+Minutos
                        + "\nRPE: "+RPC
                        + "\nInternet: "+Internet
                        + "\nSMS: "+sms
                        + "\nPrecio S/."+precio);
 }
        else if (planes.equals("45")){
   
             plan="Chip 45";
             Minutos="500 sms";
             RPC="Ilimitados";
             Internet="2 GB";
             sms="Ilimitados";
             precio=45;
    
     
      System.out.println("\nPlan: "+plan
                        + "\nMinutos: "+Minutos
                        + "\nRPE: "+RPC
                        + "\nInternet: "+Internet
                        + "\nSMS: "+sms
                        + "\nPrecio S/."+precio);
 }
        else {System.out.println("Plan Incorrecto");}  
     
     
 }
 public void Claro(String planes){
 
        if(planes.equals("99")){
   
            plan="Claro Max 99";
            Minutos="Ilimitados";
            RPC="Ilimitados";
            Internet="6 GB";
            sms="Ilimitados";
            precio=99;
    
      System.out.println("\nPlan: "+plan
                       + "\nMinutos: "+Minutos
                       + "\nRPE: "+RPC
                       + "\nInternet: "+Internet
                       + "\nSMS: "+sms
                       + "\nPrecio S/."+precio);
          
 }
       else if(planes.equals("145")){
  
           plan="Claro Max 149";
           Minutos="Ilimitados";
           RPC="Ilimitados";
           Internet="7 GB";
           sms="Ilimitados";
           precio=149;
    
      System.out.println("\nPlan: "+plan
                        + "\nMinutos: "+Minutos
                        + "\nRPE: "+RPC
                        + "\nInternet: "+Internet
                        + "\nSMS: "+sms
                        + "\nPrecio S/."+precio);
 }
       else if (planes.equals("180")){
    
           plan="Claro Max 180";
           Minutos="Ilimitados";
           RPC="Ilimitados";
           Internet="10 GB";
           sms="Ilimitados";
           precio=189;
    
    
      System.out.println("\nPlan: "+plan
                        + "\nMinutos: "+Minutos
                        + "\nRPE: "+RPC
                        + "\nInternet: "+Internet
                        + "\nSMS: "+sms
                        + "\nPrecio S/."+precio);
 }
        else {System.out.println("Plan Incorrecto");}
     
 }
  public void Movistar(String planes){
     
        if(planes.equals("99")){
    
            plan="Movistar Play 99";
            Minutos="Ilimitados";
            RPC="Ilimitados";
            Internet="6 GB";
            sms="Ilimitados";
            precio=99;
    
      System.out.println("\nPlan: "+plan
                        + "\nMinutos: "+Minutos
                        + "\nRPE: "+RPC
                        + "\nInternet: "+Internet
                        + "\nSMS: "+sms
                        + "\nPrecio S/."+precio);
          
 }
        else if(planes.equals("145")){
    
            plan="Movistar Play 145";
            Minutos="Ilimitados";
            RPC="Ilimitados";
            Internet="8 GB";
            sms="Ilimitados";
            precio=145;
    
      System.out.println("\nPlan: "+plan
                        + "\nMinutos: "+Minutos
                        + "\nRPE: "+RPC
                        + "\nInternet: "+Internet
                        + "\nSMS: "+sms
                        + "\nPrecio S/."+precio);
 }
         else if (planes.equals("199")){
   
             plan="Movistar Play 199";
             Minutos="Ilimitados";
             RPC="Ilimitados";
             Internet="10 GB";
             sms="Ilimitados";
             precio=199;
    
      System.out.println("\nPlan: "+plan
                        + "\nMinutos: "+Minutos
                        + "\nRPE: "+RPC
                        + "\nInternet: "+Internet
                        + "\nSMS: "+sms
                        + "\nPrecio S/."+precio);
 }
        else {System.out.println("Plan Incorrecto");}      
 }
          
}
