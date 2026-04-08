package kotlinx.serialization.descriptors;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/serialization/descriptors/ContextDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "kotlinx-serialization-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
final class ContextDescriptor implements SerialDescriptor {

    /* JADX INFO: renamed from: a */
    public final SerialDescriptorImpl f56608a;

    /* JADX INFO: renamed from: b */
    public final KClass f56609b;

    /* JADX INFO: renamed from: c */
    public final String f56610c;

    public ContextDescriptor(SerialDescriptorImpl serialDescriptorImpl, KClass kClass) {
        Intrinsics.m18599g(kClass, "kClass");
        this.f56608a = serialDescriptorImpl;
        this.f56609b = kClass;
        this.f56610c = serialDescriptorImpl.f56622a + '<' + kClass.mo18588i() + '>';
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF56610c() {
        return this.f56610c;
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
        return this.f56608a.mo20941d(name);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: e */
    public final int getF56624c() {
        return this.f56608a.f56624c;
    }

    public final boolean equals(Object obj) {
        ContextDescriptor contextDescriptor = obj instanceof ContextDescriptor ? (ContextDescriptor) obj : null;
        return contextDescriptor != null && this.f56608a.equals(contextDescriptor.f56608a) && Intrinsics.m18594b(contextDescriptor.f56609b, this.f56609b);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: f */
    public final String mo20943f(int i) {
        return this.f56608a.f56627f[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: g */
    public final List mo20944g(int i) {
        return this.f56608a.f56629h[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: getAnnotations */
    public final List getF56625d() {
        return this.f56608a.f56625d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: getKind */
    public final SerialKind getF56623b() {
        return this.f56608a.f56623b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: h */
    public final SerialDescriptor mo20945h(int i) {
        return this.f56608a.f56628g[i];
    }

    public final int hashCode() {
        return this.f56610c.hashCode() + (this.f56609b.hashCode() * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: i */
    public final boolean mo20946i(int i) {
        return this.f56608a.f56630i[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: isInline */
    public final boolean getF56698l() {
        return false;
    }

    public final String toString() {
        return "ContextDescriptor(kClass: " + this.f56609b + ", original: " + this.f56608a + ')';
    }
}
