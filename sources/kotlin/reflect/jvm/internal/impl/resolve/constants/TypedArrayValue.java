package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class TypedArrayValue extends ArrayValue {

    /* JADX INFO: renamed from: c */
    public final KotlinType f54383c;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.TypedArrayValue$1 */
    /* JADX INFO: compiled from: Proguard */
    final class C61851 extends Lambda implements Function1<ModuleDescriptor, KotlinType> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ KotlinType f54384a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C61851(KotlinType kotlinType) {
            super(1);
            this.f54384a = kotlinType;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            ModuleDescriptor it = (ModuleDescriptor) obj;
            Intrinsics.m18599g(it, "it");
            return this.f54384a;
        }
    }

    public TypedArrayValue(List list, KotlinType kotlinType) {
        super(list, new C61851(kotlinType));
        this.f54383c = kotlinType;
    }
}
