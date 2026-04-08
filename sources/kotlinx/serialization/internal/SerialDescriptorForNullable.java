package kotlinx.serialization.internal;

import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Lkotlinx/serialization/internal/SerialDescriptorForNullable;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/internal/CachedNames;", "kotlinx-serialization-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class SerialDescriptorForNullable implements SerialDescriptor, CachedNames {

    /* JADX INFO: renamed from: a */
    public final SerialDescriptor f56754a;

    /* JADX INFO: renamed from: b */
    public final String f56755b;

    /* JADX INFO: renamed from: c */
    public final Set f56756c;

    public SerialDescriptorForNullable(SerialDescriptor original) {
        Intrinsics.m18599g(original, "original");
        this.f56754a = original;
        this.f56755b = original.getF56755b() + '?';
        this.f56756c = Platform_commonKt.m21017a(original);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF56755b() {
        return this.f56755b;
    }

    @Override // kotlinx.serialization.internal.CachedNames
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Set getF56756c() {
        return this.f56756c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: c */
    public final boolean mo20940c() {
        return true;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: d */
    public final int mo20941d(String name) {
        Intrinsics.m18599g(name, "name");
        return this.f56754a.mo20941d(name);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: e */
    public final int getF56737c() {
        return this.f56754a.getF56737c();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SerialDescriptorForNullable) {
            return Intrinsics.m18594b(this.f56754a, ((SerialDescriptorForNullable) obj).f56754a);
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: f */
    public final String mo20943f(int i) {
        return this.f56754a.mo20943f(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: g */
    public final List mo20944g(int i) {
        return this.f56754a.mo20944g(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: getAnnotations */
    public final List getF56625d() {
        return this.f56754a.getF56625d();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: getKind */
    public final SerialKind getF56623b() {
        return this.f56754a.getF56623b();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: h */
    public final SerialDescriptor mo20945h(int i) {
        return this.f56754a.mo20945h(i);
    }

    public final int hashCode() {
        return this.f56754a.hashCode() * 31;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: i */
    public final boolean mo20946i(int i) {
        return this.f56754a.mo20946i(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: isInline */
    public final boolean getF56698l() {
        return this.f56754a.getF56698l();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f56754a);
        sb.append('?');
        return sb.toString();
    }
}
