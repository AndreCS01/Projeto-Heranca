package br.edu.projeto;

import br.edu.projeto.modelo.Componente;
import br.edu.projeto.modelo.PlacaDeVideo;
import br.edu.projeto.modelo.Processador;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Iniciando o Sistema de Gestão do Setup ---");

        // Instanciando objetos das subclasses
        Processador cpu = new Processador("AMD", "Ryzen 7 7800X3D", 2500.00, 8, 4.2);
        PlacaDeVideo gpu = new PlacaDeVideo("NVIDIA", "RTX 4070", 4000.00, 12, true);

        // Polimorfismo: usando a superclasse para referenciar objetos das subclasses
        List<Componente> meuSetup = new ArrayList<>();
        meuSetup.add(cpu);
        meuSetup.add(gpu);

        System.out.println("\n--- Detalhes dos Componentes ---");
        for (Componente comp : meuSetup) {
            System.out.println(comp.toString());
        }

        System.out.println("\n--- Executando Benchmarks (Polimorfismo) ---");
        for (Componente comp : meuSetup) {
            // O Java descobre em tempo de execução qual método realizarBenchmark() chamar
            comp.realizarBenchmark(); 
        }
    }
}
