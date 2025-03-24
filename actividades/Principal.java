package Laboratorio2.actividades;

public class Principal {
    public static void main(String[] args) {
        Bolsa < Chocolatina > bolsaCho = new Bolsa < Chocolatina >(); //Aca el constructor de Bolsa no estaba inicializado así que puse un 
        Chocolatina c = new Chocolatina("Milka");               //constructor por defecto
        Chocolatina c1 = new Chocolatina("Milka");
        Chocolatina c2 = new Chocolatina("Ferrero");
        bolsaCho.add(c);
        bolsaCho.add(c1);
        bolsaCho.add(c2);
        for (Chocolatina chocolatina: bolsaCho) {
            System.out.println(chocolatina.getMarca());
        }
    }
}
    