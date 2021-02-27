import java.util.Scanner;

public class Players
{

    protected String namePlayer;

    public void getPlayer()
    {
       Scanner sc = new Scanner( System.in );
            
       System.out.println("-> INGRESA EL NOMBRE DEL JUGADOR: ");
       String name = sc.nextLine();

       setName( name );
    }

    @Override
    public String toString()
    {
        return("Jugador: "+ getName());
    }

    public void setName( String name ){ 
        namePlayer = name;
    }
    public String getName(){ 
        return namePlayer;
    }
}

