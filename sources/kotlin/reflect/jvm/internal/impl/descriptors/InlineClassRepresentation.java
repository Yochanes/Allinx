package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension
public final class InlineClassRepresentation<Type extends SimpleTypeMarker> extends ValueClassRepresentation<Type> {

    /* JADX INFO: renamed from: a */
    public final Name f52263a;

    /* JADX INFO: renamed from: b */
    public final SimpleTypeMarker f52264b;

    public InlineClassRepresentation(Name name, SimpleTypeMarker underlyingType) {
        Intrinsics.m18599g(underlyingType, "underlyingType");
        this.f52263a = name;
        this.f52264b = underlyingType;
    }

    public final String toString() {
        return "InlineClassRepresentation(underlyingPropertyName=" + this.f52263a + ", underlyingType=" + this.f52264b + ')';
    }
}
