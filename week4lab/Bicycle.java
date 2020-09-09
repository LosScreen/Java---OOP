class Bicycle {
    // Data Member
    private String ownerName;
    //Constructor: Initialzes the data member
    public Bicycle( ) {
        ownerName = "Unknown";
    }
    
    public Bicycle( String ownerName ) {
        //this.ownerName => Instance Var
        this.ownerName = ownerName;
    }
    
    //Returns the name of this bicycle's owner
    public String getOwnerName( ) {
        return ownerName;
    }
    //Assigns the name of this bicycle's owner
    public void setOwnerName(String name) {
        ownerName = name;
    }
}