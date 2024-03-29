package aplicacion;

import java.io.Serializable;

public class Coordenadas implements Serializable
{
	private static final long serialVersionUID = 1L;
	private int identificacion;
	private double latitud, longitud;
	
	
	Coordenadas( int identificacion, double latitud, double longitud )
	{
		this.identificacion = identificacion;
		this.latitud        = latitud;
		this.longitud       = longitud;
	}
	
	
	public int identificacion() 
	{
		return identificacion;
	}
	
	
	public double latitud() 
	{
		return latitud;
	}
	
	
	public double longitud() 
	{
		return longitud;
	}
}
