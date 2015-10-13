/*
 * Hoja de Trabajo 9
 * Ma. Belen Hernandez - 14361
 * Daniela Pocasangre - 14162
 * Juan Diego Benitez - 14124
 */

public class SplaySet extends SplayBST implements WordSet{
    
    private SplayBST<String,Word> splayTree;
    
    public SplaySet(){
        splayTree= new SplayBST<String,Word>();
    }

    @Override
    public void add(Word wordObject) {
        String word = wordObject.getWord();       
        splayTree.put(word, wordObject); //key - palabra / value - objeto
    }

    @Override
    public Word get(Word word) {
        Word retornando = splayTree.get(word.getWord());
        return retornando; //retorna el objeto si se tiene o null
    }
    
}
