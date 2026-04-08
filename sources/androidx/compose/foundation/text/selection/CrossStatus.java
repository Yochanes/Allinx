package androidx.compose.foundation.text.selection;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/text/selection/CrossStatus;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class CrossStatus {

    /* JADX INFO: renamed from: a */
    public static final CrossStatus f9617a;

    /* JADX INFO: renamed from: b */
    public static final CrossStatus f9618b;

    /* JADX INFO: renamed from: c */
    public static final CrossStatus f9619c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ CrossStatus[] f9620d;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ EnumEntries f9621f;

    static {
        CrossStatus crossStatus = new CrossStatus("CROSSED", 0);
        f9617a = crossStatus;
        CrossStatus crossStatus2 = new CrossStatus("NOT_CROSSED", 1);
        f9618b = crossStatus2;
        CrossStatus crossStatus3 = new CrossStatus("COLLAPSED", 2);
        f9619c = crossStatus3;
        CrossStatus[] crossStatusArr = {crossStatus, crossStatus2, crossStatus3};
        f9620d = crossStatusArr;
        f9621f = EnumEntriesKt.m18563a(crossStatusArr);
    }

    public static CrossStatus valueOf(String str) {
        return (CrossStatus) Enum.valueOf(CrossStatus.class, str);
    }

    public static CrossStatus[] values() {
        return (CrossStatus[]) f9620d.clone();
    }
}
