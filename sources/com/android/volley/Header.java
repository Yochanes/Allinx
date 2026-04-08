package com.android.volley;

import android.text.TextUtils;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class Header {

    /* JADX INFO: renamed from: a */
    public final String f34930a;

    /* JADX INFO: renamed from: b */
    public final String f34931b;

    public Header(String str, String str2) {
        this.f34930a = str;
        this.f34931b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Header.class == obj.getClass()) {
            Header header = (Header) obj;
            if (TextUtils.equals(this.f34930a, header.f34930a) && TextUtils.equals(this.f34931b, header.f34931b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f34931b.hashCode() + (this.f34930a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Header[name=");
        sb.append(this.f34930a);
        sb.append(",value=");
        return AbstractC0000a.m19p(sb, this.f34931b, "]");
    }
}
