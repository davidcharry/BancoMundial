
package Modelo;

import javax.swing.JOptionPane;


public class MisExcepciones extends Exception{
    
    
    public MisExcepciones(String mensaje) {
        super(mensaje);
    }
    
    public static int validarNum(String num){
        try{
            int numConvertido = Integer.parseInt(num);
            return numConvertido;
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Valor erroneo ingresado");
            
        }finally{
            }
    return validarNum(JOptionPane.showInputDialog("Por favor ingrese un valor numerico"));
    }   
}
