package padroescomportamentais.strategy;

public class CalculadoraAtributos {

    private float valor1;
    private float valor2;

    public CalculadoraAtributos(float valor1, float valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public float calcular(EstrategiaAtributo estrategia) {
        return estrategia.calcular(valor1, valor2);
    }
}