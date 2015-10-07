/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dbs_jd
 */
public class TreeMap implements WordSet {
    
    TreeMap treemap;
        public TreeMap(){
            TreeMap treemap = new TreeMap();
        }
    
	public void add(Word wordObject){
            treemap.put(wordObject);
        }
	public Word get(Word word){
            return treemap.remove(word);
        }
    
}
