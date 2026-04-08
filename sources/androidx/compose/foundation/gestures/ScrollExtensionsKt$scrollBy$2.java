package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m18302d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/ScrollScope;"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$2", m18559f = "ScrollExtensions.kt", m18560l = {}, m18561m = "invokeSuspend")
final class ScrollExtensionsKt$scrollBy$2 extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f5861a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Ref.FloatRef f5862b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f5863c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollExtensionsKt$scrollBy$2(Ref.FloatRef floatRef, float f, Continuation continuation) {
        super(2, continuation);
        this.f5862b = floatRef;
        this.f5863c = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScrollExtensionsKt$scrollBy$2 scrollExtensionsKt$scrollBy$2 = new ScrollExtensionsKt$scrollBy$2(this.f5862b, this.f5863c, continuation);
        scrollExtensionsKt$scrollBy$2.f5861a = obj;
        return scrollExtensionsKt$scrollBy$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ScrollExtensionsKt$scrollBy$2 scrollExtensionsKt$scrollBy$2 = (ScrollExtensionsKt$scrollBy$2) create((ScrollScope) obj, (Continuation) obj2);
        Unit unit = Unit.f51459a;
        scrollExtensionsKt$scrollBy$2.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        ResultKt.m18313b(obj);
        this.f5862b.f51656a = ((ScrollScope) this.f5861a).mo2579e(this.f5863c);
        return Unit.f51459a;
    }
}
