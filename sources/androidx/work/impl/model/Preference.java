package androidx.work.impl.model;

import androidx.annotation.RestrictTo;
import androidx.room.Entity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Entity
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/work/impl/model/Preference;", "", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@RestrictTo
public final /* data */ class Preference {

    /* JADX INFO: renamed from: a */
    public final String f32989a;

    /* JADX INFO: renamed from: b */
    public final Long f32990b;

    public Preference(String str, Long l) {
        this.f32989a = str;
        this.f32990b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Preference)) {
            return false;
        }
        Preference preference = (Preference) obj;
        return Intrinsics.m18594b(this.f32989a, preference.f32989a) && Intrinsics.m18594b(this.f32990b, preference.f32990b);
    }

    public final int hashCode() {
        int iHashCode = this.f32989a.hashCode() * 31;
        Long l = this.f32990b;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "Preference(key=" + this.f32989a + ", value=" + this.f32990b + ')';
    }
}
