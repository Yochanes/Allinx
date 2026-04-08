package androidx.camera.core.impl;

import androidx.annotation.RequiresApi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class Timebase {

    /* JADX INFO: renamed from: a */
    public static final Timebase f2800a;

    /* JADX INFO: renamed from: b */
    public static final Timebase f2801b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ Timebase[] f2802c;

    static {
        Timebase timebase = new Timebase("UPTIME", 0);
        f2800a = timebase;
        Timebase timebase2 = new Timebase("REALTIME", 1);
        f2801b = timebase2;
        f2802c = new Timebase[]{timebase, timebase2};
    }

    public static Timebase valueOf(String str) {
        return (Timebase) Enum.valueOf(Timebase.class, str);
    }

    public static Timebase[] values() {
        return (Timebase[]) f2802c.clone();
    }
}
