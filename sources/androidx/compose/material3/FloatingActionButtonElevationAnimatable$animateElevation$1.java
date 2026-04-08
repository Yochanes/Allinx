package androidx.compose.material3;

import androidx.compose.foundation.interaction.Interaction;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.compose.material3.FloatingActionButtonElevationAnimatable", m18559f = "FloatingActionButton.kt", m18560l = {650}, m18561m = "animateElevation")
final class FloatingActionButtonElevationAnimatable$animateElevation$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f13455a;

    /* JADX INFO: renamed from: b */
    public Interaction f13456b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f13457c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ FloatingActionButtonElevationAnimatable f13458d;

    /* JADX INFO: renamed from: f */
    public int f13459f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingActionButtonElevationAnimatable$animateElevation$1(FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f13458d = floatingActionButtonElevationAnimatable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f13457c = obj;
        this.f13459f |= Integer.MIN_VALUE;
        return this.f13458d.m3954a(null, this);
    }
}
