package com.google.common.collect;

import com.google.common.collect.TableCollectors;
import java.util.function.BinaryOperator;

/* JADX INFO: renamed from: com.google.common.collect.v */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4374v implements BinaryOperator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42622a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ BinaryOperator f42623b;

    public /* synthetic */ C4374v(BinaryOperator binaryOperator, int i) {
        this.f42622a = i;
        this.f42623b = binaryOperator;
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.f42622a) {
            case 0:
                return TableCollectors.m14954g(this.f42623b, (Table) obj, (Table) obj2);
            default:
                return TableCollectors.m14952e(this.f42623b, (TableCollectors.ImmutableTableCollectorState) obj, (TableCollectors.ImmutableTableCollectorState) obj2);
        }
    }
}
