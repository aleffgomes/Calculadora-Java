package com.mycompany.calculadora;

/**
 *
 * @author alefgomes
 */
public class Calculadora {

    private float numero1 = 0;
    private float numero2 = 0;
    private float resultado;

    public Calculadora(float numero1, float numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Calculadora(float numero) {
        this.numero1 = numero;
    }

    public float soma() {
        resultado = numero1 + numero2;
        return resultado;
    }

    public float subtracao() {
        resultado = numero1 - numero2;
        return resultado;
    }

    public float multiplicacao() {
        resultado = numero1 * numero2;
        return resultado;
    }

    public float divisao() {
        resultado = numero1 / numero2;
        return resultado;
    }

    public float aoQuadrado() {
        resultado = (float) Math.pow(numero1, 2);
        return resultado;
    }

}
