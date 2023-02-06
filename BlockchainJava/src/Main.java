import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
         List<Block> blockchainList = new ArrayList<>();

         Block genesis = new Block("Blockchain", 0);
         blockchainList.add(genesis);

         Block blockX = new Block("This is Block X", blockchainList.get(blockchainList.size() - 1).hashCode());
         blockchainList.add(blockX);

         Block blockY = new Block("This is Block Y", blockchainList.get(blockchainList.size() - 1).hashCode());
         blockchainList.add(blockY);

         Block blockZ = new Block("This is Block Z", blockchainList.get(blockchainList.size() - 1).hashCode());
         blockchainList.add(blockZ);

         Block blockW = new Block("This is Block W", blockchainList.get(blockchainList.size() - 1).hashCode());
         blockchainList.add(blockW);

         System.out.println(" $€₽£₪$€₽£₪$€₽£₪$€₽£₪ ");
         System.out.println(" I've created a simple Blockchain ");
         System.out.println(" $€₽£₪$€₽£₪$€₽£₪$€₽£₪ ");

         blockchainList.forEach(System.out::println);

         System.out.println(" $€₽£₪$€₽£₪$€₽£₪$€₽£₪ ");
    }
}