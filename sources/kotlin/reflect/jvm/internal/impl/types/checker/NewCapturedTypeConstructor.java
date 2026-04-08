package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class NewCapturedTypeConstructor implements CapturedTypeConstructor {

    /* JADX INFO: renamed from: a */
    public final TypeProjection f54914a;

    /* JADX INFO: renamed from: b */
    public Function0 f54915b;

    /* JADX INFO: renamed from: c */
    public final NewCapturedTypeConstructor f54916c;

    /* JADX INFO: renamed from: d */
    public final TypeParameterDescriptor f54917d;

    /* JADX INFO: renamed from: e */
    public final Object f54918e;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor$1 */
    /* JADX INFO: compiled from: Proguard */
    final class C62181 extends Lambda implements Function0<List<? extends UnwrappedType>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f54919a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C62181(ArrayList arrayList) {
            super(0);
            this.f54919a = arrayList;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.f54919a;
        }
    }

    public /* synthetic */ NewCapturedTypeConstructor(TypeProjection typeProjection, Function0 function0, TypeParameterDescriptor typeParameterDescriptor, int i) {
        this(typeProjection, (i & 2) != 0 ? null : function0, (NewCapturedTypeConstructor) null, (i & 8) != 0 ? null : typeParameterDescriptor);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* JADX INFO: renamed from: a */
    public final Collection mo19009a() {
        Collection collection = (List) this.f54918e.getValue();
        if (collection == null) {
            collection = EmptyList.f51496a;
        }
        return collection;
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

    @Override // kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor
    /* JADX INFO: renamed from: e */
    public final TypeProjection mo19954e() {
        return this.f54914a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!NewCapturedTypeConstructor.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.m18597e(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor");
        NewCapturedTypeConstructor newCapturedTypeConstructor = (NewCapturedTypeConstructor) obj;
        NewCapturedTypeConstructor newCapturedTypeConstructor2 = this.f54916c;
        if (newCapturedTypeConstructor2 == null) {
            newCapturedTypeConstructor2 = this;
        }
        NewCapturedTypeConstructor newCapturedTypeConstructor3 = newCapturedTypeConstructor.f54916c;
        if (newCapturedTypeConstructor3 != null) {
            newCapturedTypeConstructor = newCapturedTypeConstructor3;
        }
        return newCapturedTypeConstructor2 == newCapturedTypeConstructor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final List getParameters() {
        return EmptyList.f51496a;
    }

    public final int hashCode() {
        NewCapturedTypeConstructor newCapturedTypeConstructor = this.f54916c;
        return newCapturedTypeConstructor != null ? newCapturedTypeConstructor.hashCode() : super.hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* JADX INFO: renamed from: l */
    public final KotlinBuiltIns mo19010l() {
        KotlinType type = this.f54914a.getType();
        Intrinsics.m18598f(type, "projection.type");
        return TypeUtilsKt.m20310f(type);
    }

    public final String toString() {
        return "CapturedType(" + this.f54914a + ')';
    }

    public NewCapturedTypeConstructor(TypeProjection projection, Function0 function0, NewCapturedTypeConstructor newCapturedTypeConstructor, TypeParameterDescriptor typeParameterDescriptor) {
        Intrinsics.m18599g(projection, "projection");
        this.f54914a = projection;
        this.f54915b = function0;
        this.f54916c = newCapturedTypeConstructor;
        this.f54917d = typeParameterDescriptor;
        this.f54918e = LazyKt.m18298a(LazyThreadSafetyMode.f51422b, new NewCapturedTypeConstructor$_supertypes$2(this));
    }
}
