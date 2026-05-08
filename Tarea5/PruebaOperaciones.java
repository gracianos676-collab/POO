package Tarea5;
public class PruebaOperaciones {
    public static void main(String args[]) {
        Operacion1 a,b;
        a = new Operacion1();
        a.operando1 = 5;
        a.operando2 = 6;
        System.out.println(a.suma());
        b = new Operacion1();
        b.operando1 = 55;
        b.operando2 = 66;
        System.out.println(b.suma());
    }
}
