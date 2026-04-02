package br.edu.projeto.modelo;

public class Processador extends Componente {
    private int quantidadeNucleos;
    private double clockBaseGhz;

    public Processador(String marca, String modelo, double preco, int quantidadeNucleos, double clockBaseGhz) {
        super(marca, modelo, preco);
        this.quantidadeNucleos = quantidadeNucleos;
        this.clockBaseGhz = clockBaseGhz;
    }

    @Override
    public void realizarBenchmark() {
        System.out.println("=> [Benchmark CPU] Testando processamento multithread com " + quantidadeNucleos + " núcleos operando a " + clockBaseGhz + "GHz.");
    }

    // Getters e Setters omitidos por brevidade (lembrem-se de gerar na IDE!)

    @Override
    public String toString() {
        return "Processador [" + super.toString() + ", Núcleos=" + quantidadeNucleos + ", Clock=" + clockBaseGhz + "GHz]";
    }
}
