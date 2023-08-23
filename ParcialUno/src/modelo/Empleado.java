package modelo;
    import javax.swing.JOptionPane;
/**
 *
 * @author Luis Sazo
 */
public class Empleado extends Persona{
    // Atributos
    private String codigo;
    private String sueldo;
    private String bonificacion;
    
    
    // Metodo constructor vacio
    public Empleado(){
        
    }
    // Metodo constructor con paramétros
    public Empleado(String codigo, String nombres, String apellidos, String direccion, String telefono,
             String fechaNac, String sueldo, String bonificacion) {
        
        super(nombres, apellidos, direccion, telefono, fechaNac);
        this.codigo = codigo;
        this.sueldo =  sueldo;
        this.bonificacion = bonificacion;
        
    }
    
    // Getters and Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }

    public String getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(String bonificacion) {
        this.bonificacion = bonificacion;
    }
    
    // Metodo para agreagar
    @Override
    public String [] datos(){
        try{
            String datos [] = new String[9];
            datos[0] = this.getCodigo();
            datos[1] = this.getNombres();
            datos[2] = this.getApellidos();
            datos[3] = this.getDireccion();
            datos[4] = this.getTelefono();
            datos[5] = this.getFechaNac();
            datos[6] = this.getSueldo();
            datos[7] = this.getBonificacion();
            
            return datos;
        }catch(Exception e){
           JOptionPane.showMessageDialog(null, "¡Error!" + e);
        }
        return null;
    }
    
}
