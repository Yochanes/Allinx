package com.google.common.util.concurrent;

import com.google.common.base.Supplier;

/* JADX INFO: renamed from: com.google.common.util.concurrent.p */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4588p implements Supplier {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42736a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f42737b;

    public /* synthetic */ C4588p(int i, int i2) {
        this.f42736a = i2;
        this.f42737b = i;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        switch (this.f42736a) {
            case 0:
                return Striped.m15093a(this.f42737b);
            default:
                return Striped.m15095c(this.f42737b);
        }
    }
}
