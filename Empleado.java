public class Empleado {
    private String nombre;
    private String paterno;
    private String materno;
    private int edad;
    private float sueldo;

    public Empleado(String nombre, String paterno, String materno, int edad, float sueldo) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.edad = edad;
        this.sueldo = sueldo;
    }

    public void mostrar() {
        System.out.println(nombre + " " + paterno + " " + materno + " - Edad: " + edad + " - Sueldo: " + sueldo);
    }

    public int getEdad() {
        return edad;
    }

    public float getSueldo() {
        return sueldo;
    }

    public String getNombreCompleto() {
        return nombre + " " + paterno + " " + materno;
    }

    public boolean tieneApellido(String apellido) {
        return paterno.equalsIgnoreCase(apellido) || materno.equalsIgnoreCase(apellido);
    }
}
