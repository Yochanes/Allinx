package kotlinx.serialization.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004"}, m18302d2 = {"Lkotlinx/serialization/internal/MapLikeDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/internal/HashMapClassDesc;", "Lkotlinx/serialization/internal/LinkedHashMapClassDesc;", "kotlinx-serialization-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public abstract class MapLikeDescriptor implements SerialDescriptor {

    /* JADX INFO: renamed from: a */
    public final String f56719a;

    /* JADX INFO: renamed from: b */
    public final SerialDescriptor f56720b;

    /* JADX INFO: renamed from: c */
    public final SerialDescriptor f56721c;

    public MapLikeDescriptor(String str, SerialDescriptor serialDescriptor, SerialDescriptor serialDescriptor2) {
        this.f56719a = str;
        this.f56720b = serialDescriptor;
        this.f56721c = serialDescriptor2;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF56719a() {
        return this.f56719a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: c */
    public final boolean mo20940c() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: d */
    public final int mo20941d(String name) {
        Intrinsics.m18599g(name, "name");
        Integer numM20428Z = StringsKt.m20428Z(name);
        if (numM20428Z != null) {
            return numM20428Z.intValue();
        }
        throw new IllegalArgumentException(name.concat(" is not a valid map index"));
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: e */
    public final int mo20942e() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapLikeDescriptor)) {
            return false;
        }
        MapLikeDescriptor mapLikeDescriptor = (MapLikeDescriptor) obj;
        return Intrinsics.m18594b(this.f56719a, mapLikeDescriptor.f56719a) && Intrinsics.m18594b(this.f56720b, mapLikeDescriptor.f56720b) && Intrinsics.m18594b(this.f56721c, mapLikeDescriptor.f56721c);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: f */
    public final String mo20943f(int i) {
        return String.valueOf(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: g */
    public final List mo20944g(int i) {
        if (i >= 0) {
            return EmptyList.f51496a;
        }
        throw new IllegalArgumentException(AbstractC0000a.m19p(AbstractC0000a.m20q(i, "Illegal index ", ", "), this.f56719a, " expects only non-negative indices").toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return EmptyList.f51496a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialKind getKind() {
        return StructureKind.MAP.f56644a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: h */
    public final SerialDescriptor mo20945h(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC0000a.m19p(AbstractC0000a.m20q(i, "Illegal index ", ", "), this.f56719a, " expects only non-negative indices").toString());
        }
        int i2 = i % 2;
        if (i2 == 0) {
            return this.f56720b;
        }
        if (i2 == 1) {
            return this.f56721c;
        }
        throw new IllegalStateException("Unreached");
    }

    public final int hashCode() {
        return this.f56721c.hashCode() + ((this.f56720b.hashCode() + (this.f56719a.hashCode() * 31)) * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: i */
    public final boolean mo20946i(int i) {
        if (i >= 0) {
            return false;
        }
        throw new IllegalArgumentException(AbstractC0000a.m19p(AbstractC0000a.m20q(i, "Illegal index ", ", "), this.f56719a, " expects only non-negative indices").toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return this.f56719a + '(' + this.f56720b + ", " + this.f56721c + ')';
    }
}
