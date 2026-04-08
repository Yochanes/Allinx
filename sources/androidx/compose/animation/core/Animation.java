package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0003"}, m18302d2 = {"Landroidx/compose/animation/core/Animation;", "T", "Landroidx/compose/animation/core/AnimationVector;", "V", "", "animation-core_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public interface Animation<T, V extends AnimationVector> {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class DefaultImpls {
    }

    /* JADX INFO: renamed from: a */
    boolean mo2264a();

    /* JADX INFO: renamed from: b */
    long mo2265b();

    /* JADX INFO: renamed from: c */
    TwoWayConverter mo2266c();

    /* JADX INFO: renamed from: d */
    AnimationVector mo2267d(long j);

    /* JADX INFO: renamed from: e */
    default boolean m2268e(long j) {
        return j >= mo2265b();
    }

    /* JADX INFO: renamed from: f */
    Object mo2269f(long j);

    /* JADX INFO: renamed from: g */
    Object mo2270g();
}
