package kotlinx.serialization.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/serialization/internal/NothingSerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "kotlinx-serialization-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class NothingSerialDescriptor implements SerialDescriptor {

    /* JADX INFO: renamed from: a */
    public static final NothingSerialDescriptor f56726a = new NothingSerialDescriptor();

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: a */
    public final String getF56735a() {
        return "kotlin.Nothing";
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
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: e */
    public final int getF56737c() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: f */
    public final String mo20943f(int i) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: g */
    public final List mo20944g(int i) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: getAnnotations */
    public final List getF56625d() {
        return EmptyList.f51496a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: getKind */
    public final SerialKind getF56623b() {
        return StructureKind.OBJECT.f56645a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: h */
    public final SerialDescriptor mo20945h(int i) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    public final int hashCode() {
        return (StructureKind.OBJECT.f56645a.hashCode() * 31) - 1818355776;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: i */
    public final boolean mo20946i(int i) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: isInline */
    public final boolean getF56698l() {
        return false;
    }

    public final String toString() {
        return "NothingSerialDescriptor";
    }
}
