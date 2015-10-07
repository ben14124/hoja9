
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
    TreeMap treemap;
    static int contador = 0;
        public TreeMap1(){
            treemap = new TreeMap();
        }
    
	public void add(Word wordObject){
            treemap.put(contador, wordObject);
            contador++;
        }
	public Word get(Word word){
            Word palabra = (Word) treemap.get(1);
           treemap.remove(1);
            return palabra;
        }
    
}
