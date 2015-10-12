/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ma. Belen
 */
public class RedBlackSet implements WordSet {
    
    private RedBlackTree<Word> RBTree;
    
    public RedBlackSet(){
        RBTree= new RedBlackTree<Word>();
    }

    @Override
    public void add(Word wordObject) {
        RBTree.insert(wordObject);
    }

    @Override
    public Word get(Word word) {
        RedBlackNode<Word> theWord = RBTree.search(word);
        if (theWord == null){
            return null;
        }
        Word regresando = theWord.getKey();
        return regresando;
    }
}
