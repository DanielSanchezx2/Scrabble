import java.util.*;

public class Fichas
{
    protected char[] fichasRep={'a','a','a','a','a','a','a','a','a','b','b','c','c','d','d','d','d','e','e','e','e','e','e','e','e','e',
                                'e','e','e','f','f','h','h','i','i','i','i','i','i','i','i','i','j','k','l','l','l','l','m','m','n','n',
                                'n','n','n','n','o','o','o','o','o','o','o','o','p','p','q','r','r','r','r','r','r','s','s','s','s','t',
                                't','t','t','t','t','u','u','u','u','v','v','w','w','x','y','y','z'};
    
    protected int numList = fichasRep.length;
    protected char[] repPlayer = new char[7];

    public void asignarFichas()
    {
        char[] num1 = new char[7];  
        Random r = new Random();    
        
        for (int i=0; i < 7 ; i++){
            num1[i] = fichasRep[r.nextInt(getNumlist())];
        }

        setrepPlayer(num1);
    }

    @Override
    public String toString()
    {
        return("Tus fichas son: "+ String.valueOf(getrepPlayer()));
    }

    public void setrepPlayer( char[] a ){ 
        repPlayer = a; 
    }
    public char[] getrepPlayer(){ 
        return repPlayer; 
    }
    public int getNumlist(){ 
        return numList; 
    }
}