package io.ktor.util;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\"\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/util/AttributesJvmBase;", "Lio/ktor/util/Attributes;", "ktor-utils"}, m18303k = 1, m18304mv = {1, 4, 2})
abstract class AttributesJvmBase implements Attributes {
    @Override // io.ktor.util.Attributes
    /* JADX INFO: renamed from: a */
    public final List mo17154a() {
        return kotlin.collections.CollectionsKt.m18465x0(mo17160g().keySet());
    }

    @Override // io.ktor.util.Attributes
    /* JADX INFO: renamed from: b */
    public final boolean mo17155b(AttributeKey key) {
        Intrinsics.m18599g(key, "key");
        return mo17160g().containsKey(key);
    }

    @Override // io.ktor.util.Attributes
    /* JADX INFO: renamed from: c */
    public final Object mo17156c(AttributeKey key) {
        Intrinsics.m18599g(key, "key");
        Object objMo17157d = mo17157d(key);
        if (objMo17157d != null) {
            return objMo17157d;
        }
        throw new IllegalStateException("No instance for key " + key);
    }

    @Override // io.ktor.util.Attributes
    /* JADX INFO: renamed from: d */
    public final Object mo17157d(AttributeKey key) {
        Intrinsics.m18599g(key, "key");
        return mo17160g().get(key);
    }

    @Override // io.ktor.util.Attributes
    /* JADX INFO: renamed from: f */
    public final void mo17159f(AttributeKey key, Object value) {
        Intrinsics.m18599g(key, "key");
        Intrinsics.m18599g(value, "value");
        mo17160g().put(key, value);
    }

    /* JADX INFO: renamed from: g */
    public abstract Map mo17160g();
}
