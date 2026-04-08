package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension
public final class ClassLiteralValue {

    /* JADX INFO: renamed from: a */
    public final ClassId f54368a;

    /* JADX INFO: renamed from: b */
    public final int f54369b;

    public ClassLiteralValue(ClassId classId, int i) {
        this.f54368a = classId;
        this.f54369b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassLiteralValue)) {
            return false;
        }
        ClassLiteralValue classLiteralValue = (ClassLiteralValue) obj;
        return Intrinsics.m18594b(this.f54368a, classLiteralValue.f54368a) && this.f54369b == classLiteralValue.f54369b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f54369b) + (this.f54368a.hashCode() * 31);
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            i = this.f54369b;
            if (i2 >= i) {
                break;
            }
            sb.append("kotlin/Array<");
            i2++;
        }
        sb.append(this.f54368a);
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(">");
        }
        String string = sb.toString();
        Intrinsics.m18598f(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
