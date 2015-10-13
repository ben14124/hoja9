
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/*
 * Hoja de Trabajo 9
 * Ma. Belen Hernandez - 14361
 * Daniela Pocasangre - 14162
 * Juan Diego Benitez - 14124
 */

public class HashTable implements WordSet{

    Map<String,Word> hashmap;
    
        public HashTable(){
            hashmap = new HashMap<String,Word>();
        }
    
    @Override
	public void add(Word wordObject){
            String word = wordObject.getWord();
            hashmap.put(word, wordObject); //key - palabra / value - objeto
        }
        
    @Override
	public Word get(Word word){
            Word retornando = hashmap.get(word.getWord());
            return retornando; //retorna el objeto si se tiene o null
        }
    
}
