package androidx.compose.p013ui.layout;

import com.google.common.net.HttpHeaders;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/layout/IntrinsicWidthHeight;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class IntrinsicWidthHeight {

    /* JADX INFO: renamed from: a */
    public static final IntrinsicWidthHeight f18460a;

    /* JADX INFO: renamed from: b */
    public static final IntrinsicWidthHeight f18461b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ IntrinsicWidthHeight[] f18462c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ EnumEntries f18463d;

    static {
        IntrinsicWidthHeight intrinsicWidthHeight = new IntrinsicWidthHeight(HttpHeaders.WIDTH, 0);
        f18460a = intrinsicWidthHeight;
        IntrinsicWidthHeight intrinsicWidthHeight2 = new IntrinsicWidthHeight("Height", 1);
        f18461b = intrinsicWidthHeight2;
        IntrinsicWidthHeight[] intrinsicWidthHeightArr = {intrinsicWidthHeight, intrinsicWidthHeight2};
        f18462c = intrinsicWidthHeightArr;
        f18463d = EnumEntriesKt.m18563a(intrinsicWidthHeightArr);
    }

    public static IntrinsicWidthHeight valueOf(String str) {
        return (IntrinsicWidthHeight) Enum.valueOf(IntrinsicWidthHeight.class, str);
    }

    public static IntrinsicWidthHeight[] values() {
        return (IntrinsicWidthHeight[]) f18462c.clone();
    }
}
