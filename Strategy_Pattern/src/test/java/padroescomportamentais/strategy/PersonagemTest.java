package padroescomportamentais.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonagemTest {

    @Test
    void deveSomarAtributoPersonagem() {
        Personagem personagem = new Personagem();
        personagem.somarAtributo(80.0f, 20.0f);
        assertEquals(100.0f, personagem.getAtributo());
    }

    @Test
    void deveSubtrairAtributoPersonagem() {
        Personagem personagem = new Personagem();
        personagem.subtrairAtributo(80.0f, 10.0f);
        assertEquals(70.0f, personagem.getAtributo());
    }

    @Test
    void deveMultiplicarAtributoPersonagem() {
        Personagem personagem = new Personagem();
        personagem.multiplicarAtributo(80.0f, 1.1f);
        assertEquals(88.0f, personagem.getAtributo());
    }

    @Test
    void deveDividirAtributoPersonagem() {
        Personagem personagem = new Personagem();
        personagem.dividirAtributo(100.0f, 2.0f);
        assertEquals(50.0f, personagem.getAtributo());
    }

    @Test
    void naoDeveDividirAtributoPersonagemPorZero() {
        try {
            Personagem personagem = new Personagem();
            personagem.dividirAtributo(100.0f, 0.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Divisão de atributo por zero", e.getMessage());
        }
    }

    @Test
    void deveCalcularMediaAtributosPersonagem() {
        Personagem personagem = new Personagem();
        personagem.calcularMediaAtributos(70.0f, 80.0f);
        assertEquals(75.0f, personagem.getAtributo());
    }

}