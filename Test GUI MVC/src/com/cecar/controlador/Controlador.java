/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cecar.controlador;

import java.awt.event.ActionListener;
import com.cecar.modelo.Modelo;
import com.cecar.vista.GUI;
import java.awt.event.ActionEvent;


/**
 *
 * @author Gott
 */
public class Controlador implements ActionListener{
    private GUI view;
    private Modelo model;
    
    public Controlador(GUI view,Modelo model){
        this.view=view;
        this.model=model;
        
        this.view.btnMultiplicar.addActionListener(this);
        
    }
    public void Iniciar(){
        view.setTitle("MVC multiplicar");
        view.setLocationRelativeTo(null);
    }
    
    public void actionPerformed(ActionEvent e){
        model.setNumero1(Integer.parseInt(view.txtn1.getText()));
        model.setNumero2(Integer.parseInt(view.txtn2.getText()));
        model.multiplicar();
        view.result.setText(String.valueOf(model.getResultado()));
        
    }
}
