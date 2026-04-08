package androidx.compose.foundation.layout;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/layout/IntrinsicSize;", "", "foundation-layout_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class IntrinsicSize {

    /* JADX INFO: renamed from: a */
    public static final IntrinsicSize f6470a;

    /* JADX INFO: renamed from: b */
    public static final IntrinsicSize f6471b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ IntrinsicSize[] f6472c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ EnumEntries f6473d;

    static {
        IntrinsicSize intrinsicSize = new IntrinsicSize("Min", 0);
        f6470a = intrinsicSize;
        IntrinsicSize intrinsicSize2 = new IntrinsicSize("Max", 1);
        f6471b = intrinsicSize2;
        IntrinsicSize[] intrinsicSizeArr = {intrinsicSize, intrinsicSize2};
        f6472c = intrinsicSizeArr;
        f6473d = EnumEntriesKt.m18563a(intrinsicSizeArr);
    }

    public static IntrinsicSize valueOf(String str) {
        return (IntrinsicSize) Enum.valueOf(IntrinsicSize.class, str);
    }

    public static IntrinsicSize[] values() {
        return (IntrinsicSize[]) f6472c.clone();
    }
}
