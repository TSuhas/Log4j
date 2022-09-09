package beta;

import org.apache.logging.log4j.*;

public class Demo1 {

	
	private static Logger log= LogManager.getLogger(Demo1.class.getName());
	public static void main(String[] args) {
		
		log.debug("I am clicking on button");
		
			log.info("button  is present");
		
	log.error("button is not present");
	log.fatal("button is missing");
	}
}
