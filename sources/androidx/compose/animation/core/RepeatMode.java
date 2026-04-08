package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/animation/core/RepeatMode;", "", "animation-core_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class RepeatMode {

    /* JADX INFO: renamed from: a */
    public static final RepeatMode f4477a;

    /* JADX INFO: renamed from: b */
    public static final RepeatMode f4478b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ RepeatMode[] f4479c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ EnumEntries f4480d;

    static {
        RepeatMode repeatMode = new RepeatMode("Restart", 0);
        f4477a = repeatMode;
        RepeatMode repeatMode2 = new RepeatMode("Reverse", 1);
        f4478b = repeatMode2;
        RepeatMode[] repeatModeArr = {repeatMode, repeatMode2};
        f4479c = repeatModeArr;
        f4480d = EnumEntriesKt.m18563a(repeatModeArr);
    }

    public static RepeatMode valueOf(String str) {
        return (RepeatMode) Enum.valueOf(RepeatMode.class, str);
    }

    public static RepeatMode[] values() {
        return (RepeatMode[]) f4479c.clone();
    }
}
