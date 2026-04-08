package androidx.compose.p013ui.text.font;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, m18302d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1", m18559f = "FontListFontFamilyTypefaceAdapter.kt", m18560l = {109}, m18561m = "invokeSuspend")
final class FontListFontFamilyTypefaceAdapter$preload$3$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Object>, Object> {

    /* JADX INFO: renamed from: androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\u008a@"}, m18302d2 = {"<anonymous>", ""}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    @DebugMetadata(m18558c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1$1", m18559f = "FontListFontFamilyTypefaceAdapter.kt", m18560l = {111}, m18561m = "invokeSuspend")
    final class C13331 extends SuspendLambda implements Function1<Continuation<? super Object>, Object> {

        /* JADX INFO: renamed from: androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, m18302d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
        @DebugMetadata(m18558c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1$1$1", m18559f = "FontListFontFamilyTypefaceAdapter.kt", m18560l = {112}, m18561m = "invokeSuspend")
        final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Object>, Object> {

            /* JADX INFO: renamed from: a */
            public int f20287a;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                throw null;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                throw null;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
                int i = this.f20287a;
                if (i == 0) {
                    ResultKt.m18313b(obj);
                    this.f20287a = 1;
                    throw null;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m18313b(obj);
                return obj;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            throw null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
            ResultKt.m18313b(obj);
            try {
                throw null;
            } catch (Exception e) {
                throw new IllegalStateException("Unable to load font null", e);
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        throw null;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        ResultKt.m18313b(obj);
        throw null;
    }
}
