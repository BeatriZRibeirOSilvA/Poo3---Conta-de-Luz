
package poo3;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Luz {
public double kwmesanterior;
public double kwmesatual;
public double precoTusd = 0.30; 
public double precoTe = 0.29; 
public double taxaIcms; 
public double kw;
public double consumo;


   


    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public double getKw() {
        return kw;
    }

    public void setKw(double kw) {
        this.kw = kw;
    }
    public double getKwmesanterior() {
        return kwmesanterior;
    }

    public void setKwmesanterior(double kwmesanterior) {
        this.kwmesanterior = kwmesanterior;
    }

    public double getKwmesatual() {
        return kwmesatual;
    }

    public void setKwmesatual(double kwmesatual) {
        this.kwmesatual = kwmesatual;
    }

    public double getPrecoTusd() {
        return precoTusd;
    }

    public void setPrecoTusd(double precoTusd) {
        this.precoTusd = precoTusd;
    }

    public double getPrecoTe() {
        return precoTe;
    }

    public void setPrecoTe(double precoTe) {
        this.precoTe = precoTe;
    }

    public double getTaxaIcms() {
        return taxaIcms;
    }

    public void setTaxaIcms(double taxaIcms) {
        this.taxaIcms = taxaIcms;
    }
    
    public double calculoKw (double kw, double kwmesanterior, double kwmesatual) {
    kw = kwmesatual - kwmesanterior;
    JOptionPane.showMessageDialog(null, kw);
    this.setKw(kw);
    return kw;
    }
    
    public double conta (double consumo, double kw, double precoTusd, double precoTe){ 
    consumo = kw;
    double tusd = consumo * precoTusd;
    double te = consumo * precoTe;
    consumo = tusd + te;
    consumo = consumo + (0.25 * consumo); //Taxa ICMS
    this.setConsumo(consumo);
    JOptionPane.showMessageDialog(null, "O valor parcial da conta é de: " + consumo);    
    return consumo;
    }
    
    public double contaBandeira (double consumo, double conta, double kw){
        DecimalFormat df = new DecimalFormat("#.00");
        if(kw < 100){
            JOptionPane.showMessageDialog(null, "Bandeira Verde");
        }
        if(kw > 100 && kw <= 150){
            consumo = consumo + 0.01343;
            kw = kw * 0.01343;
            kw = kw + (0.25 * kw);
            consumo = consumo + kw;
           JOptionPane.showMessageDialog(null, "Bandeira Amarela " + df.format(consumo));      
        }
        if(kw > 150 && kw <= 200){
            consumo = consumo + 0.04169;
            kw = kw * 0.04169;
            kw = kw + (0.25 * kw);
            consumo = consumo + kw;
           JOptionPane.showMessageDialog(null, "Bandeira Vermelha - 1: " + df.format(consumo));      
        }
        if(kw > 200){
            consumo = consumo + 0.06243;
            kw = kw * 0.06243;
            kw = kw + (0.25 * kw);
            consumo = consumo + kw;
           JOptionPane.showMessageDialog(null, "Bandeira Vermelha - 2 " + df.format(consumo));      
        }
        
        this.setConsumo(consumo);
        
    return kw;
        
    }
    
    
      
    
        
      
}
    
    

