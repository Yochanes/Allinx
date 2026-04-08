package androidx.navigation.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/navigation/internal/Log;", "", "Companion", "navigation-runtime_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class Log {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/navigation/internal/Log$Companion;", "", "navigation-runtime_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class Companion {
        /* JADX INFO: renamed from: a */
        public static void m11267a(String message) {
            Intrinsics.m18599g(message, "message");
            android.util.Log.i("NavController", message);
        }
    }
}
