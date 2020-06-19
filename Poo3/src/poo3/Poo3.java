/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo3;

import javax.swing.JOptionPane;

public class Poo3 {

    public static void main(String[] args) {
        Luz dados = new Luz();
        
        dados.setKwmesanterior(Double.parseDouble(JOptionPane.showInputDialog("Digite o kw gasto no mês anterior: ")));
        dados.setKwmesatual( Double.parseDouble(JOptionPane.showInputDialog("Digite o kw gasto no mês atual: "))); 
        
        dados.calculoKw(dados.getKw(), dados.getKwmesanterior(), dados.getKwmesatual());
        dados.conta(dados.getConsumo(),dados.getKw(), dados.getPrecoTusd(),dados.getPrecoTe());
        dados.contaBandeira(dados.getConsumo(), dados.conta(dados.getConsumo(), dados.getKw(), dados.getPrecoTusd(), dados.getPrecoTe()), dados.getKw());
        
    }
    
}
