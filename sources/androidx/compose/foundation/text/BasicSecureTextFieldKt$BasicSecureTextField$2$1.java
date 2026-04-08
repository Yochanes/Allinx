package androidx.compose.foundation.text;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m18302d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$2$1", m18559f = "BasicSecureTextField.kt", m18560l = {}, m18561m = "invokeSuspend")
final class BasicSecureTextFieldKt$BasicSecureTextField$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f8016a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SecureTextFieldController f8017b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicSecureTextFieldKt$BasicSecureTextField$2$1(boolean z2, SecureTextFieldController secureTextFieldController, Continuation continuation) {
        super(2, continuation);
        this.f8016a = z2;
        this.f8017b = secureTextFieldController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BasicSecureTextFieldKt$BasicSecureTextField$2$1(this.f8016a, this.f8017b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        BasicSecureTextFieldKt$BasicSecureTextField$2$1 basicSecureTextFieldKt$BasicSecureTextField$2$1 = (BasicSecureTextFieldKt$BasicSecureTextField$2$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f51459a;
        basicSecureTextFieldKt$BasicSecureTextField$2$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        ResultKt.m18313b(obj);
        if (this.f8016a) {
            return Unit.f51459a;
        }
        this.f8017b.getClass();
        throw null;
    }
}
