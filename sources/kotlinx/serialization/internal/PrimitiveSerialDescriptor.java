package kotlinx.serialization.internal;

import androidx.compose.animation.AbstractC0455a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/serialization/internal/PrimitiveSerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "kotlinx-serialization-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class PrimitiveSerialDescriptor implements SerialDescriptor {

    /* JADX INFO: renamed from: a */
    public final String f56749a;

    /* JADX INFO: renamed from: b */
    public final PrimitiveKind f56750b;

    public PrimitiveSerialDescriptor(String str, PrimitiveKind kind) {
        Intrinsics.m18599g(kind, "kind");
        this.f56749a = str;
        this.f56750b = kind;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF56755b() {
        return this.f56749a;
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
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: e */
    public final int getF56737c() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrimitiveSerialDescriptor)) {
            return false;
        }
        PrimitiveSerialDescriptor primitiveSerialDescriptor = (PrimitiveSerialDescriptor) obj;
        if (Intrinsics.m18594b(this.f56749a, primitiveSerialDescriptor.f56749a)) {
            if (Intrinsics.m18594b(this.f56750b, primitiveSerialDescriptor.f56750b)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: f */
    public final String mo20943f(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: g */
    public final List mo20944g(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: getAnnotations */
    public final List getF56625d() {
        return EmptyList.f51496a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: getKind */
    public final SerialKind getF56623b() {
        return this.f56750b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: h */
    public final SerialDescriptor mo20945h(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final int hashCode() {
        return (this.f56750b.hashCode() * 31) + this.f56749a.hashCode();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: i */
    public final boolean mo20946i(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: isInline */
    public final boolean getF56698l() {
        return false;
    }

    public final String toString() {
        return AbstractC0455a.m2241p(new StringBuilder("PrimitiveDescriptor("), this.f56749a, ')');
    }
}
