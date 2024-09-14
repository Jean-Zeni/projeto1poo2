/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author s.lucas
 */
public class Utils {
    
    public static Date converterStringToDate(String texto){
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date data = null;
        
        try{
            data = formato.parse(texto);
            
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao converter a data!");
        }
        
        return data;
    }
    
    public static String converterDateToString(Date data){
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String texto = "";
        
        try{
            
            //Irá formatar a data para o formato dd/MM/yyyy
            
            texto = formato.format(data);
            
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Erro ao formatar a data!");
        }
        
        return texto;
    }
    
}
