
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniela
 */
public class HashTable implements WordSet{

    Map<String,Word> hashmap;
    
        public HashTable(){
            hashmap = new HashMap<String,Word>();
        }
    
    @Override
	public void add(Word wordObject){
            String word = wordObject.getWord();
            hashmap.put(word, wordObject);
            //System.out.println(wordObject.getWord() + "------" +wordObject.getType());
        }
        
    @Override
	public Word get(Word word){
            Word retornando = hashmap.get(word.getWord());
            return retornando; //retorna el objeto si se tiene o null
        }
    
}
