package androidx.compose.material;

import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.compose.material.SwipeableState$animateTo$2", m18559f = "Swipeable.kt", m18560l = {327}, m18561m = "emit")
final class SwipeableState$animateTo$2$emit$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f11364a;

    /* JADX INFO: renamed from: b */
    public Map f11365b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f11366c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ SwipeableState$animateTo$2 f11367d;

    /* JADX INFO: renamed from: f */
    public int f11368f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableState$animateTo$2$emit$1(SwipeableState$animateTo$2 swipeableState$animateTo$2, Continuation continuation) {
        super(continuation);
        this.f11367d = swipeableState$animateTo$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f11366c = obj;
        this.f11368f |= Integer.MIN_VALUE;
        return this.f11367d.m3797a(null, this);
    }
}
