/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manejadores;

import javax.swing.JTextField;

/**
 *
 * @author james
 */
public class ManejadorTerminacionEnNumero {
    
    public static boolean terminacionEnNumero(JTextField textField){
        
        if(textField.getText().endsWith("0") || 
                textField.getText().endsWith("1") ||
                textField.getText().endsWith("2") ||
                textField.getText().endsWith("3") ||
                textField.getText().endsWith("4") ||
                textField.getText().endsWith("5") ||
                textField.getText().endsWith("6") ||
                textField.getText().endsWith("7") ||
                textField.getText().endsWith("8") ||
                textField.getText().endsWith("9") ){
            
            return true;
        }else{
            return false;
        } 
    }
    
    public static boolean inicioConNumero(JTextField textField){
        
        if(textField.getText().startsWith("0") || 
                textField.getText().startsWith("1") ||
                textField.getText().startsWith("2") ||
                textField.getText().startsWith("3") ||
                textField.getText().startsWith("4") ||
                textField.getText().startsWith("5") ||
                textField.getText().startsWith("6") ||
                textField.getText().startsWith("7") ||
                textField.getText().startsWith("8") ||
                textField.getText().startsWith("9") ){
            
            return true;
        }else{
            return false;
        } 
    }
    
}
