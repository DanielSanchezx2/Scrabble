import java.util.*;

public class Main
{
    public static void main( String[] args )
    {   
        Fichas unoF = new Fichas();
        Fichas dosF = new Fichas();
        Players unoP = new Players();
        Players dosP = new Players();
        
        Scanner sc = new Scanner(System.in);        
        int opcion=0, op1=0, op2=0;
        String iniciar;
        unoP.getPlayer();
        unoF.asignarFichas();       
        System.out.println(unoP.toString() +"\n"+ unoF.toString());
        dosP.getPlayer();
        dosF.asignarFichas();
        System.out.println(dosP.toString() +"\n"+ dosF.toString());     
        
        System.out.println("¿Deseas iniciar el juego? S/N");
        iniciar=sc.nextLine();
        while(iniciar.charAt(0) =='S' || iniciar.charAt(0) =='s'){
            System.out.println("\n"+unoP.toString());
            System.out.println("¿Qué deseas hacer? 1.Saltar turno  2.Cambiar fichas  3.Ingresar palabra");
            opcion = sc.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Saltar turno");
                    break;
                case 2:
                    System.out.println("Cambiar fichas");
                    unoF.asignarFichas(); 
                    System.out.println(unoF.toString());
                    break;
                case 3:
                    System.out.println("Ingresar palabra");
                    break;
                default:
                    System.out.println("No fue una opción válida. Pierdes turno");
            }
            
            System.out.println("\n"+dosP.toString());
            System.out.println("¿Qué deseas hacer? 1.Saltar turno  2.Cambiar fichas  3.Ingresar palabra");
            opcion = sc.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Saltar turno");
                    break;
                case 2:
                    System.out.println("Cambiar fichas");
                    dosF.asignarFichas();   
                    System.out.println(dosF.toString());
                    break;
                case 3:
                    System.out.println("Ingresar palabra");
                    break;
                default:
                    System.out.println("No fue una opción válida. Pierdes turno");
            }
            iniciar="";
            System.out.println("¿Deseas seguir el juego? 1-Si  2-No");
            op1=sc.nextInt();
            if(op1==1){iniciar="s";}else{iniciar="n";}
        }
    }
}
