package io.ktor.util;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/util/AttributeKey;", "T", "", "ktor-utils"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class AttributeKey<T> {

    /* JADX INFO: renamed from: a */
    public final String f46418a;

    public AttributeKey(String str) {
        this.f46418a = str;
    }

    public final String toString() {
        String str = this.f46418a;
        if (str.length() == 0) {
            return super.toString();
        }
        return "AttributeKey: " + str;
    }
}
