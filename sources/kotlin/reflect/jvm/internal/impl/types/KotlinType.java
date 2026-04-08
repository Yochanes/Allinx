package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.checker.SimpleClassicTypeSystemContext;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class KotlinType implements Annotated, KotlinTypeMarker {

    /* JADX INFO: renamed from: a */
    public int f54824a;

    /* JADX INFO: renamed from: G0 */
    public abstract List mo19951G0();

    /* JADX INFO: renamed from: H0 */
    public abstract TypeAttributes mo19952H0();

    /* JADX INFO: renamed from: I0 */
    public abstract TypeConstructor mo19953I0();

    /* JADX INFO: renamed from: J0 */
    public abstract boolean mo19323J0();

    /* JADX INFO: renamed from: K0 */
    public abstract KotlinType mo19302K0(KotlinTypeRefiner kotlinTypeRefiner);

    /* JADX INFO: renamed from: L0 */
    public abstract UnwrappedType mo20144L0();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KotlinType)) {
            return false;
        }
        KotlinType kotlinType = (KotlinType) obj;
        if (mo19323J0() == kotlinType.mo19323J0()) {
            return AbstractStrictEqualityTypeChecker.m20106b(SimpleClassicTypeSystemContext.f54929a, mo20144L0(), kotlinType.mo20144L0());
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public final Annotations getAnnotations() {
        return AnnotationsTypeAttributeKt.m20123a(mo19952H0());
    }

    public final int hashCode() {
        int iHashCode;
        int i = this.f54824a;
        if (i != 0) {
            return i;
        }
        if (KotlinTypeKt.m20151a(this)) {
            iHashCode = super.hashCode();
        } else {
            iHashCode = (mo19323J0() ? 1 : 0) + ((mo19951G0().hashCode() + (mo19953I0().hashCode() * 31)) * 31);
        }
        this.f54824a = iHashCode;
        return iHashCode;
    }

    /* JADX INFO: renamed from: o */
    public abstract MemberScope mo19309o();
}
