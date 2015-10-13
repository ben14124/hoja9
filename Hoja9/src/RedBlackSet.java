/*
 * Hoja de Trabajo 9
 * Ma. Belen Hernandez - 14361
 * Daniela Pocasangre - 14162
 * Juan Diego Benitez - 14124
 */

public class RedBlackSet implements WordSet {
    
    private RedBlackTree<Word> RBTree;
    
    public RedBlackSet(){
        RBTree= new RedBlackTree<Word>();
    }

    @Override
    public void add(Word wordObject) {
        RBTree.insert(wordObject); //agrega objeto al arbol
    }

    @Override
    public Word get(Word word) {
        RedBlackNode<Word> theWord = RBTree.search(word);
        if (theWord == null){
            return null; //retorna null si no esta en el arbol
        }
        Word regresando = theWord.getKey(); //retorna el objeto Word si se tiene en el arbol
        return regresando;
    }
}
