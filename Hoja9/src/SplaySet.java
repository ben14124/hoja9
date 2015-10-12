/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ma. Belen
 */
public class SplaySet extends SplayBST implements WordSet{
    
    private SplayBST<String,Word> splayTree;
    
    public SplaySet(){
        splayTree= new SplayBST<String,Word>();
    }

    @Override
    public void add(Word wordObject) {
        String word = wordObject.getWord();       
        splayTree.put(word, wordObject);
    }

    @Override
    public Word get(Word word) {
        Word retornando = splayTree.get(word.getWord());
        return retornando; //retorna el objeto si se tiene o null
    }
    
}
