package métier;

import exceptions.RetourException;

public class Livre extends DocumentAbstrait {
	
	private int nbPages; 
	
	public Livre(String id, String titre, int nbPages) {
	    super(id, titre);
	    this.nbPages = nbPages;
	}
	
	
	
		// exception si déjà réservé ou emprunté
		public void reservation (Abonne ab) throws ReservationException{
			
		}
		// exception si réservé pour une autre abonné ou déjà emprunté
		public void emprunt(Abonne ab) throws EmpruntException {
			
		}
		
		// sert au retour d’un document ou à l’annulation d‘une réservation
		public void retour() throws RetourException {
			
		}

}
