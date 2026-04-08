package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/animation/core/TwoWayConverterImpl;", "T", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/TwoWayConverter;", "animation-core_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class TwoWayConverterImpl<T, V extends AnimationVector> implements TwoWayConverter<T, V> {

    /* JADX INFO: renamed from: a */
    public final Lambda f4684a;

    /* JADX INFO: renamed from: b */
    public final Lambda f4685b;

    /* JADX WARN: Multi-variable type inference failed */
    public TwoWayConverterImpl(Function1 function1, Function1 function12) {
        this.f4684a = (Lambda) function1;
        this.f4685b = (Lambda) function12;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // androidx.compose.animation.core.TwoWayConverter
    /* JADX INFO: renamed from: a */
    public final Function1 mo2376a() {
        return this.f4684a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // androidx.compose.animation.core.TwoWayConverter
    /* JADX INFO: renamed from: b */
    public final Function1 mo2377b() {
        return this.f4685b;
    }
}
