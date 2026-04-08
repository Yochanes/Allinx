package androidx.compose.material;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.compose.material.FloatingActionButtonElevationAnimatable", m18559f = "FloatingActionButton.kt", m18560l = {370}, m18561m = "snapElevation")
final class FloatingActionButtonElevationAnimatable$snapElevation$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f10636a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f10637b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ FloatingActionButtonElevationAnimatable f10638c;

    /* JADX INFO: renamed from: d */
    public int f10639d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingActionButtonElevationAnimatable$snapElevation$1(FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f10638c = floatingActionButtonElevationAnimatable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10637b = obj;
        this.f10639d |= Integer.MIN_VALUE;
        return this.f10638c.m3751b(this);
    }
}
