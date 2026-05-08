package Tarea5;
public class OperacionesPractica2 {
    char operador;
    int operando1;
    int operando2;

    public OperacionesPractica2(char operador, double a, double b) {
        this.operador = operador;
        this.operando1 = (int) a;
        this.operando2 = (int) b;
    }

    public int Resultado() {
        Cevaluar eval = new Cevaluar(operador, operando1, operando2);
        return (int) eval.Evaluar();
    }

    public double ResultadoDouble() {
        Cevaluar eval = new Cevaluar(operador, operando1, operando2);
        return eval.Evaluar();
    }

    public String ResultadoString() {
        Cevaluar eval = new Cevaluar(operador, operando1, operando2);
        return eval.EvaluarString();
    }
}