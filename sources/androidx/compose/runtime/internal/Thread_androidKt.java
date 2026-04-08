package androidx.compose.runtime.internal;

import android.os.Looper;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"runtime_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class Thread_androidKt {

    /* JADX INFO: renamed from: a */
    public static final long f16952a;

    static {
        long id;
        try {
            id = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            id = -1;
        }
        f16952a = id;
    }
}
