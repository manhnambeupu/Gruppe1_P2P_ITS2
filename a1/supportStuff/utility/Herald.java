// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
// "Home"-VCS:   git@git.HAW-Hamburg.de:shf/Px/LabExercise/ZZZ_SupportStuff[.git]
package supportStuff.utility;


import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;


/**
 * Task: For information see ReadMe.txt resp. task
 * 
 * @version {@value #encodedVersion}
 * @author  Michael Schäfers ;  P2@Hamburg-UAS.eu 
 */
public class Herald implements Serializable {
    //
    //--VERSION:-------------------------------#---vvvvvvvvv---vvvv-vv-vv--vv
    //  ========                               #___~version~___YYYY_MM_DD__dd_
    final static private long encodedVersion = 2___00001_001___2021_12_13__01L;
    //-----------------------------------------#---^^^^^-^^^---^^^^-^^-^^--^^
    final static private supportStuff.utility.Version version = new supportStuff.utility.Version( encodedVersion );
  //static public String getDecodedVersion(){ return version.getDecodedVersion(); }
    static final private long serialVersionUID = version.getVersionNumber();
    
    
    
    public static void proclaimMessage( final String message ){
        System.err.flush();
        System.out.flush();
        System.out.print( message );
        System.out.flush();
    }//method()
    //
    public static void proclaimMessage( final StringBuilder message ){
        proclaimMessage( message.toString() );
    }//method()
    //
    public static void proclaimMessage( final StringBuffer message ){
        proclaimMessage( message.toString() );
    }//method()
    
    
    public static void proclaimError( final String message ){
        System.out.flush();
        System.err.flush();
        System.err.print( message );
        System.err.flush();
    }//method()
    //
    public static void proclaimError( final StringBuilder message ){
        proclaimError( message.toString() );
    }//method()
    //
    public static void proclaimError( final StringBuffer message ){
        proclaimError( message.toString() );
    }//method()
    
    
    public static void proclaimTestStart( final String testName ){
        final StringBuffer sb = new StringBuffer( "" );
        sb.append( "vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv\n" );
        sb.append( String.format( ">>> Start of %s  @ %s ~~~ %s\n",  testName, LocalDate.now(), LocalTime.now() ));
        sb.append( "\n" );
        proclaimMessage( sb.toString() );
    }//method()
    //
    public static void proclaimTestEnd( final String testName ){
        final StringBuffer sb = new StringBuffer( "" );
        sb.append( "\n" );
        sb.append( String.format( "<<<<< End of %s  @ %s ~~~ %s\n",  testName, LocalDate.now(), LocalTime.now() ));
        sb.append( "^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n" );
        proclaimMessage( sb.toString() );
    }//method()
    
}//class
