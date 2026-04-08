package androidx.compose.material;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.compose.material.SwipeableState$snapTo$2", m18559f = "Swipeable.kt", m18560l = {310}, m18561m = "emit")
final class SwipeableState$snapTo$2$emit$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f11380a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f11381b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ SwipeableState$snapTo$2 f11382c;

    /* JADX INFO: renamed from: d */
    public int f11383d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableState$snapTo$2$emit$1(SwipeableState$snapTo$2 swipeableState$snapTo$2, Continuation continuation) {
        super(continuation);
        this.f11382c = swipeableState$snapTo$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f11381b = obj;
        this.f11383d |= Integer.MIN_VALUE;
        this.f11382c.m3798a(null, this);
        throw null;
    }
}
