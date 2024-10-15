package me.dev.patrick;

import java.util.Scanner;

public class Contador {


    class ParametrosInvalidosException extends RuntimeException{
        public ParametrosInvalidosException(){
            super("O segundo parametro deve ser maior que o primeiro.");
        }
    }

    public static void main(String[] args) {;
        Scanner terminal = new Scanner(System.in);
        int parametro1 = terminal.nextInt();
        int parametro2 = terminal.nextInt();

        try{
            Contador contador = new Contador();
            contador.contar(parametro1, parametro2);
        }catch (ParametrosInvalidosException ex){
           ex.printStackTrace();
        }
    }

    private void contar(int parametro1, int parametro2) {
        int contagem = parametro2 - parametro1;
        if(contagem < 0) throw new ParametrosInvalidosException();
        for (int i = parametro1; i < parametro2; i++){
            System.out.printf("Imprimindo número %d.%n", i);
        }
    }

}
