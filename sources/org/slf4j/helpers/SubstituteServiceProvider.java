package org.slf4j.helpers;

import org.slf4j.ILoggerFactory;
import org.slf4j.IMarkerFactory;
import org.slf4j.spi.MDCAdapter;
import org.slf4j.spi.SLF4JServiceProvider;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class SubstituteServiceProvider implements SLF4JServiceProvider {
    private SubstituteLoggerFactory loggerFactory = new SubstituteLoggerFactory();
    private IMarkerFactory markerFactory = new BasicMarkerFactory();
    private MDCAdapter mdcAdapter = new BasicMDCAdapter();

    @Override // org.slf4j.spi.SLF4JServiceProvider
    public ILoggerFactory getLoggerFactory() {
        return this.loggerFactory;
    }

    @Override // org.slf4j.spi.SLF4JServiceProvider
    public MDCAdapter getMDCAdapter() {
        return this.mdcAdapter;
    }

    @Override // org.slf4j.spi.SLF4JServiceProvider
    public IMarkerFactory getMarkerFactory() {
        return this.markerFactory;
    }

    @Override // org.slf4j.spi.SLF4JServiceProvider
    public String getRequesteApiVersion() {
        throw new UnsupportedOperationException();
    }

    public SubstituteLoggerFactory getSubstituteLoggerFactory() {
        return this.loggerFactory;
    }

    @Override // org.slf4j.spi.SLF4JServiceProvider
    public void initialize() {
    }
}
