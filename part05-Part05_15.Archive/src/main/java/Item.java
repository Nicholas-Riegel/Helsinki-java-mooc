public class Item {

    private String identifier;
    private String name;

    public Item(String identifier, String name){
        this.identifier = identifier;
        this.name = name;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj){
        
        if (this == obj){
            return true;
        }

        if (!(obj instanceof Item)){
            return false;
        }

        Item otherItem = (Item) obj;
        if (this.identifier.equals(otherItem.identifier)){
            return true;
        }

        return false;
    }

}
