package org.koin.core.definition;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.koin.core.qualifier.Qualifier;
import org.koin.ext.KClassExtKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*>\u0010\u0005\u001a\u0004\b\u0000\u0010\u0000\"\u0019\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0002\b\u00042\u0019\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0002\b\u0004*\n\u0010\u0007\"\u00020\u00062\u00020\u0006¨\u0006\b"}, m18302d2 = {"T", "Lkotlin/Function2;", "Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "Lkotlin/ExtensionFunctionType;", "Definition", "", "IndexKey", "koin-core"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class BeanDefinitionKt {
    /* JADX INFO: renamed from: a */
    public static final String m21803a(KClass clazz, Qualifier scopeQualifier) {
        Intrinsics.m18599g(clazz, "clazz");
        Intrinsics.m18599g(scopeQualifier, "scopeQualifier");
        return KClassExtKt.m21815a(clazz) + "::" + scopeQualifier;
    }
}
