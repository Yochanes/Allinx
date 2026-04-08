package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.compose.material3.FloatingActionButtonElevationAnimatable", m18559f = "FloatingActionButton.kt", m18560l = {636}, m18561m = "snapElevation")
final class FloatingActionButtonElevationAnimatable$snapElevation$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f13460a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f13461b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ FloatingActionButtonElevationAnimatable f13462c;

    /* JADX INFO: renamed from: d */
    public int f13463d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingActionButtonElevationAnimatable$snapElevation$1(FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f13462c = floatingActionButtonElevationAnimatable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f13461b = obj;
        this.f13463d |= Integer.MIN_VALUE;
        return this.f13462c.m3955b(this);
    }
}
