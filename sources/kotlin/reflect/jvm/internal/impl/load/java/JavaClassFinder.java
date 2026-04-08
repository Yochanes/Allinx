package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface JavaClassFinder {

    /* JADX INFO: compiled from: Proguard */
    public static final class Request {

        /* JADX INFO: renamed from: a */
        public final ClassId f52727a;

        /* JADX INFO: renamed from: b */
        public final byte[] f52728b;

        /* JADX INFO: renamed from: c */
        public final JavaClass f52729c;

        public Request(ClassId classId, JavaClass javaClass, int i) {
            javaClass = (i & 4) != 0 ? null : javaClass;
            this.f52727a = classId;
            this.f52728b = null;
            this.f52729c = javaClass;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Request)) {
                return false;
            }
            Request request = (Request) obj;
            return Intrinsics.m18594b(this.f52727a, request.f52727a) && Intrinsics.m18594b(this.f52728b, request.f52728b) && Intrinsics.m18594b(this.f52729c, request.f52729c);
        }

        public final int hashCode() {
            int iHashCode = this.f52727a.hashCode() * 31;
            byte[] bArr = this.f52728b;
            int iHashCode2 = (iHashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
            JavaClass javaClass = this.f52729c;
            return iHashCode2 + (javaClass != null ? javaClass.hashCode() : 0);
        }

        public final String toString() {
            return "Request(classId=" + this.f52727a + ", previouslyFoundClassFileContent=" + Arrays.toString(this.f52728b) + ", outerClass=" + this.f52729c + ')';
        }
    }
}
