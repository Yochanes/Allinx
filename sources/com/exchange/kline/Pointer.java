package com.exchange.kline;

import kotlin.Metadata;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/kline/Pointer;", "", "kline_release"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class Pointer {

    /* JADX INFO: renamed from: a */
    public float f42109a;

    /* JADX INFO: renamed from: b */
    public float f42110b;

    public final String toString() {
        StringBuilder sb = new StringBuilder("Pointer{x=");
        sb.append(this.f42109a);
        sb.append(", y=");
        return AbstractC0000a.m16m(sb, this.f42110b, '}');
    }
}
