package test;

import java.util.ArrayList;

import index.DocScore;
import index.Index;
import tokenizer.SimpleTokenizer;
import tokenizer.Tokenizer;

/** A file to help you start testing.
 * 
 * Note that because classes are being used that have the same name but different
 * packages, we are not importing some classes, but rather referring to them by
 * their fully qualified package names to avoid ambiguity in whether the soln
 * or your packages are being used.
 * 
 * @author ssanner@mie.utoronto.ca
 *
 */
public class TestSearch {

	// Test the above code
	public static void main(String[] args) {

		// Test tokenizer
		Tokenizer tok = new SimpleTokenizer();
		//System.out.println("\nTokenize results: " + tok.tokenize("SoftBank is buying a chunk of Uber and it's state-of-the-art Taxi-hailing system for $10 billion"));
		
		// Build a simple search index with the basic classes given
		//TestIndex(new index.InvertedIndex(new io.StaticDocSource(), 
				  //							   new tokenizer.SimpleTokenizer(), 
		//		  							   new score.TFScoringFun()));
		
		// TODO: Here is the solution implementation of all classes -- you will need to unzip the files
		//       provided on Blackboard and provide the correct path as the argument to FileDocSource.
		TestIndex(new soln.index.InvertedIndex(new soln.io.FileDocSource("/Users/JulianAshworth/Desktop/Part1/awards_1990"), 
											   new soln.tokenizer.IndexingTokenizer(), 
											   new soln.score.TFIDFScoringFun()));

		// TODO: Here is the same test with the implementation you are providing that should match the above soln.
		//       (Do not rename classes... modulo the issue that you might store your files in a different
		//        directory which can change, the following code should otherwise work when uncommented once
		//        your project is complete.)
		TestIndex(new index.InvertedIndex(new io.FileDocSource("/Users/JulianAshworth/Desktop/Part1/awards_1990"), 
				                          new tokenizer.IndexingTokenizer(), 
										  new score.TFIDFScoringFun()));
	}

	public static void TestIndex(Index s) {
		
		// Build the search index
		long ms_start = System.currentTimeMillis();
		s.buildIndex();
		long ms_end = System.currentTimeMillis();
		System.out.println("\n>> Built " + s.getClass() + " index in " + (ms_end - ms_start) + " ms.");
		
		//System.out.println("\n>> Index contents: " + s);
		
		// Do a few queries
		ms_start = System.currentTimeMillis();
		//DoSearch(s, "computer equipment");
		//DoSearch(s, "and");
		DoSearch(s, "experimental procedure");
		//DoSearch(s, "at to of by");
		ms_end = System.currentTimeMillis();
		System.out.println("\n>> Completed searches in " + (ms_end - ms_start) + " ms.");
		System.out.flush(); // If doing a lot of printing, flush the buffer so we don't wait for output
	}

	// Simple search helper method
	public static void DoSearch(Index s, String query) {
		
		System.out.println("\n>> Query: '" + query + "'");
		
		ArrayList<DocScore> doc_scores = s.getSortedSearchResults(query);
		
		for (int i = 0; i < doc_scores.size(); i++)
			System.out.println("[Rank " + (i+1) + "]:" + doc_scores.get(i));
	}
}
