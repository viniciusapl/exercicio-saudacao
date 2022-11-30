package org.example;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        Scanner scan = new Scanner(System.in);
        System.out.println( "Digite seu nome: ");
        String nome = scan.next();
        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scan.next();
        System.out.println("Insira sua data de nascimento no formato dd/mm/aaaa: ");
        String dataNascimento = scan.next();

        String[] dataSeparada = dataNascimento.split("/");

        int anoNascimento = Integer.parseInt(dataSeparada[2]);

        Calendar cal = GregorianCalendar.getInstance();
        int anoAtual = cal.get((Calendar.YEAR));

        int idade = anoAtual - anoNascimento;

        System.out.printf("Olá, %s %s! Bem-vindo! Você tem %d anos", nome, sobrenome, idade);

    }
}
