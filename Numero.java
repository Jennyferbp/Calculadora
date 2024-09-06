package poo;

public class Numero {

    //double tipo primitivo que armazena ponto flutuando de precisão dupla
    private double x;

    private double getX() {
        //get é usado para obter e retornar um valor "setado"
        return x;
    }

    private void setX(double x) {
        //set é usado para receber os dados
        //this é usado para chamar um construtor
        this.x = x;
    }

    public double soma (double x, double y) {
        setX(x + y);
        return getX();
    }

    public double subtracao (double x, double y) {
        setX(x - y);
        return getX();
    }
    
    public double multiplicacao (double x, double y) {
        setX(x * y);
        return getX();
    }

    public double divisao (double x, double y) {
        setX(x / y);
        return getX(); 
    }

}
