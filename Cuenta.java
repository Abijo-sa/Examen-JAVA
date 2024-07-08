
package examen1;

public class Cuenta {
    private String titular;
    private double cantidad;
    
  public Cuenta(String titular){
      this.titular=titular;
      this.cantidad=0;
  }
      public String getTitular(){
          return titular; 
      }
      public double getCantidad(){
          return cantidad; 
      }
      public void setTitular (String titular){
          this.titular=titular;
      }
       public void setCantidad (double titular){
           if (cantidad>=0){
          this.cantidad=cantidad;
           }
      }
      @Override
      public String toString () {
          return "Cuenta{"+
                  "titular="+titular+
                  ",cantidad="+cantidad+
                  '}';
      }
      public void ingresar (double cantidad){
          if (cantidad>0){
              this.cantidad +=cantidad;
          }
         }
      public void retirar (double cantidad){
          if(cantidad>0){
              if(this.cantidad-cantidad<0){
                  this.cantidad=0;
              }else{
                  this.cantidad-=cantidad;
              }
             }
          }
  }
    

