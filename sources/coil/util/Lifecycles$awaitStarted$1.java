package coil.util;

import androidx.lifecycle.Lifecycle;
import io.intercom.android.sdk.models.carousel.Carousel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;

/* JADX INFO: renamed from: coil.util.-Lifecycles$awaitStarted$1, reason: invalid class name */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "coil.util.-Lifecycles", m18559f = "Lifecycles.kt", m18560l = {Carousel.ENTITY_TYPE}, m18561m = "awaitStarted")
final class Lifecycles$awaitStarted$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Lifecycle f33990a;

    /* JADX INFO: renamed from: b */
    public Ref.ObjectRef f33991b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f33992c;

    /* JADX INFO: renamed from: d */
    public int f33993d;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f33992c = obj;
        this.f33993d |= Integer.MIN_VALUE;
        return Lifecycles.m12530a(null, this);
    }
}
