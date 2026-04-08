package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/serialization/internal/InlineClassDescriptor;", "Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;", "kotlinx-serialization-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@PublishedApi
@SourceDebugExtension
public final class InlineClassDescriptor extends PluginGeneratedSerialDescriptor {

    /* JADX INFO: renamed from: l */
    public final boolean f56698l;

    public InlineClassDescriptor(String str, InlineClassDescriptorKt$InlinePrimitiveDescriptor$1 inlineClassDescriptorKt$InlinePrimitiveDescriptor$1) {
        super(str, inlineClassDescriptorKt$InlinePrimitiveDescriptor$1, 1);
        this.f56698l = true;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InlineClassDescriptor) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (this.f56735a.equals(serialDescriptor.getF56735a())) {
                InlineClassDescriptor inlineClassDescriptor = (InlineClassDescriptor) obj;
                if (inlineClassDescriptor.f56698l && Arrays.equals((SerialDescriptor[]) this.f56744j.getValue(), (SerialDescriptor[]) inlineClassDescriptor.f56744j.getValue())) {
                    int f56737c = serialDescriptor.getF56737c();
                    int i = this.f56737c;
                    if (i == f56737c) {
                        for (int i2 = 0; i2 < i; i2++) {
                            if (Intrinsics.m18594b(mo20945h(i2).getF56735a(), serialDescriptor.mo20945h(i2).getF56735a()) && Intrinsics.m18594b(mo20945h(i2).getF56623b(), serialDescriptor.mo20945h(i2).getF56623b())) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: isInline, reason: from getter */
    public final boolean getF56698l() {
        return this.f56698l;
    }
}
