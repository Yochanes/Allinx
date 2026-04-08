package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ConstantValue<T> {

    /* JADX INFO: renamed from: a */
    public final Object f54370a;

    public ConstantValue(Object obj) {
        this.f54370a = obj;
    }

    /* JADX INFO: renamed from: a */
    public abstract KotlinType mo19958a(ModuleDescriptor moduleDescriptor);

    /* JADX INFO: renamed from: b */
    public Object mo19959b() {
        return this.f54370a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        Object objMo19959b = mo19959b();
        ConstantValue constantValue = obj instanceof ConstantValue ? (ConstantValue) obj : null;
        return Intrinsics.m18594b(objMo19959b, constantValue != null ? constantValue.mo19959b() : null);
    }

    public final int hashCode() {
        Object objMo19959b = mo19959b();
        if (objMo19959b != null) {
            return objMo19959b.hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.valueOf(mo19959b());
    }
}
