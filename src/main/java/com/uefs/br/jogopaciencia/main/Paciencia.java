/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uefs.br.jogopaciencia.main;

import com.uefs.br.jogopaciencia.facade.PacienciaFacade;
import com.uefs.br.jogopaciencia.util.Console;
import java.io.IOException;


/**
 *
 * @author matee
 */
public class Paciencia {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        PacienciaFacade jogoPaciencia = new PacienciaFacade();
        System.out.println("**************** Paciencia - by Mateus Guimarães & Karol Lima ************************");
        
        System.out.println("[-------------------------- MENU ------------------------------]");
        System.out.println("1 - INICIAR JOGO");
        System.out.println("2 - SOBRE");
        System.out.println("Digite aqui:");
        int menu = Console.readInt();
        
        if(menu == 1){
            int escolha = 0;
            jogoPaciencia.iniciarJogo();
            jogoPaciencia.mostrarEstoque();
            jogoPaciencia.mostrarDescarte();
            jogoPaciencia.getFundacao();
            jogoPaciencia.getLista();
            
            while(escolha !=5){
                
                System.out.println("\nPara jogar, digite o número referente a opção que deseja realizar no jogo! - Permitido de 1 a 5");
                System.out.println("Boa sorte!\n");
                System.out.println("1 - MOVER CARTA");
                System.out.println("2 - EXIBIR JOGO");
                System.out.println("3 - ALTERAR QTDE DE CARTAS A VIRAR DO ESTOQUE");
                System.out.println("4 - REINICIAR");
                System.out.println("5 - FINALIZAR");
                escolha = Console.readInt();
                
                if(escolha == 1){
                    System.out.println("\nInforme o numero do local onde a carta se encontra: ");
                    int origem = Console.readInt();
                    System.out.println("Informe o numero do local para onde deseja mover a carta: ");
                    int destino = Console.readInt();
                    jogoPaciencia.moverCarta(origem, destino);
                }else if(escolha == 2){
                    jogoPaciencia.mostrarEstoque();
                    jogoPaciencia.mostrarDescarte();
                    jogoPaciencia.getFundacao();
                    jogoPaciencia.getLista();
                }else if(escolha == 3){
                    
                }else if(escolha == 4){
                    jogoPaciencia.iniciarJogo();
                    jogoPaciencia.mostrarEstoque();
                    jogoPaciencia.mostrarDescarte();
                    jogoPaciencia.getFundacao();
                    jogoPaciencia.getLista();
                }
            } 
        }
    }
}
