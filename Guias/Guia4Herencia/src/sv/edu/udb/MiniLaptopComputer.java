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
public class MiniLaptopComputer extends LaptopComputer{
    
    private int vidaUtil;
    public MiniLaptopComputer()
    {
    }
    public MiniLaptopComputer(int ramGB, int discoDuroGB, String marcaProcesador, float velocidadProcesadorGHz, String marca, String modelo,int batteryLifeHours, int weightPound, int vidaUtil )
    {
        super(ramGB,discoDuroGB, marcaProcesador,velocidadProcesadorGHz, marca, modelo, batteryLifeHours, weightPound);
        this.vidaUtil=vidaUtil;
    }
    public void getAllAttributeData()
    {
        StringBuilder result=new StringBuilder();
        result.append("Tipo de computadora Mini-Laptop").append("\n");
        result.append("Marca: ").append(this.getMarca()).append("\n");
        result.append("Modelo: ").append(this.getModelo()).append("\n");
        result.append("Disco duro en GB: ").append(this.getDiscoDuroGB()).append("\n");
        result.append("Cantidad de RAM GB: ").append(this.getRamGB()).append("\n");
        result.append("Marca procesador: ").append(this.getMarcaProcesador()).append("\n");
        result.append("Velocidad Procesador: ").append(this.getVelocidadProcesadorGHz()).append("\n");
        result.append("Tiempo de duración de la batería en horas: ").append(this.getBatteryLifeHours()).append("\n");
        result.append("El peso de la Laptop en libras: ").append(this.getWeightPound()).append("\n");
        result.append("Vida Util: ").append(this.getVidaUtil()).append("\n");
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
        this.setBatteryLifeHours(Integer.parseInt(PedirDatos("Ingrese el número de horas de la batería")));
        this.setWeightPound(Integer.parseInt(PedirDatos("Ingrese el peso de la computadora en libras")));
        this.setVidaUtil(Integer.parseInt(PedirDatos("Ingrese la vida util en años")));
        
    }

    public int getVidaUtil() {
        return vidaUtil;
    }

    public void setVidaUtil(int vidaUtil) {
        this.vidaUtil = vidaUtil;
    }
}
