package coil.memory;

import android.os.Parcel;
import android.os.Parcelable;
import coil.memory.MemoryCache;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"coil/memory/MemoryCache$Key$Companion$CREATOR$1", "Landroid/os/Parcelable$Creator;", "Lcoil/memory/MemoryCache$Key;", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class MemoryCache$Key$Companion$CREATOR$1 implements Parcelable.Creator<MemoryCache.Key> {
    @Override // android.os.Parcelable.Creator
    public final MemoryCache.Key createFromParcel(Parcel parcel) {
        String string = parcel.readString();
        Intrinsics.m18596d(string);
        int i = parcel.readInt();
        LinkedHashMap linkedHashMap = new LinkedHashMap(i);
        for (int i2 = 0; i2 < i; i2++) {
            String string2 = parcel.readString();
            Intrinsics.m18596d(string2);
            String string3 = parcel.readString();
            Intrinsics.m18596d(string3);
            linkedHashMap.put(string2, string3);
        }
        return new MemoryCache.Key(string, linkedHashMap);
    }

    @Override // android.os.Parcelable.Creator
    public final MemoryCache.Key[] newArray(int i) {
        return new MemoryCache.Key[i];
    }
}
