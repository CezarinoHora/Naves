/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cezarino Hora
 */
 // Classe para Naves de Carga
class NaveCarga extends NaveEspacial {
    private double capacidadeCarga;

    // Construtor
    public NaveCarga(String nome, double velocidadeMaxima, int numeroTripulantes, double combustivel, double capacidadeCarga) {
        super(nome, velocidadeMaxima, numeroTripulantes, combustivel);
        this.capacidadeCarga = capacidadeCarga;
    }

    // Método para carregar carga
    void carregar(double carga) {
        System.out.println("Carregando " + carga + " toneladas de carga na nave de carga.");
    }

    // Sobrescrita de método para exibir informações adicionais
    @Override
    public String toString() {
        return super.toString() + ", capacidadeCarga=" + capacidadeCarga;
    }

    // Implementação dos métodos abstratos
    @Override
    void acelerar(double velocidade) {
        // Implementação específica para NaveCarga
    }

    @Override
    void desacelerar(double velocidade) {
        // Implementação específica para NaveCarga
    }

    @Override
    void abastecer(double litros) {
        // Implementação específica para NaveCarga
    }

    @Override
    void viajar(double distancia) {
        // Implementação específica para NaveCarga
    }
}