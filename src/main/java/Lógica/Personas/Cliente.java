
package Lógica.Personas;


public class Cliente extends Persona{
    private String mail;
    private String cuil;
    private String nacionalidad;
    
    //Constructor 
    public Cliente(int id, String nombre, String apellido, String dni, String fechaNacimiento, String direccion, String mail, String cuil, String nacionalidad) {
        super(id, nombre, apellido, dni, fechaNacimiento, direccion);
        this.mail = mail;
        this.cuil = cuil;
        this.nacionalidad = nacionalidad;
    }
    
    //Getters 
    public String getMail() {
        return mail;
    }

    public String getCuil() {
        return cuil;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }
    
    
    //Setters
    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setCuil(String cuil) {
        this.cuil = cuil;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }    
    
    //Metodos
    
    public void mostrarInfo() {
        super.mostrarInfo(); 
        System.out.println("Mail: "+mail);
        System.out.println("CUIL: "+cuil);
        System.out.println("Nacionalidad: "+nacionalidad);
    }
    
    public String soyUn() {
        return "cliente";
    }
}


