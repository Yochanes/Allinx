package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/animation/core/AnimationEndReason;", "", "animation-core_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class AnimationEndReason {

    /* JADX INFO: renamed from: a */
    public static final AnimationEndReason f4335a;

    /* JADX INFO: renamed from: b */
    public static final AnimationEndReason f4336b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AnimationEndReason[] f4337c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ EnumEntries f4338d;

    static {
        AnimationEndReason animationEndReason = new AnimationEndReason("BoundReached", 0);
        f4335a = animationEndReason;
        AnimationEndReason animationEndReason2 = new AnimationEndReason("Finished", 1);
        f4336b = animationEndReason2;
        AnimationEndReason[] animationEndReasonArr = {animationEndReason, animationEndReason2};
        f4337c = animationEndReasonArr;
        f4338d = EnumEntriesKt.m18563a(animationEndReasonArr);
    }

    public static AnimationEndReason valueOf(String str) {
        return (AnimationEndReason) Enum.valueOf(AnimationEndReason.class, str);
    }

    public static AnimationEndReason[] values() {
        return (AnimationEndReason[]) f4337c.clone();
    }
}
