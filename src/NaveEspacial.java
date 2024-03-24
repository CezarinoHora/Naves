/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cezarino Hora
 */
import java.util.Scanner;

// Classe abstrata base para Naves Espaciais
abstract class NaveEspacial {
    private String nome;
    private double velocidadeMaxima;
    private int numeroTripulantes;
    private double combustivel;

    // Construtor
    public NaveEspacial(String nome, double velocidadeMaxima, int numeroTripulantes, double combustivel) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
        this.numeroTripulantes = numeroTripulantes;
        this.combustivel = combustivel;
    }

    // Métodos abstratos a serem implementados pelas subclasses
    abstract void acelerar(double velocidade);
    abstract void desacelerar(double velocidade);
    abstract void abastecer(double litros);
    abstract void viajar(double distancia);

    // Método toString para exibir informações sobre a nave
    @Override
    public String toString() {
        return "NaveEspacial{" +
                "nome='" + nome + '\'' +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", numeroTripulantes=" + numeroTripulantes +
                ", combustivel=" + combustivel +
                '}';
    }
}