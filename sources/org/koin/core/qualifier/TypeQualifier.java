package org.koin.core.qualifier;

import androidx.compose.animation.AbstractC0455a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.koin.ext.KClassExtKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lorg/koin/core/qualifier/TypeQualifier;", "Lorg/koin/core/qualifier/Qualifier;", "koin-core"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class TypeQualifier implements Qualifier {

    /* JADX INFO: renamed from: a */
    public final KClass f58236a;

    /* JADX INFO: renamed from: b */
    public final String f58237b;

    public TypeQualifier(KClass type) {
        Intrinsics.m18599g(type, "type");
        this.f58236a = type;
        this.f58237b = KClassExtKt.m21815a(type);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && TypeQualifier.class == obj.getClass() && Intrinsics.m18594b(this.f58237b, ((TypeQualifier) obj).f58237b);
    }

    public final int hashCode() {
        return this.f58237b.hashCode();
    }

    public final String toString() {
        return AbstractC0455a.m2241p(new StringBuilder("q:'"), this.f58237b, '\'');
    }
}
