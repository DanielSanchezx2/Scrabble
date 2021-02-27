enum Uso{ SIN_USAR , USADO };

public class Bonos extends Coordenadas
{
	private char simbPuntos;
	private int tipo_puntos;
	private Coordenadas posicion;
	private Uso validarUso;

	public Bonos(Coordenadas posicion)
	{
		this.validarUso = validarUso.SIN_USAR;
		this.posicion = posicion;
	}

	public Bonos(char simbPuntos, Uso validarUso, int tipo_puntos, Coordenadas posicion)
	{
		this.simbPuntos = simbPuntos;
		this.validarUso = validarUso;
		this.tipo_puntos = tipo_puntos;
		this.posicion = posicion;
	}

	public void setPosicion(Coordenadas a)
	{
		posicion.setPosiciones(a);
	}

	public Coordenadas getPosicion()
	{
		return posicion;
	}

	public void setLetra(char b)
	{
		this.simbPuntos = b;
	}

	public char getLetra()
	{
		return this.simbPuntos;
	}

	/*public void setLetraArr()
	{
		this.simbPuntos = tipo_puntos.charAt(0);
	}

	public void setLetraArr2()
	{
	}*/
}