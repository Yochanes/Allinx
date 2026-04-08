package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"kotlinx-serialization-core"}, m18303k = 2, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class InlineClassDescriptorKt {
    /* JADX INFO: renamed from: a */
    public static final InlineClassDescriptor m21001a(String str, KSerializer kSerializer) {
        return new InlineClassDescriptor(str, new InlineClassDescriptorKt$InlinePrimitiveDescriptor$1(kSerializer));
    }
}
