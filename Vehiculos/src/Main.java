public class Main {
    public static void main(String[] args) {

        Terrestre camioneta = new Terrestre(50, 4);
        camioneta.acelerar(50);
        camioneta.frenar(20);
        camioneta.imprimir();
        var rpm = camioneta.calcularRevolucionesMotor(500, 10);
        System.out.println("Revoluciones del motor: " + rpm);

        System.out.println("----------");

        Acuatico motoAcuatica = new Acuatico(50, 120);
        int velRecomendada = motoAcuatica.recomendarVelocidad(50);
        int rpmAcuatica = motoAcuatica.calcularRevolucionesMotor(300, 50);

        motoAcuatica.acelerar(velRecomendada);
        motoAcuatica.imprimir();
        System.out.println("Velocidad recomendada: " + velRecomendada);
        System.out.println("Revoluciones del motor acuático: " + rpmAcuatica);


}
}
