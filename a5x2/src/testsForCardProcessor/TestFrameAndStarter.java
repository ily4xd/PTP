// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package testsForCardProcessor;


import static cards.Card.Constant.*;
//
import cards.*;
import cardProcessor.CardProcessor;
import java.util.*;
import stuffBeginnersDontHaveToUnderstand.EnvironmentAnalyzer;
import stuffBeginnersDontHaveToUnderstand.GivenCodeVersion;
import stuffBeginnersDontHaveToUnderstand.Version;


/**
 * Die Klasse {@link TestFrameAndStarter} testet die Lösung zur Aufgabe "remove duplicates" - siehe Aufgabenstellung.
 * 
 * @author  Michael Schaefers  ([UTF-8]:"Michael Schäfers");
 *          P1@Hamburg-UAS.eu 
 * @version {@value #encodedVersion} 
 */
public class TestFrameAndStarter {
	//
	//--VERSION:-------------------------------#---vvvvvvvvv---vvvv-vv-vv--vv
	//  ========                               #___~version~___YYYY_MM_DD__dd_
	final static private long encodedVersion = 2___00002_002___2023_05_19__01L;
	//-----------------------------------------#---^^^^^-^^^---^^^^-^^-^^--^^
	final static private Version version = new Version( encodedVersion );
	static public String getDecodedVersion(){ return version.getDecodedVersion(); }
	// Obiges (ab VERSION) dient nur der Versionierung





	/**
	 * Die Methode {@link #main() testet die Lösung zur Aufgabe "remove duplicates" - siehe Aufgabenstellung.
	 * Diese Methode darf bis zur "Markierung" NICHT geändert werden
	 * außer, dass Sie "den Kommentar vor den letzten Statements" entfernen müssen.
	 * Wohl aber dürfen Sie am Ende/nach der Markierung eigene Tests ergänzen.
	 * 
	 * @param unused wird nicht genutzt, aber "von Java eingefordert".
	 */
	public static void main( final String... unused ) {

		// print some information at start
		System.out.printf( "TestFrame information\n" );
		System.out.printf( "=====================\n" );
		System.out.printf( "\n" );
		//
		System.out.printf( "Release:\n" );
		System.out.printf( "    GivenCode version:      %s\n",  GivenCodeVersion.getDecodedVersion() );
		System.out.printf( "    Card version:           %s\n",  Card.getDecodedVersion() );
		System.out.printf( "    Deck version:           %s\n",  Deck.getDecodedVersion() );
		System.out.printf( "\n" );
		//
		System.out.printf( "Environment:\n" );
		System.out.printf( "    #Cores:                 %d\n",  EnvironmentAnalyzer.getAvailableCores() );
		System.out.printf( "    Java:                   %s\n",  EnvironmentAnalyzer.getJavaVersion() );
		System.out.printf( "    assert enabled?:        %s\n",  EnvironmentAnalyzer.isAssertEnabled() );
		System.out.printf( "    UTF-8 configured?:      %s      <- check output\n",  "[ÄËÏÖÜẞäëïöüß␣🙂😉🙁😟😓😎☠]" );
		System.out.printf( "\n\n\n\n" );
		//
		System.out.printf( "Start of actual demo\n" );
		System.out.printf( "vvvvvvvvvvvvvvvvvvvv\n" );
		System.out.printf( "\n\n" );
		//
		System.out.flush();





		// Anfang des eigentlichen Tests
		//==============================

		final Card[] testCase = { CJ, DJ, DJ, C9, HQ, D2, HQ };
		System.out.println( Arrays.toString( testCase ) );
		final CardProcessor cardProcessor = new CardProcessor();
		final Card[] result = cardProcessor.removeDuplicates(false, testCase );
		System.out.println( Arrays.toString( result ) );

		//----------------------------------------------------------------------// "MARKIERUNG" ;-)
		// Ab hier dürfen Sie eigene Tests ergänzen
		System.out.printf( "\n\n" ); 
		System.out.println( "Starting new test" ); 
		final Card[] testCase1 = { CJ, DJ, DJ, C9, HQ, D2, HQ };
		System.out.println( Arrays.toString( testCase ) );
		final CardProcessor cardProcessor1 = new CardProcessor();
		final Card[] result1 = cardProcessor1.removeDuplicates(true, testCase1 );
		System.out.println( Arrays.toString( result1 ) );

		/* System.out.printf( "\n\n" ); 
		System.out.println( "Starting new test" ); 

		Card[] testCase2 = { CJ, DJ, null, C9, D2, HQ };

		System.out.println( Arrays.toString( testCase2 ) );
		final CardProcessor cardProcessor2 = new CardProcessor();
		final Card[] result2 = cardProcessor2.removeDuplicates(false, testCase2 );
		System.out.println( Arrays.toString( result2 ) ); 


		System.out.printf( "\n\n" ); 
		System.out.println( "Starting new test" ); 
		Card[] testCase3 = null;

		System.out.println( Arrays.toString( testCase3 ) );
		final CardProcessor cardProcessor3 = new CardProcessor();
		final Card[] result3 = cardProcessor3.removeDuplicates(false, testCase3 );
		System.out.println( Arrays.toString( result3 ) );  */
	}//method()

}//class
