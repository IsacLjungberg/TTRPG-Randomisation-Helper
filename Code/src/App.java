

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        MythicTableFormatter formatter = new MythicTableFormatter();

        String[] testArray = {"ord1", "ord2", "ord3", "ord4", "ord5", "ord6", "ord7", "ord8", "ord9"};

        System.out.println(formatter.formatArray(testArray, 3, 3));

        MeaningTableSetSwe meanings = new MeaningTableSetSwe();

        //meanings.generatePairInteractive(MeaningTableSetSwe.Meaning.Karaktär);
        
        //meanings.generatePairInteractive(MeaningTableSetSwe.Meaning.Aktion);

        String[] printedArray = meanings.fetchArray(MeaningTableSetSwe.Meaning.Karaktär);

        System.out.println(formatter.formatArray(printedArray, 5, 20));
        
    }
}
