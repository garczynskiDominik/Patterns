package edu.grcy.solid.isp.fixed;

import java.util.Collection;
import java.util.Collections;

public interface ReadableLogger extends Logger {
    Collection<String> readMessage();
}
