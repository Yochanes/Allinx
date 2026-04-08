package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/animation/core/AnimationScope;", "T", "Landroidx/compose/animation/core/AnimationVector;", "V", "", "animation-core_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class AnimationScope<T, V extends AnimationVector> {

    /* JADX INFO: renamed from: a */
    public final TwoWayConverter f4341a;

    /* JADX INFO: renamed from: b */
    public final Object f4342b;

    /* JADX INFO: renamed from: c */
    public final long f4343c;

    /* JADX INFO: renamed from: d */
    public final Lambda f4344d;

    /* JADX INFO: renamed from: e */
    public final MutableState f4345e;

    /* JADX INFO: renamed from: f */
    public AnimationVector f4346f;

    /* JADX INFO: renamed from: g */
    public long f4347g;

    /* JADX INFO: renamed from: h */
    public long f4348h = Long.MIN_VALUE;

    /* JADX INFO: renamed from: i */
    public final MutableState f4349i = SnapshotStateKt.m4525g(Boolean.TRUE);

    /* JADX WARN: Multi-variable type inference failed */
    public AnimationScope(Object obj, TwoWayConverter twoWayConverter, AnimationVector animationVector, long j, Object obj2, long j2, Function0 function0) {
        this.f4341a = twoWayConverter;
        this.f4342b = obj2;
        this.f4343c = j2;
        this.f4344d = (Lambda) function0;
        this.f4345e = SnapshotStateKt.m4525g(obj);
        this.f4346f = AnimationVectorsKt.m2286a(animationVector);
        this.f4347g = j;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    /* JADX INFO: renamed from: a */
    public final void m2271a() {
        ((SnapshotMutableStateImpl) this.f4349i).setValue(Boolean.FALSE);
        this.f4344d.invoke();
    }

    /* JADX INFO: renamed from: b */
    public final Object m2272b() {
        return this.f4341a.mo2377b().invoke(this.f4346f);
    }
}
