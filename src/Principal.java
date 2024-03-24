/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cezarino Hora
 */

import java.util.Scanner;
// Classe Principal
public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exemplo de criação de uma NaveCarga
        NaveCarga naveCarga = new NaveCarga("CargaExpress", 1000, 5, 500, 2000);
        System.out.println("Detalhes da Nave de Carga:\n" + naveCarga);

        // Exemplo de interação com a NaveCarga
        naveCarga.abastecer(300);
        naveCarga.carregar(1500);
        naveCarga.viajar(100);

        // Exemplo de criação de uma NavePassageiros
        NavePassageiros navePassageiros = new NavePassageiros("Starliner", 800, 8, 400, 50);
        System.out.println("\nDetalhes da Nave de Passageiros:\n" + navePassageiros);

        // Exemplo de interação com a NavePassageiros
        navePassageiros.abastecer(200);
        navePassageiros.embarcar(30);
        navePassageiros.viajar(150);

        // Exemplo de criação de uma NaveCombate
        NaveCombate naveCombate = new NaveCombate("Interceptor", 1200, 3, 300, "Laser");
        System.out.println("\nDetalhes da Nave de Combate:\n" + naveCombate);

        // Exemplo de interação com a NaveCombate
        naveCombate.abastecer(100);
        naveCombate.atacar();
        naveCombate.viajar(50);

        scanner.close();
    }
}

