package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension
public final class MultiFieldValueClassRepresentation<Type extends SimpleTypeMarker> extends ValueClassRepresentation<Type> {

    /* JADX INFO: renamed from: a */
    public final ArrayList f52272a;

    /* JADX INFO: renamed from: b */
    public final Map f52273b;

    public MultiFieldValueClassRepresentation(ArrayList arrayList) {
        this.f52272a = arrayList;
        Map mapM18489l = MapsKt.m18489l(arrayList);
        if (mapM18489l.size() != arrayList.size()) {
            throw new IllegalArgumentException("Some properties have the same names");
        }
        this.f52273b = mapM18489l;
    }

    public final String toString() {
        return "MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes=" + this.f52272a + ')';
    }
}
