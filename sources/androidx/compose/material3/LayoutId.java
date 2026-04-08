package androidx.compose.material3;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material3/LayoutId;", "", "material3_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
final class LayoutId {

    /* JADX INFO: renamed from: a */
    public static final LayoutId f13529a;

    /* JADX INFO: renamed from: b */
    public static final LayoutId f13530b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ LayoutId[] f13531c;

    static {
        LayoutId layoutId = new LayoutId("Selector", 0);
        f13529a = layoutId;
        LayoutId layoutId2 = new LayoutId("InnerCircle", 1);
        f13530b = layoutId2;
        f13531c = new LayoutId[]{layoutId, layoutId2};
    }

    public static LayoutId valueOf(String str) {
        return (LayoutId) Enum.valueOf(LayoutId.class, str);
    }

    public static LayoutId[] values() {
        return (LayoutId[]) f13531c.clone();
    }
}
