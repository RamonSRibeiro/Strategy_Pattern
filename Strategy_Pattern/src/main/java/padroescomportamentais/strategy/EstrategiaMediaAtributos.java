package padroescomportamentais.strategy;

public class EstrategiaMediaAtributos implements EstrategiaAtributo {

    public float calcular(float valor1, float valor2) {
        return (valor1 + valor2) / 2;
    }
}