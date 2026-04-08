package kotlin.reflect.jvm.internal.impl.load.kotlin;

import androidx.compose.animation.AbstractC0455a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MemberSignature {

    /* JADX INFO: renamed from: a */
    public final String f53272a;

    /* JADX INFO: compiled from: Proguard */
    public static final class Companion {
        /* JADX INFO: renamed from: a */
        public static MemberSignature m19397a(String name, String desc) {
            Intrinsics.m18599g(name, "name");
            Intrinsics.m18599g(desc, "desc");
            return new MemberSignature(name + '#' + desc);
        }

        /* JADX INFO: renamed from: b */
        public static MemberSignature m19398b(JvmMemberSignature jvmMemberSignature) {
            if (jvmMemberSignature instanceof JvmMemberSignature.Method) {
                JvmMemberSignature.Method method = (JvmMemberSignature.Method) jvmMemberSignature;
                return m19400d(method.f54012a, method.f54013b);
            }
            if (!(jvmMemberSignature instanceof JvmMemberSignature.Field)) {
                throw new NoWhenBranchMatchedException();
            }
            JvmMemberSignature.Field field = (JvmMemberSignature.Field) jvmMemberSignature;
            return m19397a(field.f54010a, field.f54011b);
        }

        /* JADX INFO: renamed from: c */
        public static MemberSignature m19399c(NameResolver nameResolver, JvmProtoBuf.JvmMethodSignature jvmMethodSignature) {
            Intrinsics.m18599g(nameResolver, "nameResolver");
            return m19400d(nameResolver.getString(jvmMethodSignature.f53946c), nameResolver.getString(jvmMethodSignature.f53947d));
        }

        /* JADX INFO: renamed from: d */
        public static MemberSignature m19400d(String name, String desc) {
            Intrinsics.m18599g(name, "name");
            Intrinsics.m18599g(desc, "desc");
            return new MemberSignature(name.concat(desc));
        }

        /* JADX INFO: renamed from: e */
        public static MemberSignature m19401e(MemberSignature memberSignature, int i) {
            return new MemberSignature(memberSignature.f53272a + '@' + i);
        }
    }

    public MemberSignature(String str) {
        this.f53272a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MemberSignature) && Intrinsics.m18594b(this.f53272a, ((MemberSignature) obj).f53272a);
    }

    public final int hashCode() {
        return this.f53272a.hashCode();
    }

    public final String toString() {
        return AbstractC0455a.m2241p(new StringBuilder("MemberSignature(signature="), this.f53272a, ')');
    }
}
