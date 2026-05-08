package Tarea5;
public class Cevaluar {
 char operador;
 int operando1;
 int operando2;

 public Cevaluar(char operador, double a, double b) {
     this.operador = operador;
     this.operando1 = (int) a;
     this.operando2 = (int) b;
 }

 public double Evaluar() {
     switch (operador) {
         case '+': return operando1 + operando2;
         case '-': return operando1 - operando2;
         case '*': return operando1 * operando2;
         case '/': return operando2 != 0 ? (double) operando1 / operando2 : 0.0;
         default: return 0.0;
     }
 }

 public String EvaluarString() {
     return "Operación: " + operando1 + " " + operador + " " + operando2 + " = " + Evaluar();
 }
}
