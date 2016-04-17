package poem_generator;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import edu.mit.jwi.Dictionary;
import edu.mit.jwi.IDictionary;
import edu.mit.jwi.item.ISynset;

import poem_generator.Poem_Generator;
import poem_generator.Corpus;
import poem_generator.WordNet_Wrapper;

/* -Class for generating poems
 * -Interacts with Poem_Generator, which has dependencies on Corpus and WordNet_Wrapper
 * -Poem_Generator, Corpus and WordNet_Wrapper are implemented as singletons with eager 
 *  initialization, which is convenient for a small project like this where a singleton 
 *  would have few negative implications. 
 */

public class Poem_Generator_Demo {
	/* -Currently just a test program for the wrapper class
	 */
	public static void main(String[] args) throws IOException{
		Poem_Generator generator = Poem_Generator.getInstance();
		
		//initialise word tools
		WordNet_Wrapper dict = WordNet_Wrapper.getInstance();
	    
		String word = "dogs";
		String wordStem = dict.getWordStem(word, false);
		
	    dict.getDefinition(wordStem);
	    
	    ISynset synset = dict.getSynonyms(wordStem);
	    //dict.printSynonyms(synset);
	    
	    ArrayList<String> rhyming_words = dict.getRhymingWords(wordStem);
        //dict.printRhymingWords(rhyming_words);
	    
	    //dict.getRelationTriples("Obama was born in Hawaii. He is our president.");
	    
	}
}