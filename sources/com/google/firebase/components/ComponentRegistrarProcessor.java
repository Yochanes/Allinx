package com.google.firebase.components;

import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public interface ComponentRegistrarProcessor {
    public static final ComponentRegistrarProcessor NOOP = new C4612f();

    List<Component<?>> processRegistrar(ComponentRegistrar componentRegistrar);
}
