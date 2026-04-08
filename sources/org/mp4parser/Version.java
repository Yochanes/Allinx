package org.mp4parser;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class Version {

    /* JADX INFO: renamed from: a */
    public static final Logger f58260a = LoggerFactory.getLogger((Class<?>) Version.class);

    static {
        try {
            new LineNumberReader(new InputStreamReader(Version.class.getResourceAsStream("/version2.txt"))).readLine();
        } catch (IOException e) {
            f58260a.warn(e.getMessage());
        }
    }
}
