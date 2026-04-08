package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.KDeclarationContainerImpl$findPropertyDescriptor$mostVisibleProperties$2 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m18302d2 = {"<anonymous>", "", "first", "Lkotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibility;", "kotlin.jvm.PlatformType", "second", "invoke", "(Lorg/jetbrains/kotlin/descriptors/DescriptorVisibility;Lorg/jetbrains/kotlin/descriptors/DescriptorVisibility;)Ljava/lang/Integer;"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
final class C5999x62283bb extends Lambda implements Function2<DescriptorVisibility, DescriptorVisibility, Integer> {

    /* JADX INFO: renamed from: a */
    public static final C5999x62283bb f51849a = new C5999x62283bb(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Integer numM18912b = DescriptorVisibilities.m18912b((DescriptorVisibility) obj, (DescriptorVisibility) obj2);
        return Integer.valueOf(numM18912b == null ? 0 : numM18912b.intValue());
    }
}
