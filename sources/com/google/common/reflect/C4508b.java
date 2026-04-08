package com.google.common.reflect;

import com.google.common.base.Function;
import com.google.common.reflect.MutableTypeToInstanceMap;
import java.util.Map;

/* JADX INFO: renamed from: com.google.common.reflect.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4508b implements Function {
    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        return MutableTypeToInstanceMap.UnmodifiableEntry.m15064c((Map.Entry) obj);
    }
}
