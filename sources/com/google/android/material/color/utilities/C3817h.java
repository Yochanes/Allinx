package com.google.android.material.color.utilities;

import java.util.function.Function;

/* JADX INFO: renamed from: com.google.android.material.color.utilities.h */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3817h implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42460a;

    public /* synthetic */ C3817h(int i) {
        this.f42460a = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        DynamicScheme dynamicScheme = (DynamicScheme) obj;
        switch (this.f42460a) {
            case 0:
                return MaterialDynamicColors.m14563P1(dynamicScheme);
            default:
                return MaterialDynamicColors.m14623h1(dynamicScheme);
        }
    }
}
