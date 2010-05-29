package datos;
// Generated May 23, 2010 7:11:23 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Cargo generated by hbm2java
 */
public class Cargo  implements java.io.Serializable {


     private int idCargo;
     private String cargoDescripcion;
     private Set empleadoses = new HashSet(0);

    public Cargo() {

    }



    public Cargo(String cargoDescripcion) {
        this.cargoDescripcion= cargoDescripcion;
    }

	
    public Cargo(int idCargo, String cargoDescripcion) {
        this.idCargo = idCargo;
        this.cargoDescripcion = cargoDescripcion;
    }
    public Cargo(int idCargo, String cargoDescripcion, Set empleadoses) {
       this.idCargo = idCargo;
       this.cargoDescripcion = cargoDescripcion;
       this.empleadoses = empleadoses;
    }
   
    public int getIdCargo() {
        return this.idCargo;
    }
    
    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }
    public String getCargoDescripcion() {
        return this.cargoDescripcion;
    }
    
    public void setCargoDescripcion(String cargoDescripcion) {
        this.cargoDescripcion = cargoDescripcion;
    }
    public Set getEmpleadoses() {
        return this.empleadoses;
    }
    
    public void setEmpleadoses(Set empleadoses) {
        this.empleadoses = empleadoses;
    }


  public boolean equal(Object obj){
    int arr[]={0,0};
    //si obj es identico tiene la misma referencia
    if(this == obj){
        return true;
    }
    else{
        if(obj instanceof Cargo){
            Cargo car = (Cargo)obj;
            if(car.getIdCargo()==this.getIdCargo()){
                arr[0]=1;
            }
            if(car.getCargoDescripcion().equalsIgnoreCase(this.getCargoDescripcion())){
                arr[1]=1;
            }

            if((arr[0]==1) && (arr[1]==1)){               
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }

}// fin de metodo equal

}

