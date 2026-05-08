package Tarea5;
public class OperacionesPractica {
	char operador;
	int operando1;
	int operando2;
	
	public OperacionesPractica(char operador, int a, int b) {
        this.operador = operador;
        this.operando1 = a;
        this.operando2 = b;
    }
	
	public OperacionesPractica(char operador, double a, double b) {
        this.operador = operador;
        this.operando1 = (int) a;
        this.operando2 = (int) b;
    }
	
    public int Resultado() {
        switch (operador) {
            case '+': return operando1 + operando2;
            case '-': return operando1 - operando2;
            case '*': return operando1 * operando2;
            case '/': return operando2 != 0 ? operando1 / operando2 : 0;
            default: return 0;
        }
    }


    public double ResultadoDouble() {
        switch (operador) {
            case '+': return (double) operando1 + operando2;
            case '-': return (double) operando1 - operando2;
            case '*': return (double) operando1 * operando2;
            case '/': return operando2 != 0 ? (double) operando1 / operando2 : 0.0;
            default: return 0.0;
        }
    }

    public String ResultadoString() {
        return "Operación: " + operando1 + " " + operador + " " + operando2 + " = " + Resultado();
    }
}
