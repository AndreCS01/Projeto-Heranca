package br.edu.projeto.modelo;

public class Componente {
    private String marca;
    private String modelo;
    private double preco;

    public Componente(String marca, String modelo, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
    }

    // Método que será sobrescrito (Polimorfismo)
    public void realizarBenchmark() {
        System.out.println("Realizando teste genérico de desempenho do componente...");
    }

    // Getters e Setters (Encapsulamento)
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
    
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    
    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    @Override
    public String toString() {
        return "Componente [Marca=" + marca + ", Modelo=" + modelo + ", Preço=R$" + preco + "]";
    }
}
