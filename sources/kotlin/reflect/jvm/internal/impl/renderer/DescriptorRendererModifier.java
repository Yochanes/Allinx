package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension
public enum DescriptorRendererModifier {
    VISIBILITY(true),
    MODALITY(true),
    OVERRIDE(true),
    ANNOTATIONS(false),
    INNER(true),
    MEMBER_KIND(true),
    DATA(true),
    INLINE(true),
    EXPECT(true),
    ACTUAL(true),
    CONST(true),
    LATEINIT(true),
    FUN(true),
    VALUE(true);


    /* JADX INFO: renamed from: b */
    public static final Set f54235b;

    /* JADX INFO: renamed from: c */
    public static final Set f54236c;

    /* JADX INFO: renamed from: a */
    public final boolean f54252a;

    /* JADX INFO: compiled from: Proguard */
    public static final class Companion {
    }

    static {
        DescriptorRendererModifier[] descriptorRendererModifierArrValues = values();
        ArrayList arrayList = new ArrayList();
        for (DescriptorRendererModifier descriptorRendererModifier : descriptorRendererModifierArrValues) {
            if (descriptorRendererModifier.f54252a) {
                arrayList.add(descriptorRendererModifier);
            }
        }
        f54235b = CollectionsKt.m18399B0(arrayList);
        f54236c = ArraysKt.m18372h0(values());
    }

    DescriptorRendererModifier(boolean z2) {
        this.f54252a = z2;
    }
}
