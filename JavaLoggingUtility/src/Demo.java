import java.util.logging.Logger;
public class Demo {

	static {
		LoggerUtil.initializeLogger();
	}
	static Logger LOGGER = LoggerUtil.getLogger();
	public static void main(String[] args) {
		
		LOGGER.info("Shekhar logging");		
	}
}
