package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension
public final class IntegerLiteralTypeConstructor implements TypeConstructor {

    /* JADX INFO: renamed from: a */
    public final LinkedHashSet f54376a;

    /* JADX INFO: renamed from: b */
    public final Lazy f54377b;

    /* JADX INFO: compiled from: Proguard */
    @SourceDebugExtension
    public static final class Companion {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: compiled from: Proguard */
        public static final class Mode {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ Mode[] f54378a = {new Mode("COMMON_SUPER_TYPE", 0), new Mode("INTERSECTION_TYPE", 1)};

            /* JADX INFO: Fake field, exist only in values array */
            Mode EF5;

            public static Mode valueOf(String str) {
                return (Mode) Enum.valueOf(Mode.class, str);
            }

            public static Mode[] values() {
                return (Mode[]) f54378a.clone();
            }
        }

        /* JADX INFO: compiled from: Proguard */
        public /* synthetic */ class WhenMappings {
            static {
                int[] iArr = new int[Mode.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
            }
        }
    }

    public IntegerLiteralTypeConstructor(LinkedHashSet linkedHashSet) {
        TypeAttributes.f54853b.getClass();
        TypeAttributes attributes = TypeAttributes.f54854c;
        Intrinsics.m18599g(attributes, "attributes");
        KotlinTypeFactory.m20149e(EmptyList.f51496a, ErrorUtils.m20298a(ErrorScopeKind.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"), attributes, this, false);
        this.f54377b = LazyKt.m18299b(new IntegerLiteralTypeConstructor$supertypes$2(this));
        this.f54376a = linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* JADX INFO: renamed from: a */
    public final Collection mo19009a() {
        return (List) this.f54377b.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* JADX INFO: renamed from: b */
    public final ClassifierDescriptor mo18838b() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* JADX INFO: renamed from: d */
    public final boolean mo18839d() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final List getParameters() {
        return EmptyList.f51496a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* JADX INFO: renamed from: l */
    public final KotlinBuiltIns mo19010l() {
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntegerLiteralType");
        sb.append("[" + CollectionsKt.m18409J(this.f54376a, ",", null, null, IntegerLiteralTypeConstructor$valueToString$1.f54380a, 30) + ']');
        return sb.toString();
    }
}
