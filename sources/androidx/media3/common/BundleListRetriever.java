package androidx.media3.common;

import android.os.Binder;
import android.os.Parcel;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class BundleListRetriever extends Binder {
    static {
        if (Util.f25665a >= 30) {
            AbstractC1740a.m9404a();
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        if (parcel2 == null) {
            return false;
        }
        throw null;
    }
}
