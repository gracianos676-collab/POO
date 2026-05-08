package Tarea5;
public class Operacion2{
    int operando1, operando2;

    public int suma(){
        return operando1+operando2;
    }
    
    public int suma(int a,int b){
        operando1 = a;
        operando2 = b;
        return operando1 + operando2;
    }
    
    public double suma(double a,double b){
        operando1 = (int) a;
        operando2 = (int) b;
        return (double) (operando1+operando2);
    }
}
