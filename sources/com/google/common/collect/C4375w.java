package com.google.common.collect;

import com.google.common.collect.ImmutableTable;
import java.util.function.BiConsumer;
import java.util.function.Function;

/* JADX INFO: renamed from: com.google.common.collect.w */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4375w implements BiConsumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Function f42624a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Function f42625b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Function f42626c;

    public /* synthetic */ C4375w(Function function, Function function2, Function function3) {
        this.f42624a = function;
        this.f42625b = function2;
        this.f42626c = function3;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        TableCollectors.m14955h(this.f42624a, this.f42625b, this.f42626c, (ImmutableTable.Builder) obj, obj2);
    }
}
