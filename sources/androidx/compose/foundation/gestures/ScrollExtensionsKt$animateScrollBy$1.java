package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.compose.foundation.gestures.ScrollExtensionsKt", m18559f = "ScrollExtensions.kt", m18560l = {38}, m18561m = "animateScrollBy")
final class ScrollExtensionsKt$animateScrollBy$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Ref.FloatRef f5848a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f5849b;

    /* JADX INFO: renamed from: c */
    public int f5850c;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f5849b = obj;
        this.f5850c |= Integer.MIN_VALUE;
        return ScrollExtensionsKt.m2639a(null, 0.0f, null, this);
    }
}
