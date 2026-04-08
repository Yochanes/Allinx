package org.burnoutcrew.reorderable;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18302d2 = {"<anonymous>", "", "T", "invoke", "()Ljava/lang/Boolean;"}, m18303k = 3, m18304mv = {1, 7, 1}, m18306xi = 48)
final class ReorderableState$visibleItemsChanged$1 extends Lambda implements Function0<Boolean> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ReorderableState f58139a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReorderableState$visibleItemsChanged$1(ReorderableState reorderableState) {
        super(0);
        this.f58139a = reorderableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Boolean.valueOf(this.f58139a.m21775f() != null);
    }
}
