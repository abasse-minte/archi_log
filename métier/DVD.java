package métier;

import exceptions.RetourException;

public class DVD extends DocumentAbstrait {
	
	private boolean adulte; 
	
	public DVD(String id, String titre, boolean adulte) {
	    super(id, titre);
	    this.adulte = adulte;
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
