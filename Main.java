public class Main {
    public static void main(String[] args) {
        LineaTeleferico rojo = new LineaTeleferico("Rojo", "Estación Central - Cementerio - 16 de Julio", 20);
        rojo.agregarEmpleado(new Empleado("Pedro", "Rojas", "Luna", 35, 2000));
        rojo.agregarEmpleado(new Empleado("Lucy", "Sosa", "Rios", 43, 2500));
        rojo.agregarEmpleado(new Empleado("Ana", "Perez", "Rojas", 26, 3250));
        rojo.agregarEmpleado(new Empleado("Saul", "Arce", "Calle", 29, 2700));

        LineaTeleferico verde = new LineaTeleferico("Verde", "Irpavi - Alto Obrajes", 15);

        System.out.println("--- Empleados Línea Rojo ---");
        rojo.mostrarEmpleados();

        System.out.println("\n-- Eliminando empleados con apellido Rojas --");
        rojo.eliminarEmpleadoPorApellido("Rojas");
        rojo.mostrarEmpleados();

        System.out.println("\n-- Transfiriendo empleado Saul Arce Calle a línea Verde --");
        rojo.transferirEmpleado("Saul Arce Calle", verde);

        System.out.println("\n-- Empleados Línea Rojo después de transferencia --");
        rojo.mostrarEmpleados();

        System.out.println("\n-- Empleados Línea Verde --");
        verde.mostrarEmpleados();

        System.out.println("\n-- Empleados con mayor edad en Línea Rojo --");
        rojo.mostrarEmpleados("edad");

        System.out.println("\n-- Empleados con mayor sueldo en Línea Rojo --");
        rojo.mostrarEmpleados("sueldo");
    }
}
