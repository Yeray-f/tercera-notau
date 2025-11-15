package GestionParqueadero;


public class Main {
    public static void main(String[] args) {

        GestionParqueadero gestion = new GestionParqueadero();

        gestion.agregarEspacio(new EspacioParqueadero(1, "carro"));
        gestion.agregarEspacio(new EspacioParqueadero(2, "carro"));
        gestion.agregarEspacio(new EspacioParqueadero(3, "moto"));
        gestion.agregarEspacio(new EspacioParqueadero(4, "moto"));

        Vehiculo v1 = new Vehiculo("ABC123", "carro", "Juan");
        Vehiculo v2 = new Vehiculo("XYZ789", "moto", "Ana");
        Vehiculo v3 = new Vehiculo("RRR555", "moto", "Luis");

        gestion.registrarVehiculo(v1);
        gestion.registrarVehiculo(v2);
        gestion.registrarVehiculo(v3);

        gestion.mostrarEspaciosDisponibles();

        gestion.asignarEspacio("ABC123"); 
        gestion.asignarEspacio("XYZ789"); 
        gestion.asignarEspacio("RRR555"); 

        gestion.asignarEspacio("XYZ789"); 
    }
}
