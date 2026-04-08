package io.ktor.util;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@InternalAPI
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/util/StringValuesImpl;", "Lio/ktor/util/StringValues;", "ktor-utils"}, m18303k = 1, m18304mv = {1, 4, 2})
public class StringValuesImpl implements StringValues {

    /* JADX INFO: renamed from: c */
    public final Lazy f46491c;

    /* JADX INFO: renamed from: d */
    public final boolean f46492d;

    public StringValuesImpl(Map values, boolean z2) {
        Intrinsics.m18599g(values, "values");
        this.f46492d = z2;
        this.f46491c = LazyKt.m18299b(new StringValuesImpl$values$2(this, values));
    }

    @Override // io.ktor.util.StringValues
    /* JADX INFO: renamed from: a */
    public final void mo16959a(Function2 function2) {
        for (Map.Entry entry : ((Map) this.f46491c.getValue()).entrySet()) {
            function2.invoke((String) entry.getKey(), (List) entry.getValue());
        }
    }

    @Override // io.ktor.util.StringValues
    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getF46492d() {
        return this.f46492d;
    }

    @Override // io.ktor.util.StringValues
    /* JADX INFO: renamed from: c */
    public final List mo16961c(String name) {
        Intrinsics.m18599g(name, "name");
        return (List) ((Map) this.f46491c.getValue()).get(name);
    }

    @Override // io.ktor.util.StringValues
    public final Set entries() {
        Set unmodifiable = ((Map) this.f46491c.getValue()).entrySet();
        Intrinsics.m18599g(unmodifiable, "$this$unmodifiable");
        Set setUnmodifiableSet = Collections.unmodifiableSet(unmodifiable);
        Intrinsics.m18598f(setUnmodifiableSet, "Collections.unmodifiableSet(this)");
        return setUnmodifiableSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StringValues)) {
            return false;
        }
        StringValues stringValues = (StringValues) obj;
        if (this.f46492d != stringValues.getF46492d()) {
            return false;
        }
        return entries().equals(stringValues.entries());
    }

    @Override // io.ktor.util.StringValues
    public final String get(String name) {
        Intrinsics.m18599g(name, "name");
        List list = (List) ((Map) this.f46491c.getValue()).get(name);
        if (list != null) {
            return (String) kotlin.collections.CollectionsKt.m18402D(list);
        }
        return null;
    }

    public final int hashCode() {
        Set setEntries = entries();
        return setEntries.hashCode() + (Boolean.valueOf(this.f46492d).hashCode() * 961);
    }

    @Override // io.ktor.util.StringValues
    public final boolean isEmpty() {
        return ((Map) this.f46491c.getValue()).isEmpty();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StringValues(case=");
        sb.append(!this.f46492d);
        sb.append(") ");
        sb.append(entries());
        return sb.toString();
    }
}
