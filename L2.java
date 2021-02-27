public class L2 extends Bonos
{
	//private List<Coordenada> p = new ArrayList<Coordenada>();

	public L2(Uso validarUso, Coordenadas posicion)
	{
		super('l', validarUso, 3 , posicion);
	}

	public char getLetter()
	{
		return super.getLetra();
	}

	public void setLetter()
	{
		super.setLetra('l');
	}
}