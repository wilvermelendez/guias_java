/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb;

/**
 *
 * @author wilver
 */
public class DesktopComputer extends Computer{

    //agregamos los atributos privados que se accederán por los metodos get y set respectivos de cada atributo
    private String tipoExtensionPuertos;
    private int numeroExtensionPuertos;
    public DesktopComputer()
    {
        
    }
    public DesktopComputer(int ramGB, int discoDuroGB, String marcaProcesador, float velocidadProcesadorGHz, String marca, String modelo)
    {
        super(ramGB,discoDuroGB, marcaProcesador,velocidadProcesadorGHz, marca, modelo);
        
    }

    public String getTipoExtensionPuertos() {
        return tipoExtensionPuertos;
    }

    public void setTipoExtensionPuertos(String tipoExtensionPuertos) {
        this.tipoExtensionPuertos = tipoExtensionPuertos;
    }

    public int getNumeroExtensionPuertos() {
        return numeroExtensionPuertos;
    }

    public void setNumeroExtensionPuertos(int numeroExtensionPuertos) {
        this.numeroExtensionPuertos = numeroExtensionPuertos;
    }
    
    
    public void getAllAttributeData()
    {
        StringBuilder result=new StringBuilder();
        result.append("Tipo de computadora de Escritorio").append("\n");
        result.append("Marca: ").append(this.getMarca()).append("\n");
        result.append("Modelo: ").append(this.getModelo()).append("\n");
        result.append("Disco duro en GB: ").append(this.getDiscoDuroGB()).append("\n");
        result.append("Cantidad de RAM GB: ").append(this.getRamGB()).append("\n");
        result.append("Marca procesador: ").append(this.getMarcaProcesador()).append("\n");
        result.append("Velocidad Procesador: ").append(this.getVelocidadProcesadorGHz()).append("\n");
        result.append("Tipo de puertos de extensión: ").append(this.getTipoExtensionPuertos()).append("\n");
        result.append("Número de extensión de puertos: ").append(this.getNumeroExtensionPuertos()).append("\n");
        MostrarMensaje(result.toString());
    }
    
    
    public void setAllAttributeData()
    {
        this.setMarca(PedirDatos("Ingrese la marca de la computadora"));
        this.setModelo(PedirDatos("Ingrese el modelo de la computadora"));
        this.setDiscoDuroGB(Integer.parseInt(PedirDatos("Ingrese la capacidad de disco duro en GB")));
        this.setRamGB(Integer.parseInt(PedirDatos("Ingrese la capacidad de RAM  en GB")));
        this.setMarcaProcesador(PedirDatos("Ingrese la marca del procesador de la computadora"));
        this.setVelocidadProcesadorGHz(Double.parseDouble(PedirDatos("Ingrese la velocidad del procesador en GHz")));
        this.setTipoExtensionPuertos(PedirDatos("Ingrese un tipo de puerto extensible de la computadora"));
        this.setNumeroExtensionPuertos(Integer.parseInt(PedirDatos("Ingrese el número de puertos extensibles disponibles")));
    }
}
