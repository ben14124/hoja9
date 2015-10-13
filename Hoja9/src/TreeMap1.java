
import java.util.Map;

import java.util.TreeMap;

/*
 * Hoja de Trabajo 9
 * Ma. Belen Hernandez - 14361
 * Daniela Pocasangre - 14162
 * Juan Diego Benitez - 14124
 */

public class TreeMap1 implements WordSet {
    Map<String,Word> treemap;
    
        public TreeMap1(){
            treemap = new TreeMap<String,Word>();
        }
    
    @Override
	public void add(Word wordObject){
            String word = wordObject.getWord();
            treemap.put(word, wordObject); //agrega objeto al arbol
        }
        
    @Override
	public Word get(Word word){
            Word retornando = treemap.get(word.getWord());
            return retornando; //retorna el objeto si se tiene o null
        }
    
}
