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
        words = new String[3][];

        //handlingar i allmänhet
        String[] table0 = 
        {"Överge", "Motstå", "Aktivera", "Samtycka","Överaska", "Anlända", "Hjälpa", "Attackera",
        "Uppnå", "Förhandla", "Gynna", "Skänka", "Förråda", "Blockera", "Bryta", "Bära", "Fira", "Förändra", "Försluta",
        "Kombinera", "Kommunicera", "Dölja", "Fortsätta", "Kontrollera", "Skapa", "Bedraga", "Minska", "Försvara",
        "Fördröja", "Förneka", "Avresa", "Placera", "Förstöra", "Disputera", "Misstro", "Splittra", "Tappa", "Släppa",
        "Rymma", "Avslöja", "Misslyckas", "Strida", "Fly", "Frige", "Vägvisa", "Skada", "Hela", "Hindra", "Imitera",
        "Fängsla", "Öka", "Tillfredsställa", "Informera", "Fråga", "Inspektera", "Invadera", "Lämna", "Locka",
        "Missbruka", "Flytta", "Försumma", "Observera", "Öppna", "Bekämpa", "Störta", "Berömma", "Fortskrida", 
        "Beskydda", "Straffa", "Förfölja", "Rekrytera", "Vägra", "Planera", "Avstå", "Reparera", "Avvisa",
        "Återvända", "Belöna", "Förgöra", "Separera", "Börja", "Stoppa", "Kämpa", "Lyckas", "Stödja", "Tysta", "Ta",
        "Hota", "Transformera", "Fånga", "Resa", "Triumfera", "Lita", "Använda", "Usurpera", "Slösa", "Organisera", 
        "Vänta", "Samla", "Frukta"};
        words[0] = table0;
        
        //Beskrivningar på vad som helst egentligen
        String[] table1 = 
        {"Onormal", "Lustig", "Artificiell", "Vacker", "Bisarr", "Tråkig", "Ljus", "Trasig", "Ren", 
        "Kall", "Färgglad", "Tröstande", "Kuslig", "Gullig", "Skadad", "Mörk", "Besegrad", 
        "Smutsig", "Obehaglig", "Torr", "Trög", "Tom", "Enorm", "Extraordinär", "Extravagant", 
        "Urblekt", "Bekant", "Fin", "Svag", "Högtidlig", "Felfri", "Övergiven", "Ömtålig", 
        "Väldoftande", "Färsk", "Full", "Ärorik", "Graciös", "Hård", "Sträng", "Frisk", "Tung", 
        "Historisk", "Horribel", "Viktig", "Intressant", "Omogen", "Bristande", "Stor", 
        "Överflödig", "Mager", "Mindre", "Livsfarlig", "Livlig", "Älskvärd", "Magnifik", "Mogen", 
        "Stökig", "Mäktig", "Militär", "Modern", "Alldaglig", "Mystisk", "Naturlig", "Normal", 
        "Underlig", "Gammal", "Blek", "Fredlig", "Liten", "Enkel", "Fattig", "Kraftfull", 
        "Beskyddande", "Gammalmodig", "Ovanlig", "Betryggande", "Otrolig", "Rutten", "Grov", 
        "Förstörd", "Lantlig", "Skräckinjagande", "Chockerande", "Simpel", "Större", "Slät", 
        "Mjuk", "Stark", "Stilig", "Otrevlig", "Värdefull", "Lysande", "Varm", "Vattnig", "Vek", 
        "Ung", "Hopplös", "Fridfull", "Tyst"};
        words[1] = table1;

        //användningar som för att beskriva en karaktärs uppenbara drag eller hitta på en
        //ny karaktär spontant
        String[] table2 = 
        {"Förföljd", "Aktiv", "Aggresiv", "Bakhåll", "Djur", "Orolig", "Beväpnad", "Vacker", 
        "Djärv", "Upptagen", "Lugn", "Oförsiktig", "Ledig", "Försiktig", "Högklassig",
        "Färgglad", "Stridslysten", "Galen", "Kuslig", "Nyfiken", "Farlig", "Lögnaktig", 
        "Besegrad", "Tråtsig", "Härlig", "Känslosam", "Energetisk", "Utrustad", "Exalterad", 
        "Förväntad", "Bekant", "Snabb", "Svag", "Våldsam", "Fiende", "Dåraktig", "Tursam", 
        "Väldoftande", "Hektisk", "Vän", "Rädd", "Skräckinjagande", "Generös", "Glad", 
        "Skadlig", "Hjälpsam", "Hjälplös", "Viktig", "Inaktiv", "Influensiell", "Oskyldig", 
        "Intensiv", "Kunnig", "Stör", "Ensam", "Högljudd", "Lojal", "Mäktig", "Miserabel", 
        "Flera", "Alldaglig", "Mystisk", "Naturlig", "Underlig", "Officiell", "Gammal", 
        "Passiv", "Fredlig", "Lekfull", "Kraftfull", "Professionell", "Skyddad", 
        "Beskyddande", "Ifrågasättande", "Tystlåten", "betryggande", "Fyndig", "Sökande", 
        "Skicklig", "Långsam", "Liten", "Smygande", "Konstig", "Stark", "Lång", "Tjuvande", 
        "Hotfull", "Triumferande", "Oväntad", "Onnaturlig", "Ovanlig", "Våldsam",
        "Frispråkig", "Vek", "Vild", "Ung", "Brecklig", "Feg", "Esoterisk", "Åtrovärd"};
        words[2] = table2;
    }

    public String[] fetchArray(Meaning m){
        int n = meaningToInt(m);
        return words[n];
    }

    enum Meaning {
        Aktion, Beskrivning, Karaktär
    }

    public int meaningToInt(Meaning m){
        switch(m){
            case Aktion:
                return 0;
            case Beskrivning:
                return 1;
            case Karaktär:
                return 2;
            default:
                throw new NoSuchElementException();
        }
    }
}
