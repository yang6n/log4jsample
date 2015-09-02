
/**
 * Copyright (c) 2015 Jian. All rights reserved.
 */
package com.estudio.samples.log4jsample;

import org.apache.log4j.Logger;

/**
 * 
 * @author Jian
 * 
 * Created: Sep 1, 2015
 */
public abstract class LogBase {
    private Logger logger = Logger.getLogger(this.getClass());
    
    public void debug() {
        logger.debug("This is debug message from: " + this.getClass().getSimpleName());
    }
    
    public void info() {
        logger.info("This is info message from: " + this.getClass().getSimpleName());
    }
    
    public void warn() {
        logger.warn("This is warn message from: " + this.getClass().getSimpleName());
    }
    
    public void error() {
        logger.error("This is error message from: " + this.getClass().getSimpleName());
    }
}
