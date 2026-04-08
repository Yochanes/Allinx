package kotlinx.serialization.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;

/* JADX INFO: renamed from: kotlinx.serialization.internal.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6343a implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f56796a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ KSerializer f56797b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ KSerializer f56798c;

    public /* synthetic */ C6343a(KSerializer kSerializer, KSerializer kSerializer2, int i) {
        this.f56796a = i;
        this.f56797b = kSerializer;
        this.f56798c = kSerializer2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ClassSerialDescriptorBuilder buildSerialDescriptor = (ClassSerialDescriptorBuilder) obj;
        switch (this.f56796a) {
            case 0:
                Intrinsics.m18599g(buildSerialDescriptor, "$this$buildSerialDescriptor");
                ClassSerialDescriptorBuilder.m20936a(buildSerialDescriptor, "key", this.f56797b.getDescriptor());
                ClassSerialDescriptorBuilder.m20936a(buildSerialDescriptor, "value", this.f56798c.getDescriptor());
                break;
            default:
                Intrinsics.m18599g(buildSerialDescriptor, "$this$buildClassSerialDescriptor");
                ClassSerialDescriptorBuilder.m20936a(buildSerialDescriptor, "first", this.f56797b.getDescriptor());
                ClassSerialDescriptorBuilder.m20936a(buildSerialDescriptor, "second", this.f56798c.getDescriptor());
                break;
        }
        return Unit.f51459a;
    }
}
