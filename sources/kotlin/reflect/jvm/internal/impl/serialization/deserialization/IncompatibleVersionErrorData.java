package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class IncompatibleVersionErrorData<T> {

    /* JADX INFO: renamed from: a */
    public final JvmMetadataVersion f54562a;

    /* JADX INFO: renamed from: b */
    public final JvmMetadataVersion f54563b;

    /* JADX INFO: renamed from: c */
    public final JvmMetadataVersion f54564c;

    /* JADX INFO: renamed from: d */
    public final JvmMetadataVersion f54565d;

    /* JADX INFO: renamed from: e */
    public final String f54566e;

    /* JADX INFO: renamed from: f */
    public final ClassId f54567f;

    public IncompatibleVersionErrorData(JvmMetadataVersion jvmMetadataVersion, JvmMetadataVersion jvmMetadataVersion2, JvmMetadataVersion jvmMetadataVersion3, JvmMetadataVersion jvmMetadataVersion4, String filePath, ClassId classId) {
        Intrinsics.m18599g(filePath, "filePath");
        Intrinsics.m18599g(classId, "classId");
        this.f54562a = jvmMetadataVersion;
        this.f54563b = jvmMetadataVersion2;
        this.f54564c = jvmMetadataVersion3;
        this.f54565d = jvmMetadataVersion4;
        this.f54566e = filePath;
        this.f54567f = classId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IncompatibleVersionErrorData)) {
            return false;
        }
        IncompatibleVersionErrorData incompatibleVersionErrorData = (IncompatibleVersionErrorData) obj;
        return this.f54562a.equals(incompatibleVersionErrorData.f54562a) && Intrinsics.m18594b(this.f54563b, incompatibleVersionErrorData.f54563b) && Intrinsics.m18594b(this.f54564c, incompatibleVersionErrorData.f54564c) && this.f54565d.equals(incompatibleVersionErrorData.f54565d) && Intrinsics.m18594b(this.f54566e, incompatibleVersionErrorData.f54566e) && Intrinsics.m18594b(this.f54567f, incompatibleVersionErrorData.f54567f);
    }

    public final int hashCode() {
        int iHashCode = this.f54562a.hashCode() * 31;
        JvmMetadataVersion jvmMetadataVersion = this.f54563b;
        int iHashCode2 = (iHashCode + (jvmMetadataVersion == null ? 0 : jvmMetadataVersion.hashCode())) * 31;
        JvmMetadataVersion jvmMetadataVersion2 = this.f54564c;
        return this.f54567f.hashCode() + AbstractC0000a.m5b((this.f54565d.hashCode() + ((iHashCode2 + (jvmMetadataVersion2 != null ? jvmMetadataVersion2.hashCode() : 0)) * 31)) * 31, 31, this.f54566e);
    }

    public final String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.f54562a + ", compilerVersion=" + this.f54563b + ", languageVersion=" + this.f54564c + ", expectedVersion=" + this.f54565d + ", filePath=" + this.f54566e + ", classId=" + this.f54567f + ')';
    }
}
