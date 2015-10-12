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
    
    private SplayBST splayTree;
    
    public SplaySet(){
        splayTree= new SplayBST();
    }

    @Override
    public void add(Word wordObject) {
        splayTree.put(wordObject.getWord(), wordObject.getType());
    }

    @Override
    public Word get(Word word) {
        Word myWord = new Word(word.getWord(), splayTree.get(word.getWord()).toString());
        return myWord;
    }
    
}
