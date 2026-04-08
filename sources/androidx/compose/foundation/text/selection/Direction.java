package androidx.compose.foundation.text.selection;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/text/selection/Direction;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class Direction {

    /* JADX INFO: renamed from: a */
    public static final Direction f9622a;

    /* JADX INFO: renamed from: b */
    public static final Direction f9623b;

    /* JADX INFO: renamed from: c */
    public static final Direction f9624c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ Direction[] f9625d;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ EnumEntries f9626f;

    static {
        Direction direction = new Direction("BEFORE", 0);
        f9622a = direction;
        Direction direction2 = new Direction("ON", 1);
        f9623b = direction2;
        Direction direction3 = new Direction("AFTER", 2);
        f9624c = direction3;
        Direction[] directionArr = {direction, direction2, direction3};
        f9625d = directionArr;
        f9626f = EnumEntriesKt.m18563a(directionArr);
    }

    public static Direction valueOf(String str) {
        return (Direction) Enum.valueOf(Direction.class, str);
    }

    public static Direction[] values() {
        return (Direction[]) f9625d.clone();
    }
}
