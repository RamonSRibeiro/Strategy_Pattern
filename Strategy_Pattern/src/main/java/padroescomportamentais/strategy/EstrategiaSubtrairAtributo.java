package padroescomportamentais.strategy;

public class EstrategiaSubtrairAtributo implements EstrategiaAtributo {

    public float calcular(float valor1, float valor2) {
        return valor1 - valor2;
    }
}