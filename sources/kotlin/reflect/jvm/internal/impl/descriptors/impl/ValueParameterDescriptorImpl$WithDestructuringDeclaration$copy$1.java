package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class ValueParameterDescriptorImpl$WithDestructuringDeclaration$copy$1 extends Lambda implements Function0<List<? extends VariableDescriptor>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ValueParameterDescriptorImpl.WithDestructuringDeclaration f52609a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValueParameterDescriptorImpl$WithDestructuringDeclaration$copy$1(ValueParameterDescriptorImpl.WithDestructuringDeclaration withDestructuringDeclaration) {
        super(0);
        this.f52609a = withDestructuringDeclaration;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return (List) this.f52609a.f52608q.getValue();
    }
}
