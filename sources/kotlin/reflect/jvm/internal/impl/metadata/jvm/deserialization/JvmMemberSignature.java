package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class JvmMemberSignature {

    /* JADX INFO: compiled from: Proguard */
    public static final class Field extends JvmMemberSignature {

        /* JADX INFO: renamed from: a */
        public final String f54010a;

        /* JADX INFO: renamed from: b */
        public final String f54011b;

        public Field(String name, String desc) {
            Intrinsics.m18599g(name, "name");
            Intrinsics.m18599g(desc, "desc");
            this.f54010a = name;
            this.f54011b = desc;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature
        /* JADX INFO: renamed from: a */
        public final String mo19564a() {
            return this.f54010a + ':' + this.f54011b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Field)) {
                return false;
            }
            Field field = (Field) obj;
            return Intrinsics.m18594b(this.f54010a, field.f54010a) && Intrinsics.m18594b(this.f54011b, field.f54011b);
        }

        public final int hashCode() {
            return this.f54011b.hashCode() + (this.f54010a.hashCode() * 31);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Method extends JvmMemberSignature {

        /* JADX INFO: renamed from: a */
        public final String f54012a;

        /* JADX INFO: renamed from: b */
        public final String f54013b;

        public Method(String name, String desc) {
            Intrinsics.m18599g(name, "name");
            Intrinsics.m18599g(desc, "desc");
            this.f54012a = name;
            this.f54013b = desc;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature
        /* JADX INFO: renamed from: a */
        public final String mo19564a() {
            return this.f54012a + this.f54013b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Method)) {
                return false;
            }
            Method method = (Method) obj;
            return Intrinsics.m18594b(this.f54012a, method.f54012a) && Intrinsics.m18594b(this.f54013b, method.f54013b);
        }

        public final int hashCode() {
            return this.f54013b.hashCode() + (this.f54012a.hashCode() * 31);
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract String mo19564a();

    public final String toString() {
        return mo19564a();
    }
}
