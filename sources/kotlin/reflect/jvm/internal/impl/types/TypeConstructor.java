package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface TypeConstructor extends TypeConstructorMarker {
    /* JADX INFO: renamed from: a */
    Collection mo19009a();

    /* JADX INFO: renamed from: b */
    ClassifierDescriptor mo18838b();

    /* JADX INFO: renamed from: d */
    boolean mo18839d();

    List getParameters();

    /* JADX INFO: renamed from: l */
    KotlinBuiltIns mo19010l();
}
