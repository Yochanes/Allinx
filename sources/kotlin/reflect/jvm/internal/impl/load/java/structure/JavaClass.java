package kotlin.reflect.jvm.internal.impl.load.java.structure;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface JavaClass extends JavaClassifier, JavaModifierListOwner, JavaTypeParameterListOwner {
    /* JADX INFO: renamed from: A */
    boolean mo19131A();

    /* JADX INFO: renamed from: C */
    Collection mo19132C();

    /* JADX INFO: renamed from: F */
    Collection mo19133F();

    /* JADX INFO: renamed from: G */
    Collection mo19134G();

    /* JADX INFO: renamed from: a */
    Collection mo19135a();

    /* JADX INFO: renamed from: c */
    FqName mo19136c();

    Collection getFields();

    /* JADX INFO: renamed from: j */
    Collection mo19139j();

    /* JADX INFO: renamed from: l */
    ArrayList mo19140l();

    /* JADX INFO: renamed from: p */
    boolean mo19141p();

    /* JADX INFO: renamed from: q */
    ReflectJavaClass mo19142q();

    /* JADX INFO: renamed from: r */
    boolean mo19143r();

    /* JADX INFO: renamed from: v */
    boolean mo19144v();

    /* JADX INFO: renamed from: x */
    boolean mo19145x();
}
