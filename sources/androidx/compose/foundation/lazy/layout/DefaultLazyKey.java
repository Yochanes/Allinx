package androidx.compose.foundation.lazy.layout;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0083\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;", "Landroid/os/Parcelable;", "Companion", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SuppressLint({"BanParcelableUsage"})
final /* data */ class DefaultLazyKey implements Parcelable {

    @JvmField
    @NotNull
    public static final Parcelable.Creator<DefaultLazyKey> CREATOR = new DefaultLazyKey$Companion$CREATOR$1();

    /* JADX INFO: renamed from: a */
    public final int f7184a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/lazy/layout/DefaultLazyKey$Companion;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public DefaultLazyKey(int i) {
        this.f7184a = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DefaultLazyKey) && this.f7184a == ((DefaultLazyKey) obj).f7184a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7184a);
    }

    public final String toString() {
        return AbstractC0000a.m17n(new StringBuilder("DefaultLazyKey(index="), this.f7184a, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7184a);
    }
}
