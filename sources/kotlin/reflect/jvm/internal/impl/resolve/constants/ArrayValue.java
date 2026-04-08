package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class ArrayValue extends ConstantValue<List<? extends ConstantValue<?>>> {

    /* JADX INFO: renamed from: b */
    public final Lambda f54367b;

    /* JADX WARN: Multi-variable type inference failed */
    public ArrayValue(List list, Function1 function1) {
        super(list);
        this.f54367b = (Lambda) function1;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    /* JADX INFO: renamed from: a */
    public final KotlinType mo19958a(ModuleDescriptor module) {
        Intrinsics.m18599g(module, "module");
        KotlinType kotlinType = (KotlinType) this.f54367b.invoke(module);
        if (!KotlinBuiltIns.m18788x(kotlinType) && !KotlinBuiltIns.m18778E(kotlinType) && !KotlinBuiltIns.m18774A(kotlinType, StandardNames.FqNames.f52086V.m19593i()) && !KotlinBuiltIns.m18774A(kotlinType, StandardNames.FqNames.f52087W.m19593i()) && !KotlinBuiltIns.m18774A(kotlinType, StandardNames.FqNames.f52088X.m19593i())) {
            KotlinBuiltIns.m18774A(kotlinType, StandardNames.FqNames.f52089Y.m19593i());
        }
        return kotlinType;
    }
}
