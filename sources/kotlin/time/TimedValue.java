package kotlin.time;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SinceKotlin
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Lkotlin/time/TimedValue;", "T", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@WasExperimental
public final /* data */ class TimedValue<T> {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimedValue)) {
            return false;
        }
        ((TimedValue) obj).getClass();
        int i = Duration.f55216d;
        return true;
    }

    public final int hashCode() {
        int i = Duration.f55216d;
        return Long.hashCode(0L);
    }

    public final String toString() {
        return "TimedValue(value=null, duration=" + ((Object) Duration.m20474i(0L)) + ')';
    }
}
