package Laboratorio2.ejercicioss;

public class OperacionesMatInteger implements Operable<Integer> {

    public Integer suma(Integer operando1, Integer operando2){
        return operando1 + operando2;
    }

    public Integer resta(Integer operando1, Integer operando2){
        return operando1 - operando2;
    }

    public Integer producto(Integer operando1, Integer operando2){
        return operando1 * operando2;
    }

    public Integer division(Integer operando1, Integer operando2){
        return operando1 / operando2;
    }
    
    public Integer potencia(Integer base, Integer exponente){
        return (int) Math.pow(base, exponente);
    }

    public Integer raizCuadrada(Integer operando){
        return (int) Math.sqrt(operando);
    }

    public Integer raizCubica(Integer operando){
        return (int) Math.cbrt(operando);
    }
}
