/**
 * nodoDoble
 */
public class nodoDoble {
   
    public String dato;
    nodoDoble siguiente,anterior;

     public nodoDoble(String el){
       
        this(el,null,null);
    }
    public nodoDoble(String el,nodoDoble s,nodoDoble a){
        dato=el;
        siguiente=s;
        anterior=a;
    }

   
    
}