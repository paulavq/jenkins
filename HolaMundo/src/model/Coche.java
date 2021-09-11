/**
 * 
 */
package model;

/**
 * @author alumno
 *
 */
public class Coche {
	
	private String modelo;
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Coche [modelo=" + modelo + "]";
	}
	
	
}
