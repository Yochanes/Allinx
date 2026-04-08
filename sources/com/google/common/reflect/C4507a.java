package com.google.common.reflect;

import com.google.common.base.Predicate;
import com.google.common.reflect.ClassPath;

/* JADX INFO: renamed from: com.google.common.reflect.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4507a implements Predicate {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42702a;

    public /* synthetic */ C4507a(int i) {
        this.f42702a = i;
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        switch (this.f42702a) {
            case 0:
                return ((ClassPath.ClassInfo) obj).isTopLevel();
            default:
                return ((Class) obj).isInterface();
        }
    }
}
