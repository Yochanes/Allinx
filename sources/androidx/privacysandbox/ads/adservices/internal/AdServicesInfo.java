package androidx.privacysandbox.ads.adservices.internal;

import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.media3.common.AbstractC1740a;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/privacysandbox/ads/adservices/internal/AdServicesInfo;", "", "Extensions30Impl", "ads-adservices_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class AdServicesInfo {

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/privacysandbox/ads/adservices/internal/AdServicesInfo$Extensions30Impl;", "", "", "a", "()I", "ads-adservices_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Extensions30Impl {

        /* JADX INFO: renamed from: a */
        public static final Extensions30Impl f31421a = new Extensions30Impl();

        @DoNotInline
        /* JADX INFO: renamed from: a */
        public final int m11465a() {
            return AbstractC1740a.m9402C();
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m11464a() {
        if (Build.VERSION.SDK_INT >= 30) {
            return Extensions30Impl.f31421a.m11465a();
        }
        return 0;
    }
}
