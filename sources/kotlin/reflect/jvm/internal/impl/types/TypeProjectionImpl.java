package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class TypeProjectionImpl extends TypeProjectionBase {

    /* JADX INFO: renamed from: a */
    public final Variance f54877a;

    /* JADX INFO: renamed from: b */
    public final KotlinType f54878b;

    public TypeProjectionImpl(KotlinType kotlinType, Variance variance) {
        if (variance == null) {
            m20184d(0);
            throw null;
        }
        if (kotlinType == null) {
            m20184d(1);
            throw null;
        }
        this.f54877a = variance;
        this.f54878b = kotlinType;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m20184d(int i) {
        String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5) ? 2 : 3];
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "type";
                break;
            case 4:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case 6:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i == 3) {
            objArr[2] = "replaceType";
        } else if (i != 4 && i != 5) {
            if (i != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    /* JADX INFO: renamed from: a */
    public final Variance mo20158a() {
        Variance variance = this.f54877a;
        if (variance != null) {
            return variance;
        }
        m20184d(4);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    /* JADX INFO: renamed from: b */
    public final TypeProjection mo20159b(KotlinTypeRefiner kotlinTypeRefiner) {
        if (kotlinTypeRefiner != null) {
            return new TypeProjectionImpl(kotlinTypeRefiner.mo20279f(this.f54878b), this.f54877a);
        }
        m20184d(6);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    /* JADX INFO: renamed from: c */
    public final boolean mo20160c() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    public final KotlinType getType() {
        KotlinType kotlinType = this.f54878b;
        if (kotlinType != null) {
            return kotlinType;
        }
        m20184d(5);
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TypeProjectionImpl(KotlinType kotlinType) {
        this(kotlinType, Variance.f54896c);
        if (kotlinType != null) {
        } else {
            m20184d(2);
            throw null;
        }
    }
}
