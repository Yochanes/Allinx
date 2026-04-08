package androidx.compose.foundation.layout;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/layout/LayoutOrientation;", "", "foundation-layout_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class LayoutOrientation {

    /* JADX INFO: renamed from: a */
    public static final LayoutOrientation f6479a;

    /* JADX INFO: renamed from: b */
    public static final LayoutOrientation f6480b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ LayoutOrientation[] f6481c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ EnumEntries f6482d;

    static {
        LayoutOrientation layoutOrientation = new LayoutOrientation("Horizontal", 0);
        f6479a = layoutOrientation;
        LayoutOrientation layoutOrientation2 = new LayoutOrientation("Vertical", 1);
        f6480b = layoutOrientation2;
        LayoutOrientation[] layoutOrientationArr = {layoutOrientation, layoutOrientation2};
        f6481c = layoutOrientationArr;
        f6482d = EnumEntriesKt.m18563a(layoutOrientationArr);
    }

    public static LayoutOrientation valueOf(String str) {
        return (LayoutOrientation) Enum.valueOf(LayoutOrientation.class, str);
    }

    public static LayoutOrientation[] values() {
        return (LayoutOrientation[]) f6481c.clone();
    }
}
