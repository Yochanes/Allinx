package com.google.accompanist.insets;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
public /* synthetic */ class ImeNestedScrollConnection$imeAnimController$2 extends FunctionReferenceImpl implements Function0<SimpleImeAnimationController> {
    public static final ImeNestedScrollConnection$imeAnimController$2 INSTANCE = new ImeNestedScrollConnection$imeAnimController$2();

    public ImeNestedScrollConnection$imeAnimController$2() {
        super(0, SimpleImeAnimationController.class, "<init>", "<init>()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final SimpleImeAnimationController invoke() {
        return new SimpleImeAnimationController();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        return invoke();
    }
}
