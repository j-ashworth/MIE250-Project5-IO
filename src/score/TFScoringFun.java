package score;

import index.Index;

public class TFScoringFun implements TermScoringFun {

	@Override
	public void init(Index s) {
		// Do nothing here for TF... no need to compute IDF so no need to keep track of the Index.
		// Note that for TFIDF, the Index gives you access to the document frequency of any term!
	}

	@Override
	public double scoreToken(String term, int freq) {
		return (double)freq; // Ignore term since not looking at IDF
	}

}
