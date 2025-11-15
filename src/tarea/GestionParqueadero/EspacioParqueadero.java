package GestionParqueadero;

public class EspacioParqueadero {

    private int numero;
    private String tipoPermitido;   
    private boolean ocupado;
    private Vehiculo vehiculoAsignado;

    public EspacioParqueadero(int numero, String tipoPermitido) {
        this.numero = numero;
        this.tipoPermitido = tipoPermitido.toLowerCase();
        this.ocupado = false;
        this.vehiculoAsignado = null;
    }

    public boolean asignarVehiculo(Vehiculo vehiculo) {
        if (ocupado) {
            System.out.println("El espacio " + numero + " ya está ocupado.");
            return false;
        }

        if (!vehiculo.getTipo().equals(tipoPermitido)) {
            System.out.println("El vehículo tipo " + vehiculo.getTipo() +
                               " no puede ocupar un espacio para " + tipoPermitido);
            return false;
        }

        this.vehiculoAsignado = vehiculo;
        this.ocupado = true;

        System.out.println("Vehículo " + vehiculo.getPlaca() +
                           " asignado al espacio " + numero);
        return true;
    }

    public void liberarEspacio() {
        if (!ocupado) {
            System.out.println("El espacio " + numero + " ya está libre.");
            return;
        }

        System.out.println("Espacio " + numero + " liberado. Vehículo " +
                           vehiculoAsignado.getPlaca() + " salió.");
        this.vehiculoAsignado = null;
        this.ocupado = false;
    }

    public boolean estaDisponible() {
        return !ocupado;
    }

    public int getNumero() {
        return numero;
    }

    public String getTipoPermitido() {
        return tipoPermitido;
    }
}
