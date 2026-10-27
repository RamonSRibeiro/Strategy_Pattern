package padroescomportamentais.strategy;

public class Personagem {

    private float atributo;

    public float getAtributo() {
        return atributo;
    }

    public void somarAtributo(float atributo1, float atributo2) {
        CalculadoraAtributos calculadora = new CalculadoraAtributos(atributo1, atributo2);
        this.atributo = calculadora.calcular(new EstrategiaSomarAtributo());
    }

    public void subtrairAtributo(float atributo1, float atributo2) {
        CalculadoraAtributos calculadora = new CalculadoraAtributos(atributo1, atributo2);
        this.atributo = calculadora.calcular(new EstrategiaSubtrairAtributo());
    }

    public void dividirAtributo(float atributo1, float atributo2) {
        CalculadoraAtributos calculadora = new CalculadoraAtributos(atributo1, atributo2);
        this.atributo = calculadora.calcular(new EstrategiaDividirAtributo());
    }

    public void multiplicarAtributo(float atributo1, float atributo2) {
        CalculadoraAtributos calculadora = new CalculadoraAtributos(atributo1, atributo2);
        this.atributo = calculadora.calcular(new EstrategiaMultiplicarAtributo());
    }

    public void calcularMediaAtributos(float atributo1, float atributo2) {
        CalculadoraAtributos calculadora = new CalculadoraAtributos(atributo1, atributo2);
        this.atributo = calculadora.calcular(new EstrategiaMediaAtributos());
    }

}