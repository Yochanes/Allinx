package androidx.media3.datasource;

import androidx.media3.common.util.UnstableApi;
import java.io.IOException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class DataSourceUtil {
    /* JADX INFO: renamed from: a */
    public static void m9677a(DataSource dataSource) {
        if (dataSource != null) {
            try {
                dataSource.close();
            } catch (IOException unused) {
            }
        }
    }
}
