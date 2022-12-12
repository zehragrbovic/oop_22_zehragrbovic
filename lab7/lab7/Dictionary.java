import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {

    private HashMap<String, String> dictionary;

    public Dictionary() {
        this.dictionary = new HashMap<>();
    }

    public String translate(String from) {
        if(!dictionary.containsKey(from)) return null;
        return this.dictionary.get(from); 
    }

    public void add(String from, String to) {
        this.dictionary.put(from, to);
    }
    
    public int amountOfWords() {
        int count = 0;
        for(String words : this.dictionary.keySet()) {
            count ++;
        }
        return count;
    }

    public ArrayList<String> translationList() {
        ArrayList<String> lista = new ArrayList<String>();
        
        for(String words : this.dictionary.keySet()) {
            lista.add(words + " = " + dictionary.get(words));
        }

        return lista;
    }
}
