package com.airbnb.lottie;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class AsyncUpdates {

    /* JADX INFO: renamed from: a */
    public static final AsyncUpdates f34023a;

    /* JADX INFO: renamed from: b */
    public static final AsyncUpdates f34024b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AsyncUpdates[] f34025c;

    static {
        AsyncUpdates asyncUpdates = new AsyncUpdates("AUTOMATIC", 0);
        f34023a = asyncUpdates;
        AsyncUpdates asyncUpdates2 = new AsyncUpdates("ENABLED", 1);
        f34024b = asyncUpdates2;
        f34025c = new AsyncUpdates[]{asyncUpdates, asyncUpdates2, new AsyncUpdates("DISABLED", 2)};
    }

    public static AsyncUpdates valueOf(String str) {
        return (AsyncUpdates) Enum.valueOf(AsyncUpdates.class, str);
    }

    public static AsyncUpdates[] values() {
        return (AsyncUpdates[]) f34025c.clone();
    }
}
