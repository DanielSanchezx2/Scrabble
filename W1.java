public class W1 extends Bonos
{
	//private List<Coordenada> p = new ArrayList<Coordenada>();

	public W1(Uso validarUso, Coordenadas posicion)
	{
		super('W', validarUso, 3 , posicion);
	}

	public char getLetter()
	{
		return super.getLetra();
	}

	public void setLetter()
	{
		super.setLetra('W');
	}
}