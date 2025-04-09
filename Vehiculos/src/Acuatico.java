public class Acuatico  extends Vehiculo implements Vela, Motor{
    public int velocidadActual;
    public int velocidadMaxima;
    public Acuatico(int velocidadActual, int velocidadMaxima){
        super(velocidadActual, velocidadMaxima);
        this.velocidadActual = velocidadActual;
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public void acelerar(int velocidad) {

    }

    @Override
    public void frenar(int velocidad) {

    }


    @Override
    public void recomendarVelocidad(int velocidadViento) {

    }

    @Override
    public int calcularRevolucionesMotor(int fuerza, int radio) {
        return fuerza * radio;
    }
}
