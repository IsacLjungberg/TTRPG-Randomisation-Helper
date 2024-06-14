public class MythicTableFormatter {
    //Designed to take arrays and turn them into mythic style meaning tables in obsidian syntax  form
    public MythicTableFormatter(){

    }

    public String FormatArray(String[] array, int columnsNum, int rowsNum){
        if(array.length <= columnsNum * rowsNum){
            String table = "";

            for(int n = 0; n < rowsNum; n++){
                table += "|         ";
            }
            table += "|\n";

            for(int n = 0; n < rowsNum; n++){
                table += "| ------- ";
            }
            table += "|\n";

            for(int n = 0; n < rowsNum; n++){
                String currentRowString = "";
                for(int i = 0; i < columnsNum; i++){
                    String entryToAdd;
                    try{
                        entryToAdd = array[n + rowsNum * i];
                    } catch (IndexOutOfBoundsException e){
                        entryToAdd = "";
                    }
                    currentRowString = currentRowString + "| " + (n + rowsNum * i + 1) + ": " + entryToAdd;
                }
                table = table + currentRowString + " |\n";
            }
            return table;
        } else {
            return "Too many entries";
        }
    }
}
