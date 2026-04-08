package io.ktor.util;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/util/Attributes;", "", "ktor-utils"}, m18303k = 1, m18304mv = {1, 4, 2})
public interface Attributes {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18300bv = {1, 0, 3}, m18303k = 3, m18304mv = {1, 4, 2})
    public static final class DefaultImpls {
    }

    /* JADX INFO: renamed from: a */
    List mo17154a();

    /* JADX INFO: renamed from: b */
    boolean mo17155b(AttributeKey attributeKey);

    /* JADX INFO: renamed from: c */
    Object mo17156c(AttributeKey attributeKey);

    /* JADX INFO: renamed from: d */
    Object mo17157d(AttributeKey attributeKey);

    /* JADX INFO: renamed from: e */
    Object mo17158e(AttributeKey attributeKey, Function0 function0);

    /* JADX INFO: renamed from: f */
    void mo17159f(AttributeKey attributeKey, Object obj);
}
