package io.ktor.http.cio.internals;

import io.ktor.util.InternalAPI;
import kotlin.Metadata;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@InternalAPI
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/http/cio/internals/MutableRange;", "", "ktor-http-cio"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class MutableRange {

    /* JADX INFO: renamed from: a */
    public int f45912a = 0;

    /* JADX INFO: renamed from: b */
    public int f45913b = 0;

    public final String toString() {
        StringBuilder sb = new StringBuilder("MutableRange(start=");
        sb.append(this.f45912a);
        sb.append(", end=");
        return AbstractC0000a.m17n(sb, this.f45913b, ')');
    }
}
