
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
public class HashTable1 implements WordSet{

    Map<String,String> hashmap;
    
        public HashTable1(){
            hashmap = new HashMap<String,String>();
        }
    
    @Override
	public void add(Word wordObject){
            String word = wordObject.getWord();
            String type = wordObject.getType();
            //System.out.println(word);
            System.out.println(hashmap.put(word, type));
            //treemap.put(word, type);
            //System.out.println(wordObject.getWord() + "------" +wordObject.getType());
        }
        
    @Override
	public Word get(Word word){
            hashmap.remove(word.getWord());
            //System.out.println(treemap.remove(word.getWord()));
            return word;
        }
    
}
