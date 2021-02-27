public class W2 extends Bonos
{
	//private List<Coordenada> p = new ArrayList<Coordenada>();

	public W2(Uso validarUso, Coordenadas posicion)
	{
		super('w', validarUso, 2 , posicion);
	}

	public char getLetter()
	{
		return super.getLetra();
	}

	public void setLetter()
	{
		super.setLetra('w');
	}
}