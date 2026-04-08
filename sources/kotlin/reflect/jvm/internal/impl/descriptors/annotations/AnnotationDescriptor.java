package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Map;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface AnnotationDescriptor {

    /* JADX INFO: compiled from: Proguard */
    @SourceDebugExtension
    public static final class DefaultImpls {
    }

    /* JADX INFO: renamed from: a */
    Map mo18989a();

    /* JADX INFO: renamed from: c */
    FqName mo18990c();

    /* JADX INFO: renamed from: g */
    SourceElement mo18991g();

    KotlinType getType();
}
