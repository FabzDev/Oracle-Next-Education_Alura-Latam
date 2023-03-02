package Ejercicio6BloquePOOV2;

public class NumeroComplejo {
    private double a;
    private double b;

    public NumeroComplejo(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public NumeroComplejo sumarComplejo(NumeroComplejo c){
        NumeroComplejo suma = new NumeroComplejo(a+c.getA(), b+getB());
        return suma;
    }

    public NumeroComplejo multiplicarComplejo(NumeroComplejo c){
        NumeroComplejo multi = new NumeroComplejo(a*c.getA()-b*getB(),a*c.getB()+b*c.getA());
        return multi;
    }

    public boolean comprobarIgualdad(NumeroComplejo c){
        if (this.a == c.getA() && b == c.getB()){
            return true;
        }else{
            return false;
        }
    }

    public NumeroComplejo multiplicarEntero(int i){
        NumeroComplejo multEntero = new NumeroComplejo(a*i, b*i);
        return multEntero;
    }


    }