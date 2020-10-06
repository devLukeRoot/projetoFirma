package programadafirma;

import java.util.Scanner;

public class Funcionario {
    private String nome,sobrenome;
    private float salario,gratificacao;

    public Funcionario() {
        this.nome = nome;
        this.salario = salario;
        this.gratificacao = gratificacao;
        this.sobrenome = sobrenome;
    }
    
    
    public void mostrarDados(){
        float porc,x,result;
        porc = this.gratificacao / 100;
        x = this.salario * porc;
        result = this.salario + x;
        System.out.println("Nome: " + this.nome);
        System.out.println("Sobrenome: " + this.sobrenome);
        System.out.println("Salário: " + this.salario);
        System.out.println("Gratificacao: " + this.gratificacao + "%");
        System.out.println("Salario c/ Gratificacao: " + result);
    
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(float gratificacao) {
        this.gratificacao = gratificacao;
    }
    
    
    
}
