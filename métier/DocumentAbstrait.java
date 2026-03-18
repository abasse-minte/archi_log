package métier;

public abstract class DocumentAbstrait implements Document {
	private String id;
    private String titre;
    // attributs communs à tous les documents

    public DocumentAbstrait(String id, String titre) {
        this.id = id;
        this.titre = titre;
    }

    @Override
    public String idDoc() { 
    	return id; 
    }

    public String getId() {
    	return this.id; 
    }
    
    public String getTitre() {
    	return this.titre; 
    }
}
