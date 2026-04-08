package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class PossiblyInnerType {

    /* JADX INFO: renamed from: a */
    public final ClassifierDescriptorWithTypeParameters f52288a;

    /* JADX INFO: renamed from: b */
    public final List f52289b;

    /* JADX INFO: renamed from: c */
    public final PossiblyInnerType f52290c;

    public PossiblyInnerType(ClassifierDescriptorWithTypeParameters classifierDescriptor, List arguments, PossiblyInnerType possiblyInnerType) {
        Intrinsics.m18599g(classifierDescriptor, "classifierDescriptor");
        Intrinsics.m18599g(arguments, "arguments");
        this.f52288a = classifierDescriptor;
        this.f52289b = arguments;
        this.f52290c = possiblyInnerType;
    }
}
