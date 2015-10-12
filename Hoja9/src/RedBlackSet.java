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
    
    private RedBlackTree RBTree;
    
    public RedBlackSet(){
        RBTree= new RedBlackTree();
    }

    @Override
    public void add(Word wordObject) {
        RBTree.insert(wordObject);
    }

    @Override
    public Word get(Word word) {
        String theWord;
        theWord = RBTree.search(word).toString();
        if (theWord == null) return null;
        String wordParts[];
        wordParts= theWord.split("\\.");
        Word myWord = new Word(wordParts[0].trim(), wordParts[1].trim());
        return myWord;
    }
}
