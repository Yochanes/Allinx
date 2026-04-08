package kotlin.reflect.jvm.internal.impl.types;

import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class SimpleType extends UnwrappedType implements SimpleTypeMarker, TypeArgumentListMarker {
    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    /* JADX INFO: renamed from: M0 */
    public /* bridge */ /* synthetic */ UnwrappedType mo19303M0(boolean z2) {
        return mo19324P0(z2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    /* JADX INFO: renamed from: O0 */
    public /* bridge */ /* synthetic */ UnwrappedType mo19305O0(TypeAttributes typeAttributes) {
        return mo19325Q0(typeAttributes);
    }

    /* JADX INFO: renamed from: P0 */
    public abstract SimpleType mo19324P0(boolean z2);

    /* JADX INFO: renamed from: Q0 */
    public abstract SimpleType mo19325Q0(TypeAttributes typeAttributes);

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<AnnotationDescriptor> it = getAnnotations().iterator();
        while (it.hasNext()) {
            String[] strArr = {"[", DescriptorRenderer.f54212c.m19800y(it.next(), null), "] "};
            for (int i = 0; i < 3; i++) {
                sb.append(strArr[i]);
            }
        }
        sb.append(mo19953I0());
        if (!mo19951G0().isEmpty()) {
            CollectionsKt.m18408I(mo19951G0(), sb, ", ", "<", ">", null, 112);
        }
        if (mo19323J0()) {
            sb.append("?");
        }
        String string = sb.toString();
        Intrinsics.m18598f(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
