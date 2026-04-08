package io.ktor.util;

import io.ktor.http.Headers;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@InternalAPI
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/util/StringValuesBuilder;", "", "ktor-utils"}, m18303k = 1, m18304mv = {1, 4, 2})
public class StringValuesBuilder {

    /* JADX INFO: renamed from: a */
    public final Map f46488a = new CaseInsensitiveMap();

    /* JADX INFO: renamed from: b */
    public boolean f46489b;

    /* JADX INFO: renamed from: a */
    public final void m17175a(String name, String value) {
        Intrinsics.m18599g(name, "name");
        Intrinsics.m18599g(value, "value");
        mo16966g(value);
        m17178d(1, name).add(value);
    }

    /* JADX INFO: renamed from: b */
    public final void m17176b(Headers stringValues) {
        Intrinsics.m18599g(stringValues, "stringValues");
        stringValues.mo16959a(new StringValuesBuilder$appendAll$1(this));
    }

    /* JADX INFO: renamed from: c */
    public final void m17177c(Iterable values, String name) {
        Intrinsics.m18599g(name, "name");
        Intrinsics.m18599g(values, "values");
        Collection collection = (Collection) (!(values instanceof Collection) ? null : values);
        List listM17178d = m17178d(collection != null ? collection.size() : 2, name);
        Iterator it = values.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            mo16966g(str);
            listM17178d.add(str);
        }
    }

    /* JADX INFO: renamed from: d */
    public final List m17178d(int i, String str) {
        if (this.f46489b) {
            throw new IllegalStateException("Cannot modify a builder when final structure has already been built");
        }
        Map map = this.f46488a;
        List list = (List) map.get(str);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList(i);
        mo16965f(str);
        map.put(str, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public final String m17179e(String name) {
        Intrinsics.m18599g(name, "name");
        List list = (List) this.f46488a.get(name);
        if (list != null) {
            return (String) kotlin.collections.CollectionsKt.m18402D(list);
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public void mo16965f(String name) {
        Intrinsics.m18599g(name, "name");
    }

    /* JADX INFO: renamed from: g */
    public void mo16966g(String value) {
        Intrinsics.m18599g(value, "value");
    }
}
