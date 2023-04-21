
public class Persona {

	public String nombre;
	public int Edad;
	public int Dni;
	public char sexo;
	private boolean EsmayordeEdad;
	
	public Persona(String nombre,int Edad, int Dni, char sexo) {
		this.nombre = nombre ;
		this.Edad = Edad;
		this.Dni = Dni;
		this.sexo = sexo;
			
	}
	
	public String nombre() {
		
	 return nombre;
	
	}
	
	public int Edad () {
		
		return Edad;
	}

	public char sexo() {
		
		return sexo;
	}
	
	public void setcalcularIMC() {
		
	}
	
	public void setEsMayordeEdad(String EsmayordeEdad) {
		
		if (EsmayordeEdad == "si") {
			this.EsmayordeEdad=true;
		}else {
			this.EsmayordeEdad=false;
		}
		
	}
	
	public void setComprobarSexo(char sexo) {
		
		char h;
		return;
		
	}
	
	 public void generaDNI() {
		 
		 return;
		 
	 }
	
	
}
