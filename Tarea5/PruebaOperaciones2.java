package Tarea5;
public class PruebaOperaciones2 {
    public static void main(String args[]){
        Operacion2 a,b,c;
        a = new Operacion2();
        a.operando1 = 5;
        a.operando2 = 6;
        System.out.println(a.suma());
        b = new Operacion2();
        System.out.println(b.suma(6,7));
        c = new Operacion2();
        System.out.println(c.suma(10.9,8.5));
    }
}