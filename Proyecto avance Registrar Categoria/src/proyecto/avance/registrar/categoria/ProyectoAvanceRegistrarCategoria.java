
package proyecto.avance.registrar.categoria;
import javax.swing.JOptionPane;

public class ProyectoAvanceRegistrarCategoria {

    public static void main(String[] args) {
        Categoria registrar = new Categoria(); //se ingresa la clase
        
        int Opcion1 = Integer.parseInt(JOptionPane.showInputDialog(" ¿Desea registrar una nueva categoria? \n (1) Registrar categoria. \n (2) Salir. \n Indique la opcion a elegir"));
        
        if (Opcion1 == 1) {
            int IdCategoria = registrar.getIdCategoria(); 
            registrar.setNombreCategoria(JOptionPane.showInputDialog(null, " Dijite la categoria nueva"));
            JOptionPane.showMessageDialog(null,"La categoria "+ registrar.getNombreCategoria() +" se ha guardado de forma correcta");
          }  
        else if (Opcion1 == 2) {
            JOptionPane.showMessageDialog(null,"Saliendo.....");
       }
        else {
        JOptionPane.showMessageDialog(null,"Ninguna opcion es valida.");
    }
            }
    }
            
            
            
            
            









///JOptionPane.showMessageDialog(null,"La categoria " + registrar.getCategoria()+ " se guardo de forma correcta");


