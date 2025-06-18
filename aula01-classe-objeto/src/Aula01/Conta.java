package Aula01;

public class Conta {
    String tiluar;
    Integer numero_conta;
    Double saldo;

    void sacar(){
        System.out.println("Você está fazendo um saque");
    }

    void depositar(){
        System.out.println("Você está fazendo um depósito");
    }

    void consultar(){
        System.out.println("Você está consultando seu saldo");
    }
}
