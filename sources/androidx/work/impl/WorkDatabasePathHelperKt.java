package androidx.work.impl;

import androidx.work.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"work-runtime_release"}, m18303k = 2, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class WorkDatabasePathHelperKt {

    /* JADX INFO: renamed from: a */
    public static final String f32712a;

    /* JADX INFO: renamed from: b */
    public static final String[] f32713b;

    static {
        String strM12101g = Logger.m12101g("WrkDbPathHelper");
        Intrinsics.m18598f(strM12101g, "tagWithPrefix(\"WrkDbPathHelper\")");
        f32712a = strM12101g;
        f32713b = new String[]{"-journal", "-shm", "-wal"};
    }
}
