package Composition2;

/**
 * Created by Petko-PC on 2/20/2017.
 */
public class Clothes {

    private String tShirts;
    private String pullOvers;
    private String jeans;

    public Clothes(String tShirts, String pullOvers, String jeans) {
        this.tShirts = tShirts;
        this.pullOvers = pullOvers;
        this.jeans = jeans;
    }

    public String gettShirts() {
        return tShirts;
    }

    public String getPullOvers() {
        return pullOvers;
    }

    public String getJeans() {
        return jeans;
    }
}
