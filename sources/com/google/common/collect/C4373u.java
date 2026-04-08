package com.google.common.collect;

import com.google.common.collect.TableCollectors;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* JADX INFO: renamed from: com.google.common.collect.u */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4373u implements BiConsumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42617a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Function f42618b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Function f42619c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Function f42620d;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ BinaryOperator f42621f;

    public /* synthetic */ C4373u(Function function, Function function2, Function function3, BinaryOperator binaryOperator, int i) {
        this.f42617a = i;
        this.f42618b = function;
        this.f42619c = function2;
        this.f42620d = function3;
        this.f42621f = binaryOperator;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.f42617a) {
            case 0:
                Function function = this.f42619c;
                Function function2 = this.f42620d;
                TableCollectors.m14950c(this.f42618b, function, function2, this.f42621f, (Table) obj, obj2);
                break;
            default:
                Function function3 = this.f42619c;
                Function function4 = this.f42620d;
                TableCollectors.m14948a(this.f42618b, function3, function4, this.f42621f, (TableCollectors.ImmutableTableCollectorState) obj, obj2);
                break;
        }
    }
}
