public class L1 extends Bonos
{
	//private List<Coordenada> p = new ArrayList<Coordenada>();

	public L1(Uso validarUso, Coordenadas posicion)
	{
		super('L', validarUso, 3 , posicion);
	}

	public char getLetter()
	{
		return super.getLetra();
	}

	public void setLetter()
	{
		super.setLetra('L');
	}
}