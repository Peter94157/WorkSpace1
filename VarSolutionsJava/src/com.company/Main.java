package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import  java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
  /*      System.out.println("Ola Mundo,");
        System.out.println("este é o meu primeiro codigo em java Aeeeeeee");

        String nome = "Pedro";
        String Sobrenome = "Leonardo";
        String mensagem = "Ola mundo, esta mensagem esta dentro de uma variavel ";
        System.out.println(mensagem);
        System.out.println(nome);
        System.out.println(Sobrenome);
        System.out.println(nome+" "+Sobrenome);
*/
/*        String eu = pegarNome("Pedro","Leonardo");
        System.out.println(eu);
        String nome = inserirNome();
        System.out.println(nome);*/
/*
        double  imc = calcularIMC();
        System.out.println(imc);
*/

//        calcularIdade();
        List<String> msg = resumoPessoa();
        System.out.println(msg);


    }


    private static String pegarNome(String nome,String Sobrenome){
        String msg= "Seu nome é "+nome+" "+Sobrenome;
        return msg;
    }
    public static String inserirNome(){
        Scanner ler = new Scanner(System.in);
        System.out.printf("Digite o seu Nome: ");
        String nome = ler.next();
        System.out.printf("Digite seu sobrenome: ");
        String Sobrenome=ler.next();

        System.out.println(nome+" "+Sobrenome);
        String nomeCompleto = nome+" "+Sobrenome;
        return  nomeCompleto;
    }
    public static Double calcularIMC(){
        Scanner ler= new Scanner(System.in);
        System.out.printf("Digite sua Altura ? ");
        double altura = ler.nextDouble();
        System.out.printf("Qual o seu peso ? ");
        double peso = ler.nextDouble();

        double calculoDoIMC = peso/(altura*altura);

        System.out.println("o seu IMC é : "+calculoDoIMC);

        if(calculoDoIMC<19.0){
            System.out.println("voce esta abaixo do peso");
        }else{
            System.out.println("voce esta acima do peso");
        }
        return calculoDoIMC;
    }


    public static int calcularIdade(){
        //VARIAVEIS UTILIZADAS NO COD
        int anoatual;
        int anoNasc;
        int calculoIdade;
        String tipoPessoa;
        String Adulto="Você é um adulto";
        String Crianca="Você é menor, Cai Fora criancinha!";
        String nome;

        //COLETANDO AS INFOMAÇÕES DO USUARIO
        Scanner scan = new Scanner (System.in);
        System.out.printf("Qual o seu nome ? ");
        nome = scan.next();
        System.out.printf("Em qual ano estamos ?");
        anoatual=scan.nextInt();
        System.out.printf("Digite o ano do seu nascimento, EX - 2001: ");
        anoNasc = scan.nextInt();



        //CALCULANDO A IDADE DO USUARIO
        calculoIdade = anoatual - anoNasc;

        //CONDICIONAL PARA IDENTIFICAR SE É MAIOR OU MENOS DE IDADE
        if(calculoIdade>18){
            tipoPessoa = Adulto;
        }else {
            tipoPessoa=Crianca;
        }
        //MOSTRANDO O RESULTADO PARA O USUARIO
            System.out.println("Nome "+nome+", Sua idade é "+calculoIdade+" Anos e "+tipoPessoa);
    return calculoIdade;
    }



    public static List<String> resumoPessoa(){

        String nome;
        String sobrenome;
        int idade;
        String nomeCompleto;
        String tipoPessoa;
        int size;
        List <String> resumoPessoas = new ArrayList<>();

        Scanner read = new Scanner(System.in);
        System.out.printf("Quantas pessoas ? ");
        size=read.nextInt();

        for(int i =0;i < size;i++){
        System.out.printf("Digite seu primeiro nome: ");
        nome=read.next();

        System.out.printf("Digite seu sobrenome: ");
        sobrenome=read.next();

        System.out.printf("Qual a sua idadee? ");
        idade=read.nextInt();

        nomeCompleto=nome+" "+sobrenome;

        if (idade>=18){
            tipoPessoa="já é um adulto";
        }else{
            tipoPessoa="Uma criancinha ainda! Blé";
        }

        String resumo = "Nome Completo: "+nomeCompleto+" Idade: "+idade+" Categoria: "+tipoPessoa;

        resumoPessoas.add(resumo);
        }

        return resumoPessoas;
    }
}









