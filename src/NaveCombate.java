/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cezarino Hora
 */
// Classe para Naves de Combate
class NaveCombate extends NaveEspacial {
    private String armamento;

    // Construtor
    public NaveCombate(String nome, double velocidadeMaxima, int numeroTripulantes, double combustivel, String armamento) {
        super(nome, velocidadeMaxima, numeroTripulantes, combustivel);
        this.armamento = armamento;
    }

    // Método para atacar
    void atacar() {
        System.out.println("Nave de combate atacando com " + armamento + ".");
    }

    // Sobrescrita de método para exibir informações adicionais
    @Override
    public String toString() {
        return super.toString() + ", armamento='" + armamento + '\'';
    }

    // Implementação dos métodos abstratos
    @Override
    void acelerar(double velocidade) {
        // Implementação específica para NaveCombate
    }

    @Override
    void desacelerar(double velocidade) {
        // Implementação específica para NaveCombate
    }

    @Override
    void abastecer(double litros) {
        // Implementação específica para NaveCombate
    }

    @Override
    void viajar(double distancia) {
        // Implementação específica para NaveCombate
    }
}