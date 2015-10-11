
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
    Map<String,String> treemap;
    
        public TreeMap1(){
            treemap = new TreeMap<String,String>();
        }
    
    @Override
	public void add(Word wordObject){
            String word = wordObject.getWord();
            String type = wordObject.getType();
            //System.out.println(word);
            System.out.println(treemap.put(word, type));
            //treemap.put(word, type);
            //System.out.println(wordObject.getWord() + "------" +wordObject.getType());
        }
        
    @Override
	public Word get(Word word){
            treemap.remove(word.getWord());
            //System.out.println(treemap.remove(word.getWord()));
            return word;
        }
    
}
