package org.jetbrains.anko;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Lorg/jetbrains/anko/Orientation;", "", "commons-base_release"}, m18303k = 1, m18304mv = {1, 4, 0})
public final class Orientation {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ Orientation[] f58164a = {new Orientation("PORTRAIT", 0), new Orientation("LANDSCAPE", 1), new Orientation("SQUARE", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    Orientation EF5;

    public static Orientation valueOf(String str) {
        return (Orientation) Enum.valueOf(Orientation.class, str);
    }

    public static Orientation[] values() {
        return (Orientation[]) f58164a.clone();
    }
}
