package be.abis.ch03javaconfig.model;

public class Coffee {

    private String flavour;

    public Coffee(String flavour) {
        this.flavour = flavour;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }
}
