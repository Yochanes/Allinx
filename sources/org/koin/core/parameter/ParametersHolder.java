package org.koin.core.parameter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import org.koin.core.module.KoinDslMarker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@KoinDslMarker
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lorg/koin/core/parameter/ParametersHolder;", "", "koin-core"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public class ParametersHolder {

    /* JADX INFO: renamed from: a */
    public final List f58234a;

    /* JADX INFO: renamed from: b */
    public int f58235b;

    public ParametersHolder(int i, ArrayList arrayList) {
        this.f58234a = (i & 1) != 0 ? new ArrayList() : arrayList;
    }

    /* JADX INFO: renamed from: a */
    public Object mo21794a(KClass clazz) {
        Object next;
        Intrinsics.m18599g(clazz, "clazz");
        List list = this.f58234a;
        if (list.isEmpty()) {
            return null;
        }
        int i = this.f58235b;
        List list2 = this.f58234a;
        Object obj = list2.get(i);
        if (!clazz.mo18589m(obj)) {
            obj = null;
        }
        Object obj2 = obj != null ? obj : null;
        if (obj2 != null && this.f58235b < CollectionsKt.m18405F(list2)) {
            this.f58235b++;
        }
        if (obj2 != null) {
            return obj2;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (clazz.mo18589m(next)) {
                break;
            }
        }
        if (next != null) {
            return next;
        }
        return null;
    }

    public final String toString() {
        return "DefinitionParameters" + CollectionsKt.m18465x0(this.f58234a);
    }
}
