package org.slf4j;

import org.slf4j.helpers.BasicMarkerFactory;
import org.slf4j.helpers.Util;
import org.slf4j.spi.SLF4JServiceProvider;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class MarkerFactory {
    static IMarkerFactory MARKER_FACTORY;

    static {
        SLF4JServiceProvider provider = LoggerFactory.getProvider();
        if (provider != null) {
            provider.initialize();
            MARKER_FACTORY = provider.getMarkerFactory();
        } else {
            Util.report("Failed to find provider");
            Util.report("Defaulting to BasicMarkerFactory.");
            MARKER_FACTORY = new BasicMarkerFactory();
        }
    }

    private MarkerFactory() {
    }

    public static Marker getDetachedMarker(String str) {
        return MARKER_FACTORY.getDetachedMarker(str);
    }

    public static IMarkerFactory getIMarkerFactory() {
        return MARKER_FACTORY;
    }

    public static Marker getMarker(String str) {
        return MARKER_FACTORY.getMarker(str);
    }
}
