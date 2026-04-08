package org.koin.android.logger;

import android.util.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.logger.Level;
import org.koin.core.logger.Logger;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lorg/koin/android/logger/AndroidLogger;", "Lorg/koin/core/logger/Logger;", "koin-android_release"}, m18303k = 1, m18304mv = {1, 5, 1}, m18306xi = 48)
public final class AndroidLogger extends Logger {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {1, 5, 1}, m18306xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[Level.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Level level = Level.f58221a;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Level level2 = Level.f58221a;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                Level level3 = Level.f58221a;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // org.koin.core.logger.Logger
    /* JADX INFO: renamed from: b */
    public final void mo21787b(Level level, String msg) {
        Intrinsics.m18599g(msg, "msg");
        int iOrdinal = level.ordinal();
        if (iOrdinal == 0) {
            Log.d("[Koin]", msg);
            return;
        }
        if (iOrdinal == 1) {
            Log.i("[Koin]", msg);
            return;
        }
        if (iOrdinal == 2) {
            Log.w("[Koin]", msg);
        } else if (iOrdinal != 3) {
            Log.e("[Koin]", msg);
        } else {
            Log.e("[Koin]", msg);
        }
    }
}
