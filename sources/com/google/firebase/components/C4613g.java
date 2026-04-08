package com.google.firebase.components;

import com.google.firebase.inject.Provider;
import java.util.Collections;

/* JADX INFO: renamed from: com.google.firebase.components.g */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4613g implements Provider {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42753a;

    public /* synthetic */ C4613g(int i) {
        this.f42753a = i;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        switch (this.f42753a) {
            case 0:
                return OptionalProvider.m15119a();
            default:
                return Collections.EMPTY_SET;
        }
    }
}
