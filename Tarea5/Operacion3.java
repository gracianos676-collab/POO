package Tarea5;
public class Operacion3 {
    int operando1, operando2;

    public Operacion3() {
    }

    public Operacion3(int a, int b) {
        operando1 = a;
        operando2 = b;
    }

    public Operacion3(double a, double b) {
        operando1 = (int)a;
        operando2 = (int)b;
    }

    public int suma() {
        return operando1 + operando2;
    }
}