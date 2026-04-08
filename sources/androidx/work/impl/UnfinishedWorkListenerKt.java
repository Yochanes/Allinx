package androidx.work.impl;

import androidx.work.Logger;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"work-runtime_release"}, m18303k = 2, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class UnfinishedWorkListenerKt {

    /* JADX INFO: renamed from: a */
    public static final String f32697a;

    /* JADX INFO: renamed from: b */
    public static final long f32698b;

    static {
        String strM12101g = Logger.m12101g("UnfinishedWorkListener");
        Intrinsics.m18598f(strM12101g, "tagWithPrefix(\"UnfinishedWorkListener\")");
        f32697a = strM12101g;
        f32698b = TimeUnit.HOURS.toMillis(1L);
    }
}
