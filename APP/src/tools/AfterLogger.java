package tools;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
/**
 * 最终增强
 * 
 */
public class AfterLogger {
	private static final Logger log = Logger.getLogger(AfterLogger.class);

	public void afterLogger(JoinPoint jp) {
		log.info(jp.getSignature().getName() + "方法结束执行。");
	}
}
