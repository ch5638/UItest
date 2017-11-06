package T71kuangjia2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class logDemo {
	private static Logger logger = LogManager.getLogger(logDemo.class.getName());
	public static void main(String[] args) {
		
		    logger.error("error信息");
		    logger.info("info信息");
			logger.debug("debug信息");
			logger.warn("warn信息");
			logger.fatal("fatal信息");
		

	}

}
