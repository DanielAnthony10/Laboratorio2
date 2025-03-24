package Laboratorio2.ejercicioss;

public class OperacionesMatDouble implements Operable<Double> {

    public Double suma(Double operando1, Double operando2){
        return operando1 + operando2;
    }

    public Double resta(Double operando1, Double operando2){
        return operando1 - operando2;
    }

    public Double producto(Double operando1, Double operando2){
        return operando1 * operando2;
    }

    public Double division(Double operando1, Double operando2){
        return operando1 / operando2;
    }

    public Double potencia(Double base, Double exponente){
        return Math.pow(base, exponente);
    }

    public Double raizCuadrada(Double operando){
        return Math.sqrt(operando);
    }

    public Double raizCubica(Double operando){
        return Math.cbrt(operando);
    }
}
