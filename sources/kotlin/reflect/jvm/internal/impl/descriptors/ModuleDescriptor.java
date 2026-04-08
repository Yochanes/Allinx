package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface ModuleDescriptor extends DeclarationDescriptor {

    /* JADX INFO: compiled from: Proguard */
    public static final class DefaultImpls {
    }

    /* JADX INFO: renamed from: C0 */
    Object mo18945C0(ModuleCapability moduleCapability);

    /* JADX INFO: renamed from: I */
    PackageViewDescriptor mo18946I(FqName fqName);

    /* JADX INFO: renamed from: Y */
    boolean mo18947Y(ModuleDescriptor moduleDescriptor);

    /* JADX INFO: renamed from: l */
    KotlinBuiltIns mo18948l();

    /* JADX INFO: renamed from: n */
    Collection mo18949n(FqName fqName, Function1 function1);

    /* JADX INFO: renamed from: n0 */
    List mo18950n0();
}
