package androidx.constraintlayout.compose;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/constraintlayout/compose/MotionCarouselDirection;", "", "constraintlayout-compose_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
final class MotionCarouselDirection {

    /* JADX INFO: renamed from: a */
    public static final MotionCarouselDirection f20923a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ MotionCarouselDirection[] f20924b;

    static {
        MotionCarouselDirection motionCarouselDirection = new MotionCarouselDirection("FORWARD", 0);
        f20923a = motionCarouselDirection;
        f20924b = new MotionCarouselDirection[]{motionCarouselDirection, new MotionCarouselDirection("BACKWARD", 1)};
    }

    public static MotionCarouselDirection valueOf(String str) {
        return (MotionCarouselDirection) Enum.valueOf(MotionCarouselDirection.class, str);
    }

    public static MotionCarouselDirection[] values() {
        return (MotionCarouselDirection[]) f20924b.clone();
    }
}
