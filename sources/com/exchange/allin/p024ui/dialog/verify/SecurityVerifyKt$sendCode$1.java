package com.exchange.allin.p024ui.dialog.verify;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "com.exchange.allin.ui.dialog.verify.SecurityVerifyKt", m18559f = "SecurityVerify.kt", m18560l = {238, 247}, m18561m = "sendCode")
final class SecurityVerifyKt$sendCode$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Function1 f36803a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f36804b;

    /* JADX INFO: renamed from: c */
    public int f36805c;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f36804b = obj;
        this.f36805c |= Integer.MIN_VALUE;
        return SecurityVerifyKt.m13606a(false, 0, null, null, null, null, this);
    }
}
