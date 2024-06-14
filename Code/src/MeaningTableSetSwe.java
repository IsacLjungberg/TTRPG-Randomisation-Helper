import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;

public class MeaningTableSetSwe {
    String[][] words;
    Random rand = new Random();

    public String generatePair(Meaning m){
        int n = meaningToInt(m);

        String out = words[n][rand.nextInt(words.length)];
        out += ", " + words[n][rand.nextInt(words.length)];
        return out;
    }
    

    public void generatePairInteractive(Meaning m){
        Scanner scnr = new Scanner(System.in);
        while(true){
            System.out.println(generatePair(m));
            String input = scnr.nextLine();
            if(input.equals("r")){
                continue;
            } else {
                //scnr.close();
                break;
            }
        }
    }

    public MeaningTableSetSwe(){
        words = new String[2][];
        String[] table0 = {"ord1", "ord2", "ord3"};
        words[0] = table0;
        String[] table1 = {"ord4", "ord5", "ord6"};
        words[1] = table1;
    }

    enum Meaning {
        Aktion, Karaktär
    }

    public int meaningToInt(Meaning m){
        switch(m){
            case Aktion:
                return 0;
            case Karaktär:
                return 1;
            default:
                throw new NoSuchElementException();
        }
    }
}
