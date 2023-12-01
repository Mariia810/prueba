/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.piedra_papel;

import java.awt.Color;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JLabel;


/**
 *
 * @author Maria Mw
 */
public class NewClass1 {   
    public static JLabel[] label=new JLabel[2];
    

    
    public static JButton[] allBtn = new JButton[3];
    static int cont1=0;
    static int cont2=0;
        public static void main(String[]args){
        piedrapapeltijera nf= new piedrapapeltijera();
        nf.setVisible(true);
        label[0]=nf.jLabel4;
        label[1]=nf.jLabel3;
        
        allBtn[0]= nf.jButton4;
        allBtn[1]=nf.jButton5;
        allBtn[2]=nf.jButton6;
        
        Random rm=new Random();
        int NumRandom=rm.nextInt(allBtn.length);
        allBtn[NumRandom].setBackground(Color.red);
        
    }
   
    public static void BtnRm(String nombreBoton){
        Random rm=new Random();
        int NumRandom = rm.nextInt(allBtn.length);
        
        for(int i=0;i<allBtn.length;i++){
            allBtn[i].setBackground(Color.white);
        }
        allBtn[NumRandom].setBackground(Color.red);
        
        if(nombreBoton.equals("piedra")){
            if(allBtn[NumRandom].getText().equals("papel")){
             cont2++;

            }
            else if(allBtn[NumRandom].getText().equals("tijera")){
              cont1++;  
            }
        }
        else if(nombreBoton.equals("papel")){
            if(allBtn[NumRandom].getText().equals("piedra")){
               cont1++; 
            }
            else if(allBtn[NumRandom].getText().equals("tijera")){
               cont2++;
            }
        }
         else if(nombreBoton.equals("tijera")){
            if(allBtn[NumRandom].getText().equals("piedra")){
                cont2++;
            }
            else if(allBtn[NumRandom].getText().equals("papel")){
                cont1++;
            }
            
        }
        label[0].setText(cont1+"");
        label[1].setText(cont2+"");
        

    }
    


}
