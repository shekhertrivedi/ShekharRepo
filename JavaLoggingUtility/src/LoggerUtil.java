import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerUtil {

	private static final Logger LOGGER = Logger.getLogger(LoggerUtil.class.getName());
	
	public static Logger getLogger() {
		return LOGGER;
	}
    public static void initializeLogger() {
    	 
        Handler consoleHandler = null;
        Handler fileHandler  = null;
        Formatter simpleFormatter = null;
        try{
            consoleHandler = new ConsoleHandler();
            fileHandler  = new FileHandler("./fileDownloader.log");
             
            LOGGER.addHandler(consoleHandler);
            LOGGER.addHandler(fileHandler);
            simpleFormatter = new SimpleFormatter();
            consoleHandler.setLevel(Level.ALL);
            fileHandler.setLevel(Level.ALL);
            fileHandler.setFormatter(simpleFormatter);
            LOGGER.setLevel(Level.ALL);
             
            LOGGER.removeHandler(consoleHandler);
             
        }catch(IOException exception){
            LOGGER.log(Level.SEVERE, "Error occur in FileHandler.", exception);
        }
         
    }
}
