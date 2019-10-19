import javax.swing.JOptionPane;

/**
 * listaDoble
 */
public class listaDoble {

    public static void main(String[] args) {
        lisstaDoblementeEnlazada listita= new lisstaDoblementeEnlazada();
        int opcion =0;
        String elemento;
        do{
            try {
                opcion=Integer.parseInt(JOptionPane.showInputDialog(null,
                "1. Agregar un nodo al inicio\n"+
                "2. Agregar un nodo al final\n"+
                "3. Mostrar la alista de Inicio a Fin\n"+
                "4. Mostrar la lista de Fin a Inicio\n"+
                "5. Salir\n"+
                "que deseas hacer?","Menu de  opciones", JOptionPane.INFORMATION_MESSAGE));
                switch (opcion) {
                    case 1:
                           elemento=String.valueOf(JOptionPane.showInputDialog(null, 
                           "Ingresa el elmento de NODO","aGREGANDO NODO al Inicio", JOptionPane.INFORMATION_MESSAGE));
                           listita.agregarAlInicio(elemento);
                        
                        break;
                    case 2:
                           elemento=String.valueOf(JOptionPane.showInputDialog(null, 
                           "Ingresa el elmento de NODO","aGREGANDO NODO al Final", JOptionPane.INFORMATION_MESSAGE));
                           listita.agregarAlFinal(elemento);
                        break;
                    case 3:
                        if(!listita.estVacia()){
                            listita.mostrarListaInicioFin();
                        }else{
                             JOptionPane.showMessageDialog(null,"NO hay nodos aun",
                         "lista vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        if(!listita.estVacia()){
                            listita.mostrarListaFinInicio();
                        }else{
                             JOptionPane.showMessageDialog(null,"no hay nodos aun",
                         "lista vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 5:
                         JOptionPane.showMessageDialog(null,"Aplicacon finalizada",
                         "fiin", JOptionPane.INFORMATION_MESSAGE);
                        break;
                
                    default:
                         JOptionPane.showMessageDialog(null,"La OPCION NO ESTA EN EL Menu ",
                         "Incorrecto", JOptionPane.INFORMATION_MESSAGE);
                        break;
                }
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null,"error"+n.getMessage());
            }
        }while(opcion!=5);
}
}