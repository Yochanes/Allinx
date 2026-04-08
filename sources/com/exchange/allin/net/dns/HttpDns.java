package com.exchange.allin.net.dns;

import androidx.compose.runtime.internal.StabilityInferred;
import java.net.InetAddress;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Dns;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/net/dns/HttpDns;", "Lokhttp3/Dns;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class HttpDns implements Dns {
    @Override // okhttp3.Dns
    /* JADX INFO: renamed from: a */
    public final List mo13381a(String hostname) {
        Intrinsics.m18599g(hostname, "hostname");
        try {
            return CollectionsKt.m18413N(InetAddress.getByName(hostname));
        } catch (Exception e) {
            e.printStackTrace();
            return Dns.f57092a.mo13381a(hostname);
        }
    }
}
