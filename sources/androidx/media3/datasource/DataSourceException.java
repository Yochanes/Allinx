package androidx.media3.datasource;

import java.io.IOException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class DataSourceException extends IOException {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f25812b = 0;

    /* JADX INFO: renamed from: a */
    public final int f25813a;

    public DataSourceException(int i) {
        this.f25813a = i;
    }

    public DataSourceException(Exception exc, int i) {
        super(exc);
        this.f25813a = i;
    }

    public DataSourceException(String str, int i) {
        super(str);
        this.f25813a = i;
    }

    public DataSourceException(String str, Exception exc, int i) {
        super(str, exc);
        this.f25813a = i;
    }
}
