public class Acuatico extends Vehiculo implements Vela, Motor {
    public int velocidadActual;
    public int velocidadMaxima;
    public String tipo;
    public String capacidadPasajeros;

    public Acuatico(int velocidadActual, int velocidadMaxima) {
        super(velocidadActual, velocidadMaxima);
    }

    @Override
    public void acelerar(int velocidad) {
        velocidadActual += velocidad;
        if (velocidadActual > velocidadMaxima) {
            velocidadActual = velocidadMaxima;
        }
    }

    @Override
    public void frenar(int velocidad) {
        velocidadActual -= velocidad;
        if (velocidadActual < 0) {
            velocidadActual = 0;
        }
    }


    @Override
    public int recomendarVelocidad(int velocidadViento) {
        if (velocidadViento > 80) {
            System.out.println("Velocidad del viento muy alta. Se recomienda no salir a navegar.");
            return 0;
        } else if (velocidadViento < 10) {
            System.out.println("Es muy baja no se recomienda salir a navegar");
            return 0;
        } else {
            System.out.println("Velocidad recomendada: " + velocidadViento + " km/h");
            return velocidadViento;
        }
    }

    @Override
    public int calcularRevolucionesMotor(int fuerza, int radio) {
        return fuerza * radio;
    }
}
