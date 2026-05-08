package Tarea5;
public class PruebaOperaciones3 {
    public static void main(String args[]) {
        Operacion3 a, b, c;
        a = new Operacion3();
        a.operando1 = 5;
        a.operando2 = 6;
        System.out.println(a.suma());
        b = new Operacion3(6, 7);
        System.out.println(b.suma());
        c = new Operacion3(10.9, 9.9);
        System.out.println(c.suma());
    }
}