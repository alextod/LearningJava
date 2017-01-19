package com.lohika.lerningjava.abstractions;

import com.lohika.lerningjava.exceptions.RainedOut;

/**
 * Created by atodorov on 12/14/2015.
 */
public interface Storm {
    void event() throws RainedOut;
    void rainHard() throws RainedOut;
}
