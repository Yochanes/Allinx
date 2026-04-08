package com.chiclaim.android.downloader.util;

import android.content.Context;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lcom/chiclaim/android/downloader/util/SpHelper;", "", "Companion", "downloader_release"}, m18303k = 1, m18304mv = {1, 6, 0}, m18306xi = 48)
public final class SpHelper {

    /* JADX INFO: renamed from: b */
    public static final Companion f35109b = new Companion();

    /* JADX INFO: renamed from: c */
    public static SpHelper f35110c;

    /* JADX INFO: renamed from: a */
    public final Lazy f35111a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m18302d2 = {"Lcom/chiclaim/android/downloader/util/SpHelper$Companion;", "", "Lcom/chiclaim/android/downloader/util/SpHelper;", "spUtils", "Lcom/chiclaim/android/downloader/util/SpHelper;", "downloader_release"}, m18303k = 1, m18304mv = {1, 6, 0}, m18306xi = 48)
    public static final class Companion {
        /* JADX INFO: renamed from: a */
        public final synchronized SpHelper m12877a(Context context) {
            SpHelper spHelper;
            try {
                Intrinsics.m18599g(context, "context");
                if (SpHelper.f35110c == null) {
                    SpHelper.f35110c = new SpHelper(context);
                }
                spHelper = SpHelper.f35110c;
                if (spHelper == null) {
                    Intrinsics.m18606n("spUtils");
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
            return spHelper;
        }
    }

    public SpHelper(Context context) {
        this.f35111a = LazyKt.m18299b(new SpHelper$sp$2(context));
    }
}
