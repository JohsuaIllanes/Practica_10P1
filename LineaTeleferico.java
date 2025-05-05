import java.util.ArrayList;

public class LineaTeleferico {
    private String color;
    private String tramo;
    private int nroCabinas;
    private ArrayList<Empleado> empleados;

    public LineaTeleferico(String color, String tramo, int nroCabinas) {
        this.color = color;
        this.tramo = tramo;
        this.nroCabinas = nroCabinas;
        empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado e) {
        empleados.add(e);
    }

    public void mostrarEmpleados() {
        for (Empleado e : empleados) {
            e.mostrar();
        }
    }

    public void mostrarEmpleados(String criterio) {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados.");
            return;
        }

        if (criterio.equalsIgnoreCase("edad")) {
            int maxEdad = empleados.get(0).getEdad();
            for (Empleado e : empleados) {
                if (e.getEdad() > maxEdad) {
                    maxEdad = e.getEdad();
                }
            }
            System.out.println("Empleados con mayor edad (" + maxEdad + "):");
            for (Empleado e : empleados) {
                if (e.getEdad() == maxEdad) {
                    e.mostrar();
                }
            }
        } else if (criterio.equalsIgnoreCase("sueldo")) {
            float maxSueldo = empleados.get(0).getSueldo();
            for (Empleado e : empleados) {
                if (e.getSueldo() > maxSueldo) {
                    maxSueldo = e.getSueldo();
                }
            }
            System.out.println("Empleados con mayor sueldo (" + maxSueldo + "):");
            for (Empleado e : empleados) {
                if (e.getSueldo() == maxSueldo) {
                    e.mostrar();
                }
            }
        } else {
            System.out.println("Criterio no reconocido.");
        }
    }

    public void eliminarEmpleadoPorApellido(String apellido) {
        empleados.removeIf(e -> e.tieneApellido(apellido));
    }

    public void transferirEmpleado(String nombreCompleto, LineaTeleferico destino) {
        for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i).getNombreCompleto().equalsIgnoreCase(nombreCompleto)) {
                destino.agregarEmpleado(empleados.get(i));
                empleados.remove(i);
                break;
            }
        }
    }
}
