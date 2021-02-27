import java.util.*;

public class Tablero
{
	private int f, c;//Filas y columnas en base al tablero 16x16
	private String[][] tab;
	private String dibujarTab;
	private ArrayList<Bonos> bonos;

	public Tablero(int f, int c)
	{
		this.tab = new String [f][c];
		this.f = f;
		this.c = c;

		bonos = new ArrayList<Bonos>();

		//W1
		bonos.add(new W1(Uso.SIN_USAR, new Coordenadas(1,1)));
		bonos.add(new W1(Uso.SIN_USAR, new Coordenadas(1,15)));
		bonos.add(new W1(Uso.SIN_USAR, new Coordenadas(15,1)));
		bonos.add(new W1(Uso.SIN_USAR, new Coordenadas(15,15)));
		bonos.add(new W1(Uso.SIN_USAR, new Coordenadas(1,8)));
		bonos.add(new W1(Uso.SIN_USAR, new Coordenadas(8,15)));
		bonos.add(new W1(Uso.SIN_USAR, new Coordenadas(15,8)));
		bonos.add(new W1(Uso.SIN_USAR, new Coordenadas(8,1)));

		//W2
		bonos.add(new W2(Uso.SIN_USAR, new Coordenadas(2,2)));
		bonos.add(new W2(Uso.SIN_USAR, new Coordenadas(3,3)));
		bonos.add(new W2(Uso.SIN_USAR, new Coordenadas(4,4)));
		bonos.add(new W2(Uso.SIN_USAR, new Coordenadas(5,5)));
		bonos.add(new W2(Uso.SIN_USAR, new Coordenadas(2,14)));
		bonos.add(new W2(Uso.SIN_USAR, new Coordenadas(3,13)));
		bonos.add(new W2(Uso.SIN_USAR, new Coordenadas(4,12)));
		bonos.add(new W2(Uso.SIN_USAR, new Coordenadas(5,11)));
		bonos.add(new W2(Uso.SIN_USAR, new Coordenadas(14,2)));
		bonos.add(new W2(Uso.SIN_USAR, new Coordenadas(13,3)));
		bonos.add(new W2(Uso.SIN_USAR, new Coordenadas(12,4)));
		bonos.add(new W2(Uso.SIN_USAR, new Coordenadas(11,5)));
		bonos.add(new W2(Uso.SIN_USAR, new Coordenadas(14,14)));
		bonos.add(new W2(Uso.SIN_USAR, new Coordenadas(13,13)));
		bonos.add(new W2(Uso.SIN_USAR, new Coordenadas(12,12)));
		bonos.add(new W2(Uso.SIN_USAR, new Coordenadas(11,11)));

		//L1
		bonos.add(new L1(Uso.SIN_USAR, new Coordenadas(2,6)));
		bonos.add(new L1(Uso.SIN_USAR, new Coordenadas(2,10)));
		bonos.add(new L1(Uso.SIN_USAR, new Coordenadas(6,6)));
		bonos.add(new L1(Uso.SIN_USAR, new Coordenadas(6,10)));
		bonos.add(new L1(Uso.SIN_USAR, new Coordenadas(10,6)));
		bonos.add(new L1(Uso.SIN_USAR, new Coordenadas(10,10)));
		bonos.add(new L1(Uso.SIN_USAR, new Coordenadas(14,6)));
		bonos.add(new L1(Uso.SIN_USAR, new Coordenadas(14,10)));
		bonos.add(new L1(Uso.SIN_USAR, new Coordenadas(6,2)));
		bonos.add(new L1(Uso.SIN_USAR, new Coordenadas(10,2)));
		bonos.add(new L1(Uso.SIN_USAR, new Coordenadas(10,14)));
		bonos.add(new L1(Uso.SIN_USAR, new Coordenadas(6,14)));

		//L2
		bonos.add(new L2(Uso.SIN_USAR, new Coordenadas(1,4)));
		bonos.add(new L2(Uso.SIN_USAR, new Coordenadas(1,12)));
		bonos.add(new L2(Uso.SIN_USAR, new Coordenadas(3,7)));
		bonos.add(new L2(Uso.SIN_USAR, new Coordenadas(3,9)));
		bonos.add(new L2(Uso.SIN_USAR, new Coordenadas(4,1)));
		bonos.add(new L2(Uso.SIN_USAR, new Coordenadas(4,8)));
		bonos.add(new L2(Uso.SIN_USAR, new Coordenadas(4,15)));
		bonos.add(new L2(Uso.SIN_USAR, new Coordenadas(7,3)));
		bonos.add(new L2(Uso.SIN_USAR, new Coordenadas(7,7)));
		bonos.add(new L2(Uso.SIN_USAR, new Coordenadas(7,9)));
		bonos.add(new L2(Uso.SIN_USAR, new Coordenadas(7,13)));
		bonos.add(new L2(Uso.SIN_USAR, new Coordenadas(8,4)));
		bonos.add(new L2(Uso.SIN_USAR, new Coordenadas(8,12)));
		bonos.add(new L2(Uso.SIN_USAR, new Coordenadas(9,3)));
		bonos.add(new L2(Uso.SIN_USAR, new Coordenadas(9,7)));
		bonos.add(new L2(Uso.SIN_USAR, new Coordenadas(9,9)));
		bonos.add(new L2(Uso.SIN_USAR, new Coordenadas(9,13)));
		bonos.add(new L2(Uso.SIN_USAR, new Coordenadas(12,1)));
		bonos.add(new L2(Uso.SIN_USAR, new Coordenadas(12,8)));
		bonos.add(new L2(Uso.SIN_USAR, new Coordenadas(12,15)));
		bonos.add(new L2(Uso.SIN_USAR, new Coordenadas(13,7)));
		bonos.add(new L2(Uso.SIN_USAR, new Coordenadas(15,9)));
		bonos.add(new L2(Uso.SIN_USAR, new Coordenadas(15,4)));
		bonos.add(new L2(Uso.SIN_USAR, new Coordenadas(15,12)));
	} 

	public int getF()
	{
		return this.f;
	} 

	public int getC()
	{
		return this.c;
	}

	public void setBono(String a, int f, int c)
	{
		this.tab[f][c] = a;
	}

	public String getPosition(int f, int c)
	{
		return this.tab[f][c];
	}

	public String tabDib()
	{
		this.dibujarTab = "";
		int tamTab = 0;
		Coordenadas posicionAct;

		System.out.println(" ");

		for(int y = 0; y<15 ; y++)
		{
			this.dibujarTab += String.valueOf(1+y) + "\t";
			for(int x = 0; x<15; x++)
			{
				tamTab = this.dibujarTab.length();
				posicionAct = new Coordenadas(x, y);

				if(tamTab == this.dibujarTab.length())
				{
					this.dibujarTab += "* "; 
				}
			}
			this.dibujarTab += '\n';
		}
		this.dibujarTab += "\n\tA B C D E F G H I J K L M N O";

		return this.dibujarTab;
	}

	/*public void figurasTab()
	{
		for(int i = 0; i < bonos.size(); i++)
			bonos.get(i).setLetraArr();
	}

		public void figurasLet()
	{
		for(int i = 0; i < bonos.size(); i++)
			bonos.get(i).setLetraArr2();
	}*/


}