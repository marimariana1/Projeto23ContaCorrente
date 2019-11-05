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
public class Projeto23ContaCorrente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa objPessoa = new Pessoa();
        objPessoa.setNome("Mariana");
        objPessoa.setSobrenome(" Almeida");
        objPessoa.setCPF(" 12345678900");
        
        Conta objConta = new Conta();
        objConta.setNumero( 1234);
        objConta.setSaldo( 10000);
        objConta.setLimite( 50000);
        objConta.setConta(objPessoa);
        
        Endereco objEndereco = new Endereco();
        objEndereco.setRua("Joao das Neves");
        objEndereco.setNumero(" 71");
        objEndereco.setCidade(" Lins");
        objEndereco.setEstado(" Sao Paulo");
        objEndereco.setCEP(" 16403555");
        
        
        System.out.println("Pessoa: " + objPessoa.getNome() + objPessoa.getSobrenome() +objPessoa.getCPF());
        System.out.println("Conta: " + objConta.getNumero() + objConta.getSaldo() + objConta.getLimite());
        System.out.println("Endereco: " + objEndereco.getRua() + objEndereco.getNumero() + objEndereco.getCidade()
        + objEndereco.getEstado() + objEndereco.getCEP());
        
     
    }
    
}
