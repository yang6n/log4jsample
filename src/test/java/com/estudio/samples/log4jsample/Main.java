/**
 * Copyright (c) 2015 Jian. All rights reserved.
 */
package com.estudio.samples.log4jsample;

import com.estudio.samples.log4jsample.pkg100.Class100;
import com.estudio.samples.log4jsample.pkg100.pkg110.Class110;
import com.estudio.samples.log4jsample.pkg100.pkg110.pkg111.Class111;
import com.estudio.samples.log4jsample.pkg100.pkg120.Class120;
import com.estudio.samples.log4jsample.pkg100.pkg120.pkg121.Class121;
import com.estudio.samples.log4jsample.pkg100.pkg130.Class130;
import com.estudio.samples.log4jsample.pkg200.Class200;

/**
 * 
 * @author Jian
 * 
 *         Created: Sep 1, 2015
 */
public class Main {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        logs(new Class100());
        logs(new Class110());
        logs(new Class111());
        logs(new Class120());
        logs(new Class121());
        logs(new Class130());
        logs(new Class200());
    }
    
    private final static void logs(final LogBase logBase) {
        logBase.debug();
        logBase.info();
        logBase.warn();
        logBase.error();
    }
}
