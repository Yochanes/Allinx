package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/serialization/internal/PrimitiveArrayDescriptor;", "Lkotlinx/serialization/internal/ListLikeDescriptor;", "kotlinx-serialization-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class PrimitiveArrayDescriptor extends ListLikeDescriptor {

    /* JADX INFO: renamed from: b */
    public final String f56747b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrimitiveArrayDescriptor(SerialDescriptor primitive) {
        super(primitive);
        Intrinsics.m18599g(primitive, "primitive");
        this.f56747b = primitive.getF56747b() + "Array";
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF56747b() {
        return this.f56747b;
    }
}
