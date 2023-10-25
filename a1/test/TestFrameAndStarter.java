// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package test;


import java.time.Clock;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

import application.implementation.DummyForYourSolution;
import supportStuff.testSupport.FieldSimulator;
import supportStuff.utility.Version;


public class TestFrameAndStarter {
    //
    //--VERSION:-------------------------------#---vvvvvvvvv---vvvv-vv-vv--vv
    //  ========                               #___~version~___YYYY_MM_DD__dd_
    final static private long encodedVersion = 2___00002_001___2023_08_25__01L;
    //-----------------------------------------#---^^^^^-^^^---^^^^-^^-^^--^^
    final static private Version version = new Version( encodedVersion );
    /**
     * The method {@link #getDecodedVersion()} delivers the code version as reground/readable String.
     * @return version as decoded/readable String.
     */
    static public String getDecodedVersion(){ return version.getDecodedVersion(); }
    // Obiges (ab VERSION) dient nur der Versionierung
    
    
    
    
    
    static final private class AnyNestedClass {}
    static final private AnyNestedClass anc = new AnyNestedClass();
    
    
    
    
    
    public static void main( final String... unused ){
        
        System.out.printf( "\n\n\n" );
        System.out.printf( "###############################################################################\n" );
        System.out.printf( "###############################################################################\n" );
        System.out.printf( "###############################################################################\n" );
        System.out.printf( "### Informationen zum Environment:\n" );
        System.out.printf( "### ==============================\n" );
        System.out.printf( "###\n" );
        System.out.printf( "### Java:     %s bzw. %s\n",                System.getProperty( "java.specification.version" ), System.getProperty( "java.version" ) );
        System.out.printf( "### O.-P.:    %s\n",                        new Object().getClass().getPackage() );
        System.out.printf( "###\n" );
        System.out.printf( "### %s  is home of \".class\"-files\n",     TestFrameAndStarter.class.getProtectionDomain().getCodeSource().getLocation().getPath() );
        System.out.printf( "### %s  is running\n",                      anc.getClass().getEnclosingClass().getCanonicalName() );
        System.out.printf( "###\n" );
        System.out.printf( "###\n" );
        System.out.printf( "### STARTING @ %s\n",                       DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").withZone( ZoneId.of( "Europe/Berlin") ).format( Clock.systemUTC().instant() ) );
        System.out.printf( "\n" );
        System.out.flush();
        
        final GameAnalyzer ga = new DummyForYourSolution();
        final TestExecutor te = new FieldSimulator( ga );
        te.execute();
        
        System.out.printf( "###############################################################################\n" );
        System.out.printf( "###############################################################################\n" );
        System.out.printf( "### THE END @ %s", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").withZone( ZoneId.of( "Europe/Berlin") ).format( Clock.systemUTC().instant() ) );
        
    }//method()
    
}//class
