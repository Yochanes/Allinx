package com.google.common.reflect;

import com.google.common.base.Function;
import com.google.common.reflect.Types;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: com.google.common.reflect.c */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4509c implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Types.JavaVersion f42703a;

    public /* synthetic */ C4509c(Types.JavaVersion javaVersion) {
        this.f42703a = javaVersion;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        return this.f42703a.typeName((Type) obj);
    }
}
