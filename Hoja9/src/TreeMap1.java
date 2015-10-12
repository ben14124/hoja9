
import java.util.Map;

import java.util.TreeMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dbs_jd
 */
public class TreeMap1 implements WordSet {
    Map<String,Word> treemap;
    
        public TreeMap1(){
            treemap = new TreeMap<String,Word>();
        }
    
    @Override
	public void add(Word wordObject){
            String word = wordObject.getWord();
            treemap.put(word, wordObject);
            //System.out.println(wordObject.getWord() + "------" +wordObject.getType());
        }
        
    @Override
	public Word get(Word word){
            Word retornando = treemap.remove(word.getWord());
            return retornando; //retorna el objeto si se tiene o null
        }
    
}
