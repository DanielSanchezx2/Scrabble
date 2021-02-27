public class Coordenadas
{
	private int x;
	private int y;

	public Coordenadas(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	public Coordenadas()
	{
		this(0, 0);
	}

	public Coordenadas(Coordenadas c)
	{
		this(c.getX(), c.getY());
	}

	public int getX()
	{
		return this.x;
	}

	public int getY()
	{
		return this.y;
	}

	public void setPosiciones( Coordenadas nueva )
	{
		this.x = nueva.x;
		this.y = nueva.y;
	}

	public void setPosiciones(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	public void agregar(Coordenadas nueva)
	{
		this.x += nueva.getY();
		this.y += nueva.getX();
	}

	public String toString()
	{
		return "(" + this.getX() + "," + this.getY() +")";
	}

	public String formaScrabble()
	{
		String type = "";

		switch(this.x)
		{
			case 0: type += "1"; break;
			case 1: type += "2"; break;
			case 2: type += "3"; break;
			case 3: type += "4"; break;
			case 4: type += "5"; break;
			case 5: type += "6"; break;
			case 6: type += "7"; break;
			case 7: type += "8"; break;
			case 8: type += "9"; break;
			case 9: type += "10"; break;
			case 10: type += "11"; break;
			case 11: type += "12"; break;
			case 12: type += "13"; break;
			case 13: type += "14"; break;
			case 14: type += "15"; break;
			default: type += "-1"; break;
		}

		switch(this.y)
		{
			case 0: type += "A"; break;
			case 1: type += "B"; break;
			case 2: type += "C"; break;
			case 3: type += "D"; break;
			case 4: type += "E"; break;
			case 5: type += "F"; break;
			case 6: type += "G"; break;
			case 7: type += "H"; break;
			case 8: type += "I"; break;
			case 9: type += "J"; break;
			case 10: type += "K"; break;
			case 11: type += "L"; break;
			case 12: type += "M"; break;
			case 13: type += "N"; break;
			case 14: type += "O"; break;
			default: type += "-1"; break;
		}

		return type;
	}
}