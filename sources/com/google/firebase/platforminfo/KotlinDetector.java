package com.google.firebase.platforminfo;

import androidx.annotation.Nullable;
import kotlin.KotlinVersion;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class KotlinDetector {
    private KotlinDetector() {
    }

    @Nullable
    public static String detectVersion() {
        try {
            return KotlinVersion.f51416f.toString();
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }
}
