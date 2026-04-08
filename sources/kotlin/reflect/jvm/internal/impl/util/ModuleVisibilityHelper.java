package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface ModuleVisibilityHelper {

    /* JADX INFO: compiled from: Proguard */
    public static final class EMPTY implements ModuleVisibilityHelper {

        /* JADX INFO: renamed from: a */
        public static final EMPTY f55040a = new EMPTY();

        @Override // kotlin.reflect.jvm.internal.impl.util.ModuleVisibilityHelper
        /* JADX INFO: renamed from: a */
        public final void mo20329a(DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor from) {
            Intrinsics.m18599g(from, "from");
        }
    }

    /* JADX INFO: renamed from: a */
    void mo20329a(DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor);
}
