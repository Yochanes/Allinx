package io.ktor.network.tls;

import io.ktor.util.InternalAPI;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@InternalAPI
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/network/tls/OID;", "", "Companion", "ktor-network-tls"}, m18303k = 1, m18304mv = {1, 4, 2})
public final /* data */ class OID {

    /* JADX INFO: renamed from: b */
    public static final OID f46148b;

    /* JADX INFO: renamed from: c */
    public static final OID f46149c;

    /* JADX INFO: renamed from: d */
    public static final OID f46150d;

    /* JADX INFO: renamed from: e */
    public static final OID f46151e;

    /* JADX INFO: renamed from: f */
    public static final OID f46152f;

    /* JADX INFO: renamed from: g */
    public static final OID f46153g;

    /* JADX INFO: renamed from: a */
    public final String f46154a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/network/tls/OID$Companion;", "", "ktor-network-tls"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Companion {
    }

    static {
        new OID("2.5.4.10");
        new OID("2.5.4.11");
        new OID("2.5.4.6");
        new OID("2.5.4.3");
        new OID("2.5.29.17");
        new OID("1 2 840 113549 1 1 1");
        new OID("1.2.840.10045.2.1");
        f46148b = new OID("1.2.840.10045.4.3.3");
        f46149c = new OID("1.2.840.10045.4.3.2");
        f46150d = new OID("1.2.840.113549.1.1.13");
        f46151e = new OID("1.2.840.113549.1.1.12");
        f46152f = new OID("1.2.840.113549.1.1.11");
        f46153g = new OID("1.2.840.113549.1.1.5");
        new OID("1.2.840.10045.3.1.7");
    }

    public OID(String str) {
        this.f46154a = str;
        List<String> listM20413K = StringsKt.m20413K(str, new String[]{".", " "}, 6);
        ArrayList arrayList = new ArrayList(CollectionsKt.m18452r(listM20413K, 10));
        for (String str2 : listM20413K) {
            if (str2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            }
            arrayList.add(Integer.valueOf(Integer.parseInt(StringsKt.m20430b0(str2).toString())));
        }
        CollectionsKt.m18463w0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof OID) && Intrinsics.m18594b(this.f46154a, ((OID) obj).f46154a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f46154a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return AbstractC0000a.m19p(new StringBuilder("OID(identifier="), this.f46154a, ")");
    }
}
