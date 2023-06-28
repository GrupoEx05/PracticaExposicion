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
public class DiaSemana {
    int dia;
    public static void main(String[] args) {
        // TODO code application logic here
                DiaSemana obj = new DiaSemana();
        obj.dia= Integer.parseInt(JOptionPane.showInputDialog("Digite día"));

        switch(obj.dia){
            case 1:
                    System.out.println ("Lunes");
                    System.out.println ("Primer día de la semana");
                break;
            case 2:
                    System.out.println ("Martes");
                break;
            case 3:
                   System.out.println ("Miércoles");
                break;
            case 4:
                   System.out.println ("Jueves");
                break;
            case 5:
                   System.out.println ("Viernes");
                break;
            case 6:
                   System.out.println ("Sábado");
                break;
            case 7:
                   System.out.println ("Domingo");
                break;
            default: System.out.println ("Día no existe");
}
    }
    
}
