package coil.memory;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, m18302d2 = {"Lcoil/memory/MemoryCache;", "", "Key", "Value", "Builder", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public interface MemoryCache {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcoil/memory/MemoryCache$Builder;", "", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class Builder {

        /* JADX INFO: renamed from: a */
        public double f33753a;

        /* JADX INFO: renamed from: b */
        public boolean f33754b;
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcoil/memory/MemoryCache$Value;", "", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class Value {

        /* JADX INFO: renamed from: a */
        public final Bitmap f33757a;

        /* JADX INFO: renamed from: b */
        public final Map f33758b;

        public Value(Bitmap bitmap, Map map) {
            this.f33757a = bitmap;
            this.f33758b = map;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Value)) {
                return false;
            }
            Value value = (Value) obj;
            return Intrinsics.m18594b(this.f33757a, value.f33757a) && Intrinsics.m18594b(this.f33758b, value.f33758b);
        }

        public final int hashCode() {
            return this.f33758b.hashCode() + (this.f33757a.hashCode() * 31);
        }

        public final String toString() {
            return "Value(bitmap=" + this.f33757a + ", extras=" + this.f33758b + ')';
        }
    }

    /* JADX INFO: renamed from: a */
    Value mo12481a(Key key);

    /* JADX INFO: renamed from: b */
    void mo12482b(int i);

    /* JADX INFO: renamed from: c */
    void mo12483c(Key key, Value value);

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lcoil/memory/MemoryCache$Key;", "Landroid/os/Parcelable;", "Companion", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class Key implements Parcelable {

        @JvmField
        @Deprecated
        @NotNull
        public static final Parcelable.Creator<Key> CREATOR = new MemoryCache$Key$Companion$CREATOR$1();

        /* JADX INFO: renamed from: a */
        public final String f33755a;

        /* JADX INFO: renamed from: b */
        public final Map f33756b;

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m18302d2 = {"Lcoil/memory/MemoryCache$Key$Companion;", "", "Landroid/os/Parcelable$Creator;", "Lcoil/memory/MemoryCache$Key;", "CREATOR", "Landroid/os/Parcelable$Creator;", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
        public static final class Companion {
        }

        public Key(String str, Map map) {
            this.f33755a = str;
            this.f33756b = map;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Key)) {
                return false;
            }
            Key key = (Key) obj;
            return Intrinsics.m18594b(this.f33755a, key.f33755a) && Intrinsics.m18594b(this.f33756b, key.f33756b);
        }

        public final int hashCode() {
            return this.f33756b.hashCode() + (this.f33755a.hashCode() * 31);
        }

        public final String toString() {
            return "Key(key=" + this.f33755a + ", extras=" + this.f33756b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f33755a);
            Map map = this.f33756b;
            parcel.writeInt(map.size());
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                parcel.writeString(str);
                parcel.writeString(str2);
            }
        }

        public /* synthetic */ Key(String str) {
            this(str, MapsKt.m18481d());
        }
    }
}
