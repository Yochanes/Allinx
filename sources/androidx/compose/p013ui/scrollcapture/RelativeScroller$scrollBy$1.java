package androidx.compose.p013ui.scrollcapture;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.compose.ui.scrollcapture.RelativeScroller", m18559f = "ComposeScrollCaptureCallback.android.kt", m18560l = {296}, m18561m = "scrollBy")
final class RelativeScroller$scrollBy$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f19703a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f19704b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ RelativeScroller f19705c;

    /* JADX INFO: renamed from: d */
    public int f19706d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RelativeScroller$scrollBy$1(RelativeScroller relativeScroller, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f19705c = relativeScroller;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f19704b = obj;
        this.f19706d |= Integer.MIN_VALUE;
        return this.f19705c.m6259a(0.0f, this);
    }
}
