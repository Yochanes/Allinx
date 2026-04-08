package org.koin.core.definition;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;
import org.koin.ext.KClassExtKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004H\n¢\u0006\u0002\b\u0005"}, m18302d2 = {"<anonymous>", "", "T", "it", "Lkotlin/reflect/KClass;", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class BeanDefinition$toString$defOtherTypes$typesAsString$1 extends Lambda implements Function1<KClass<?>, CharSequence> {

    /* JADX INFO: renamed from: a */
    public static final BeanDefinition$toString$defOtherTypes$typesAsString$1 f58206a = new BeanDefinition$toString$defOtherTypes$typesAsString$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        KClass it = (KClass) obj;
        Intrinsics.m18599g(it, "it");
        return KClassExtKt.m21815a(it);
    }
}
