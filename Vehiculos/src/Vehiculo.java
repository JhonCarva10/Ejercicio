public abstract class Vehiculo {
    protected int velocidadActual;
    protected int velocidadMaxima;

    protected Vehiculo(int velocidadActual, int velocidadMaxima){
        this.velocidadActual = velocidadActual;
        this.velocidadMaxima = velocidadMaxima;
    }
    public abstract void acelerar(int velocidad);

    public abstract void frenar(int velocidad);

    public void imprimir(){
        System.out.println("La velocidad actual es de: " + velocidadActual + "km/h");
        System.out.println("La velocidad máxima es de: " + velocidadMaxima + "km/h");
    }

}