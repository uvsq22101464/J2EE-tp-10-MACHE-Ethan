package amis;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext monContext = new AnnotationConfigApplicationContext();
		monContext.scan("amis");
		monContext.refresh();
		//ServiceCustomer servCus = (ServiceCustomer)
		//Region region = monContext.getBean(Region.class);
		//Ville ville = new Ville();
		//ville.setNom("Bordeaux");
		//region.setCapitalRegion(ville);
		//region.Affiche();
	}
	
}
