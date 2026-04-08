package com.google.common.collect;

import java.util.Collection;
import java.util.function.Consumer;

/* JADX INFO: renamed from: com.google.common.collect.j */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4362j implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Collection f42602a;

    public /* synthetic */ C4362j(Collection collection) {
        this.f42602a = collection;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f42602a.add(obj);
    }
}
