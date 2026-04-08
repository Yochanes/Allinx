package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.StructureKind;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lkotlinx/serialization/json/internal/JsonPath;", "", "Tombstone", "kotlinx-serialization-json"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class JsonPath {

    /* JADX INFO: renamed from: a */
    public Object[] f56889a;

    /* JADX INFO: renamed from: b */
    public int[] f56890b;

    /* JADX INFO: renamed from: c */
    public int f56891c;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/serialization/json/internal/JsonPath$Tombstone;", "", "kotlinx-serialization-json"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class Tombstone {

        /* JADX INFO: renamed from: a */
        public static final Tombstone f56892a = new Tombstone();
    }

    /* JADX INFO: renamed from: a */
    public final String m21130a() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.f56891c + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = this.f56889a[i2];
            if (obj instanceof SerialDescriptor) {
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                if (!Intrinsics.m18594b(serialDescriptor.getF56623b(), StructureKind.LIST.f56643a)) {
                    int i3 = this.f56890b[i2];
                    if (i3 >= 0) {
                        sb.append(".");
                        sb.append(serialDescriptor.mo20943f(i3));
                    }
                } else if (this.f56890b[i2] != -1) {
                    sb.append("[");
                    sb.append(this.f56890b[i2]);
                    sb.append("]");
                }
            } else if (obj != Tombstone.f56892a) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        String string = sb.toString();
        Intrinsics.m18598f(string, "toString(...)");
        return string;
    }

    public final String toString() {
        return m21130a();
    }
}
