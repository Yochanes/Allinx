package io.ktor.util;

import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@InternalAPI
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/util/StringValuesSingleImpl;", "Lio/ktor/util/StringValues;", "ktor-utils"}, m18303k = 1, m18304mv = {1, 4, 2})
public class StringValuesSingleImpl implements StringValues {

    /* JADX INFO: renamed from: io.ktor.util.StringValuesSingleImpl$entries$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030\u0001¨\u0006\u0004"}, m18302d2 = {"io/ktor/util/StringValuesSingleImpl$entries$1", "", "", "", "ktor-utils"}, m18303k = 1, m18304mv = {1, 4, 2})
    public final class C59381 implements Map.Entry<String, List<? extends String>>, KMappedMarker {
        @Override // java.util.Map.Entry
        public final /* bridge */ /* synthetic */ String getKey() {
            return null;
        }

        @Override // java.util.Map.Entry
        public final /* bridge */ /* synthetic */ List<? extends String> getValue() {
            return null;
        }

        @Override // java.util.Map.Entry
        public final /* synthetic */ List<? extends String> setValue(List<? extends String> list) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final String toString() {
            return "null=null";
        }
    }

    @Override // io.ktor.util.StringValues
    /* JADX INFO: renamed from: a */
    public final void mo16959a(Function2 function2) {
        function2.invoke(null, null);
    }

    @Override // io.ktor.util.StringValues
    /* JADX INFO: renamed from: b */
    public final boolean getF46492d() {
        return false;
    }

    @Override // io.ktor.util.StringValues
    /* JADX INFO: renamed from: c */
    public final List mo16961c(String name) {
        Intrinsics.m18599g(name, "name");
        return null;
    }

    @Override // io.ktor.util.StringValues
    public final Set entries() {
        return SetsKt.m18503g(new C59381());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StringValues)) {
            return false;
        }
        StringValues stringValues = (StringValues) obj;
        if (stringValues.getF46492d()) {
            return false;
        }
        return entries().equals(stringValues.entries());
    }

    @Override // io.ktor.util.StringValues
    public final String get(String name) {
        Intrinsics.m18599g(name, "name");
        if (!name.equals(null)) {
            return null;
        }
        kotlin.collections.CollectionsKt.m18402D(null);
        throw null;
    }

    public final int hashCode() {
        Set setEntries = entries();
        return setEntries.hashCode() + (Boolean.FALSE.hashCode() * 961);
    }

    @Override // io.ktor.util.StringValues
    public final boolean isEmpty() {
        return false;
    }

    public String toString() {
        return "StringValues(case=true) " + entries();
    }
}
