import javax.swing.JOptionPane;

/**
 * lisstaDoblementeEnlazada
 * 

 */
public class lisstaDoblementeEnlazada {

     nodoDoble inicio,fin;

    public lisstaDoblementeEnlazada(){
        inicio=fin=null;
    }
    public boolean estVacia(){

        return inicio==null;

    }

    public  void agregarAlFinal(String el){
        if(!estVacia()){
            fin=new nodoDoble(el,null,fin);
            fin.anterior.siguiente=fin;
        }else{
            inicio=fin=new nodoDoble(el);
        }
    }
     public  void agregarAlInicio(String el){
        if(!estVacia()){
            inicio=new nodoDoble(el,inicio,null);
            inicio.siguiente.anterior=inicio;
        }else{
            inicio=fin=new nodoDoble(el, fin, fin);
        }
    }
    public  void mostrarListaInicioFin(){
        if(!estVacia()){
            String  datos ="<==>";
            nodoDoble auxiliar=inicio;
            while(auxiliar!=null){
                datos = datos +"["+auxiliar.dato+"]<==>";
                auxiliar= auxiliar.siguiente;
            }
            JOptionPane.showMessageDialog(null, datos,"Mostrando Lista de Inicio a Fin",JOptionPane.INFORMATION_MESSAGE);

        }
    }
       public  void mostrarListaFinInicio(){
        if(!estVacia()){
            String  datos ="<==>";
            nodoDoble auxiliar=fin;
            while(auxiliar!=null){
                datos = datos +"["+auxiliar.dato+"]<==>";
                auxiliar= auxiliar.anterior;
            }
            JOptionPane.showMessageDialog(null, datos,"Mostrando Lista de Fin a Inicio",JOptionPane.INFORMATION_MESSAGE);
            

        }
    }
    
}