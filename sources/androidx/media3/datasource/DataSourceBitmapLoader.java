package androidx.media3.datasource;

import androidx.media3.common.util.BitmapLoader;
import androidx.media3.common.util.UnstableApi;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class DataSourceBitmapLoader implements BitmapLoader {

    /* JADX INFO: renamed from: a */
    public static final Supplier f25811a = Suppliers.memoize(new C1759a(0));
}
