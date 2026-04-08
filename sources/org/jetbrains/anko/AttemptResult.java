package org.jetbrains.anko;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Lorg/jetbrains/anko/AttemptResult;", "T", "", "commons-base_release"}, m18303k = 1, m18304mv = {1, 4, 0})
public final /* data */ class AttemptResult<T> {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttemptResult)) {
            return false;
        }
        ((AttemptResult) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "AttemptResult(value=null, error=null)";
    }
}
