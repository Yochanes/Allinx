package androidx.compose.material;

import androidx.compose.foundation.interaction.Interaction;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.compose.material.FloatingActionButtonElevationAnimatable", m18559f = "FloatingActionButton.kt", m18560l = {384}, m18561m = "animateElevation")
final class FloatingActionButtonElevationAnimatable$animateElevation$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f10631a;

    /* JADX INFO: renamed from: b */
    public Interaction f10632b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f10633c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ FloatingActionButtonElevationAnimatable f10634d;

    /* JADX INFO: renamed from: f */
    public int f10635f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingActionButtonElevationAnimatable$animateElevation$1(FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f10634d = floatingActionButtonElevationAnimatable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10633c = obj;
        this.f10635f |= Integer.MIN_VALUE;
        return this.f10634d.m3750a(null, this);
    }
}
