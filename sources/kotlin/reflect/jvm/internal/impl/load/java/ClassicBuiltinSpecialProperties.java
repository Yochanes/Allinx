package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension
public final class ClassicBuiltinSpecialProperties {
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: a */
    public static String m19184a(CallableMemberDescriptor callableMemberDescriptor) {
        Name name;
        KotlinBuiltIns.m18789y(callableMemberDescriptor);
        CallableMemberDescriptor callableMemberDescriptorM19963b = DescriptorUtilsKt.m19963b(DescriptorUtilsKt.m19973l(callableMemberDescriptor), C6052xccd5eab2.f52721a);
        if (callableMemberDescriptorM19963b == null || (name = (Name) BuiltinSpecialProperties.f52717a.get(DescriptorUtilsKt.m19968g(callableMemberDescriptorM19963b))) == null) {
            return null;
        }
        return name.m19608b();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m19185b(CallableMemberDescriptor callableMemberDescriptor) {
        Intrinsics.m18599g(callableMemberDescriptor, "callableMemberDescriptor");
        if (!BuiltinSpecialProperties.f52720d.contains(callableMemberDescriptor.getName())) {
            return false;
        }
        if (CollectionsKt.m18454s(BuiltinSpecialProperties.f52719c, DescriptorUtilsKt.m19964c(callableMemberDescriptor)) && callableMemberDescriptor.mo18874f().isEmpty()) {
            return true;
        }
        if (!KotlinBuiltIns.m18789y(callableMemberDescriptor)) {
            return false;
        }
        Collection overriddenDescriptors = callableMemberDescriptor.mo18877m();
        Intrinsics.m18598f(overriddenDescriptors, "overriddenDescriptors");
        Collection<CallableMemberDescriptor> collection = overriddenDescriptors;
        if (collection.isEmpty()) {
            return false;
        }
        for (CallableMemberDescriptor it : collection) {
            Intrinsics.m18598f(it, "it");
            if (m19185b(it)) {
                return true;
            }
        }
        return false;
    }
}
