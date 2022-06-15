import java.util.ArrayList;
import java.util.List;

public class Pagrindine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		TransportoPriemone priemone = new TransportoPriemone("Laivas", 1965);
//		
		MotorineTransportoPriemone keturratis = new MotorineTransportoPriemone("keturratis", 2014, 0.500);
		
		OroTransportoPriemone lektuvas = new OroTransportoPriemone("Lektuvas", 2006, 1000.0, 8);
		
		priemone.spausdink();
		
		keturratis.spausdink();
		
		lektuvas.spausdink();
		
		
		
		Vaisius vaisius = new Vaisius("Vaisius");
		LietuviskasVaisius lietuviskasVaisius = new LietuviskasVaisius("Lietuviskas vaisius");
		Kriause kriause = new Kriause("Kriause");
		Obuolys obuolys = new Obuolys("Obuolys");
		Alyvinis alyvinis = new Alyvinis("Alyvinis");
		Antaninis antaninis = new Antaninis("Antaninis");
		
		vaisius.kasAsEsu();
		lietuviskasVaisius.kasAsEsu();
		kriause.kasAsEsu();
		obuolys.kasAsEsu();
		alyvinis.kasAsEsu();
		antaninis.kasAsEsu();
		
		
		EgzotinisVaisius egzotinisVaisius = new EgzotinisVaisius("Egzotinis vaisius", "geltonas");
		Mangas mangas = new Mangas("Mangas", "geltona");
		Ananasas ananasas = new Ananasas("Ananasas", "geltona");
		
		egzotinisVaisius.kasAsEsu();
		mangas.kasAsEsu();
		ananasas.kasAsEsu();
		
		System.out.println("------------------------------------------------");
		
		antaninis.kaPaveldziu();
		

		
		boolean arKlasesObjektas = obuolys instanceof Vaisius;
		boolean arKlasesObjektas2 = obuolys instanceof Antaninis;
		boolean arKlasesObjektas3 = obuolys instanceof Obuolys;
		
		System.out.println(arKlasesObjektas);
		System.out.println(arKlasesObjektas2);
		System.out.println(arKlasesObjektas3);
		
		LietuviskasVaisius lietuviskasObuolys = (LietuviskasVaisius)obuolys;
		
		Obuolys lietuviskasVaisiusObuolys = (Obuolys)lietuviskasVaisius;
		
		
		
		
	}

}
