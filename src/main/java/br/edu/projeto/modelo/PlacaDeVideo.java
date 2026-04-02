package br.edu.projeto.modelo;

public class PlacaDeVideo extends Componente {
    private int memoriaVramGb;
    private boolean suportaRayTracing;

    public PlacaDeVideo(String marca, String modelo, double preco, int memoriaVramGb, boolean suportaRayTracing) {
        super(marca, modelo, preco);
        this.memoriaVramGb = memoriaVramGb;
        this.suportaRayTracing = suportaRayTracing;
    }

    @Override
    public void realizarBenchmark() {
        String rt = suportaRayTracing ? "Ativado" : "Desativado";
        System.out.println("=> [Benchmark GPU] Renderizando gráficos pesados em " + memoriaVramGb + "GB de VRAM. Ray Tracing: " + rt + ".");
    }

    // Getters e Setters omitidos por brevidade (lembrem-se de gerar na IDE!)

    @Override
    public String toString() {
        return "Placa de Vídeo [" + super.toString() + ", VRAM=" + memoriaVramGb + "GB, Ray Tracing=" + suportaRayTracing + "]";
    }
}
