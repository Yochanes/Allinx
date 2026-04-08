package com.google.android.gms.common.util;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@ShowFirstParty
@KeepForSdk
public interface Clock {

    /* JADX INFO: renamed from: com.google.android.gms.common.util.Clock$-CC, reason: invalid class name */
    /* JADX INFO: compiled from: Proguard */
    public final /* synthetic */ class CC {
        @KeepForSdk
        public static long $default$currentThreadTimeMillis(@NonNull Clock clock) {
            return SystemClock.currentThreadTimeMillis();
        }
    }

    @KeepForSdk
    long currentThreadTimeMillis();

    @KeepForSdk
    long currentTimeMillis();

    @KeepForSdk
    long elapsedRealtime();

    @KeepForSdk
    long nanoTime();
}
