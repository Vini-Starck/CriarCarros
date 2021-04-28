package CriarCarros;

import java.util.Scanner;

public class CriarCarros {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        
        System.out.println("Quantos carros deseja criar?");
        int qtd = leitor.nextInt();
        
        
        Carro [] listaCarros = new Carro[qtd];
        
        // Inserindo informações
        for(int i=0; i<listaCarros.length;i++){
            leitor.nextLine();
            listaCarros[i]=new Carro();
            System.out.println("Marca do "+(i+1)+"º carro:");
            listaCarros[i].setMarca(leitor.nextLine());
            System.out.println("Ano do "+(i+1)+"º carro:");
            listaCarros[i].setAno(leitor.nextInt());
            System.out.println("Preço do "+(i+1)+"º carro:");
            listaCarros[i].setPreco(leitor.nextFloat());
        }
        
        // Imprimir informações
        for(int i=0; i<listaCarros.length; i++){
            System.out.println("============================");
            System.out.println("Marca do "+(i+1)+"º carro:" +listaCarros[i].getMarca());
            System.out.println("Ano do "+(i+1)+"º carro:" +listaCarros[i].getAno());
            System.out.println("Preço do "+(i+1)+"º carro:" +listaCarros[i].getPreco());
        }
    }
}
