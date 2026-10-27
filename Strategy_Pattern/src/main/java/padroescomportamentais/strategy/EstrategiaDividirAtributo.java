package padroescomportamentais.strategy;

public class EstrategiaDividirAtributo implements EstrategiaAtributo {

    public float calcular(float valor1, float valor2) {
        if (valor2 == 0) {
            throw new IllegalArgumentException("Divisão de atributo por zero");
        }
        else {
            return valor1 / valor2;
        }
    }
}