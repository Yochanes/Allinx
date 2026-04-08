package org.slf4j.spi;

import org.slf4j.ILoggerFactory;
import org.slf4j.IMarkerFactory;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface SLF4JServiceProvider {
    ILoggerFactory getLoggerFactory();

    MDCAdapter getMDCAdapter();

    IMarkerFactory getMarkerFactory();

    String getRequesteApiVersion();

    void initialize();
}
