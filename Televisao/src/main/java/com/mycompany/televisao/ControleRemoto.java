/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.televisao;

import java.util.Scanner;

/**
 *
 * @author Marcio Melo
 */
public class ControleRemoto {
    Televisao tv; 

  
  Scanner entrada = new Scanner(System.in);

 
  public ControleRemoto() {

    tv = new Televisao();
  }

  
  public void mostrarMenu() {
   
    while (true) {
      System.out.println("\n---------- OPÇÕES DO CONTROLE REMOTO ----------\n");
      System.out.println("1. Aumentar o Volume");
      System.out.println("2. Diminuir o Volume");
      System.out.println("3. Aumentar o Canal");
      System.out.println("4. Diminuir o Canal");
      System.out.println("5. Trocar Para o Canal Indicado");
      System.out.println("6. Consultar o Volume e Canal Selecionado");
      System.out.println("7. Sair");
      System.out.print("Sua opção: ");

      
      int opcao = Integer.parseInt(entrada.nextLine());

      
      switch (opcao) {
        case 1: 
          if(tv.getVolume() < 10){
            System.out.println("\nO volume da TV foi aumentado em uma unidade.\n");
            tv.setVolume(tv.getVolume() + 1);
          }
          else{
            System.out.println("\nO volume da TV já está no máximo.\n");
          }
          break;
          
        case 2: 
          if(tv.getVolume() > 0){
            System.out.println("\nO volume da TV foi diminuido em uma unidade.\n");
            tv.setVolume(tv.getVolume() - 1);
          }
          else{
            System.out.println("\nO volume da TV já está no mínimo.\n");
          }  
          break;
          
        case 3: 
          if(tv.getCanal() < 20){
            System.out.println("\nO canal da TV foi aumentado em uma unidade.\n");
            tv.setCanal(tv.getCanal() + 1);
          }
          else{
            System.out.println("\nO canal da TV já está no máximo.\n");
          }
          break;
          
        case 4: 
          if(tv.getCanal() > 1){
            System.out.println("\nO canal da TV foi diminuido em uma unidade.\n");
            tv.setCanal(tv.getCanal() - 1);
          }
          else{
            System.out.println("\nO canal da TV já está no mínimo.\n");
          }  
          break;  
          
        case 5:
          System.out.print("\nInforme o canal desejado: ");
          
          int canal = Integer.parseInt(entrada.nextLine());
          
          if(canal >= 1 && canal <= 20){
            System.out.println("\nO canal da TV foi ajustado para " + canal + ".\n");
            tv.setCanal(canal);
          }
          else{
            System.out.println("\nO canal informado é inválido.\n");
          }
          break;
          
        case 6: 
          System.out.println("\nO volume atual é: " + tv.getVolume());
          System.out.println("O canal atual é: " + tv.getCanal());
          break;
        
        case 7: 
          System.out.println("\nObrigado por usar o programa.\n");
          System.exit(0);
      }
    }
  }
}
