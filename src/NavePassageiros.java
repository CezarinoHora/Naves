/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cezarino Hora
 */
// Classe para Naves de Passageiros
class NavePassageiros extends NaveEspacial {
    private int numeroPassageiros;

    // Construtor
    public NavePassageiros(String nome, double velocidadeMaxima, int numeroTripulantes, double combustivel, int numeroPassageiros) {
        super(nome, velocidadeMaxima, numeroTripulantes, combustivel);
        this.numeroPassageiros = numeroPassageiros;
    }

    // Método para embarcar passageiros
    void embarcar(int passageiros) {
        System.out.println("Embarcando " + passageiros + " passageiros na nave de passageiros.");
    }

    // Sobrescrita de método para exibir informações adicionais
    @Override
    public String toString() {
        return super.toString() + ", numeroPassageiros=" + numeroPassageiros;
    }

    // Implementação dos métodos abstratos
    @Override
    void acelerar(double velocidade) {
        // Implementação específica para NavePassageiros
    }

    @Override
    void desacelerar(double velocidade) {
        // Implementação específica para NavePassageiros
    }

    @Override
    void abastecer(double litros) {
        // Implementação específica para NavePassageiros
    }

    @Override
    void viajar(double distancia) {
        // Implementação específica para NavePassageiros
    }
}
