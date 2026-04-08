package io.ktor.utils.p043io.pool;

import io.intercom.android.sdk.models.carousel.VerticalAlignment;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.KMutableProperty1;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18303k = 3, m18304mv = {1, 4, 2})
final /* synthetic */ class DefaultPool$Companion$Top$1 extends MutablePropertyReference1Impl {

    /* JADX INFO: renamed from: a */
    public static final KMutableProperty1 f47524a = new DefaultPool$Companion$Top$1(DefaultPool.class, VerticalAlignment.TOP, "getTop()J", 0);

    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
    public final Object get(Object obj) {
        return Long.valueOf(DefaultPool.m17574a((DefaultPool) obj));
    }
}
