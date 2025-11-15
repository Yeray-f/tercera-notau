package GestionParqueadero;


import java.util.ArrayList;

public class GestionParqueadero {

    private ArrayList<Vehiculo> vehiculos;
    private ArrayList<EspacioParqueadero> espacios;

    public GestionParqueadero() {
        vehiculos = new ArrayList<>();
        espacios = new ArrayList<>();
    }

    public void registrarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
        System.out.println("Vehículo registrado: " + vehiculo.getPlaca());
    }

    public void agregarEspacio(EspacioParqueadero espacio) {
        espacios.add(espacio);
        System.out.println("Espacio agregado: " + espacio.getNumero() +
                           " (" + espacio.getTipoPermitido() + ")");
    }

    public void mostrarEspaciosDisponibles() {
        System.out.println("\nEspacios disponibles:");
        for (EspacioParqueadero e : espacios) {
            if (e.estaDisponible()) {
                System.out.println("- Espacio " + e.getNumero() +
                                   " | Tipo: " + e.getTipoPermitido());
            }
        }
    }

    public void asignarEspacio(String placa) {
        Vehiculo vehiculo = buscarVehiculo(placa);

        if (vehiculo == null) {
            System.out.println("El vehículo no está registrado.");
            return;
        }

        for (EspacioParqueadero e : espacios) {
            if (e.estaDisponible() && e.getTipoPermitido().equals(vehiculo.getTipo())) {
                e.asignarVehiculo(vehiculo);
                return;
            }
        }

        System.out.println("No hay espacios disponibles para un " + vehiculo.getTipo());
    }

    private Vehiculo buscarVehiculo(String placa) {
        for (Vehiculo v : vehiculos) {
            if (v.getPlaca().equalsIgnoreCase(placa)) {
                return v;
            }
        }
        return null;
    }
}

