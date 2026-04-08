package kotlin.reflect.jvm.internal.impl.load.java.structure;

import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface JavaModifierListOwner extends JavaElement {
    Visibility getVisibility();

    /* JADX INFO: renamed from: i */
    boolean mo19138i();

    boolean isAbstract();

    boolean isFinal();
}
