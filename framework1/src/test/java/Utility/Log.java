package Utility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log {

	public static Logger logger = LogManager.getLogger(Log.class);

	public static void main(String[] args) {
		logger.info("URL is opened");

	}

	public static void loginfo(String string) {
		// TODO Auto-generated method stub
		
	}

	public void config1() {
		// TODO Auto-generated method stub
		
	}

//	public static Logger Log = LogManager.getLogger(Log.class);
//
//	public static void loginfo(String info) {
//		Log.info(info);
//
//	}
//
//	public static void logwarn(String warn) {
//		Log.warn(warn);
//	}
//
//	public static void logerror(String error) {
//		Log.error(error);
//	}
//
//	public static void logfatal(String fatal) {
//		Log.fatal(fatal);
//	}
//
//	public void config() {
//		// TODO Auto-generated method stub
//
//	}
//
//	public void config1() {
//		// TODO Auto-generated method stub
//
//	}
}