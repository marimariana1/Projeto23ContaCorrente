/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto23contacorrente;

/**
 *
 * @author Mariana Almeida
 */
public class Conta {
    protected int numero;
    protected double saldo;
    protected double limite;
    protected double Vsaque;
    protected double Vdeposito;
    protected double Vtransferencia;
    protected Pessoa conta;
   
    
    public Conta (){
        
    }

    public Conta(int numero, double saldo, double limite, double Vsaque, double Vdeposito, double Vtransferencia, Pessoa conta) {
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
        this.Vsaque = Vsaque;
        this.Vdeposito = Vdeposito;
        this.Vtransferencia = Vtransferencia;
        this.conta = conta;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getVsaque() {
        return Vsaque;
    }

    public void setVsaque(double Vsaque) {
        this.Vsaque = Vsaque;
    }

    public double getVdeposito() {
        return Vdeposito;
    }

    public void setVdeposito(double Vdeposito) {
        this.Vdeposito = Vdeposito;
    }

    public double getVtransferencia() {
        return Vtransferencia;
    }

    public void setVtransferencia(double Vtransferencia) {
        this.Vtransferencia = Vtransferencia;
    }

    public Pessoa getConta() {
        return conta;
    }

    public void setConta(Pessoa conta) {
        this.conta = conta;
    }

    public double sacar(){
        return (this.saldo - this.Vsaque);
    }
    public double depositar(){
        return (this.saldo + this.Vdeposito);
    }
    public double transferir (){
        return (this.saldo + Vdeposito);
}
     
}