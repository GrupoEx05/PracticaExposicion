/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Practica;

import javax.swing.JOptionPane;

/**
 *
 * @author Yadrick
 */
public class Automovil {
    
        String placaAutomovil;
        String marcaAutomovil;
        String colorAutomovil;
        String modeloAutomovil;
        float precioAutomovil; 
        
    public static void main(String[] args) {
        // TODO code application logic here
                Automovil nuevoAuto = new Automovil();
        
        nuevoAuto.placaAutomovil= "ABC-123";
        nuevoAuto.marcaAutomovil= "Toyota";
        nuevoAuto.colorAutomovil= "Blanco";
        nuevoAuto.modeloAutomovil= "Hilux";
        nuevoAuto.precioAutomovil= 45100;
        
        byte tipoPago;
        
        tipoPago=Byte.parseByte(JOptionPane.showInputDialog("*PAGA CON*\n1-Efectivo\n2-Tarjeta")); 
            
        //Impresiòn de datos
        System.out.println ("Placa: "+ nuevoAuto.placaAutomovil);
        System.out.println ("Marca: "+ nuevoAuto.marcaAutomovil);
        System.out.println ("Color: "+ nuevoAuto.colorAutomovil);
        System.out.println ("Modelo: "+ nuevoAuto.modeloAutomovil);
        System.out.println ("Precio: "+ nuevoAuto.precioAutomovil + " dólares.");
        if (tipoPago == 1)
             System.out.println ("Precio: "+ (nuevoAuto.precioAutomovil-nuevoAuto.precioAutomovil*0.02) + " dólares.");
        else
            System.out.println ("Precio: "+ nuevoAuto.precioAutomovil + " dólares."); 
    }
}
    

