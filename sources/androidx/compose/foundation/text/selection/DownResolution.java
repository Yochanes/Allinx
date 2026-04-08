package androidx.compose.foundation.text.selection;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/text/selection/DownResolution;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class DownResolution {

    /* JADX INFO: renamed from: a */
    public static final DownResolution f9627a;

    /* JADX INFO: renamed from: b */
    public static final DownResolution f9628b;

    /* JADX INFO: renamed from: c */
    public static final DownResolution f9629c;

    /* JADX INFO: renamed from: d */
    public static final DownResolution f9630d;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ DownResolution[] f9631f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ EnumEntries f9632g;

    static {
        DownResolution downResolution = new DownResolution("Up", 0);
        f9627a = downResolution;
        DownResolution downResolution2 = new DownResolution("Drag", 1);
        f9628b = downResolution2;
        DownResolution downResolution3 = new DownResolution("Timeout", 2);
        f9629c = downResolution3;
        DownResolution downResolution4 = new DownResolution("Cancel", 3);
        f9630d = downResolution4;
        DownResolution[] downResolutionArr = {downResolution, downResolution2, downResolution3, downResolution4};
        f9631f = downResolutionArr;
        f9632g = EnumEntriesKt.m18563a(downResolutionArr);
    }

    public static DownResolution valueOf(String str) {
        return (DownResolution) Enum.valueOf(DownResolution.class, str);
    }

    public static DownResolution[] values() {
        return (DownResolution[]) f9631f.clone();
    }
}
