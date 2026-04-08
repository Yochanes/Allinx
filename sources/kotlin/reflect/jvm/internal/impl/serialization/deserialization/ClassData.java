package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ClassData {

    /* JADX INFO: renamed from: a */
    public final NameResolver f54511a;

    /* JADX INFO: renamed from: b */
    public final ProtoBuf.Class f54512b;

    /* JADX INFO: renamed from: c */
    public final BinaryVersion f54513c;

    /* JADX INFO: renamed from: d */
    public final SourceElement f54514d;

    public ClassData(NameResolver nameResolver, ProtoBuf.Class classProto, BinaryVersion binaryVersion, SourceElement sourceElement) {
        Intrinsics.m18599g(nameResolver, "nameResolver");
        Intrinsics.m18599g(classProto, "classProto");
        Intrinsics.m18599g(sourceElement, "sourceElement");
        this.f54511a = nameResolver;
        this.f54512b = classProto;
        this.f54513c = binaryVersion;
        this.f54514d = sourceElement;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassData)) {
            return false;
        }
        ClassData classData = (ClassData) obj;
        return Intrinsics.m18594b(this.f54511a, classData.f54511a) && Intrinsics.m18594b(this.f54512b, classData.f54512b) && Intrinsics.m18594b(this.f54513c, classData.f54513c) && Intrinsics.m18594b(this.f54514d, classData.f54514d);
    }

    public final int hashCode() {
        return this.f54514d.hashCode() + ((this.f54513c.hashCode() + ((this.f54512b.hashCode() + (this.f54511a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ClassData(nameResolver=" + this.f54511a + ", classProto=" + this.f54512b + ", metadataVersion=" + this.f54513c + ", sourceElement=" + this.f54514d + ')';
    }
}
