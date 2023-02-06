import java.util.Arrays;

public class Block {
    private int previousHash;
    private String data;
    private int hash;

    public Block(String data, int previousHash) {
        this.data = data;
        this.previousHash = previousHash;

        //creating the blockchain
        this.hash = Arrays.hashCode(new Integer[] {data.hashCode(), previousHash});

    }
}
