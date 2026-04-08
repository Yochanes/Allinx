package kotlinx.serialization.descriptors;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/serialization/descriptors/ClassSerialDescriptorBuilder;", "", "kotlinx-serialization-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class ClassSerialDescriptorBuilder {

    /* JADX INFO: renamed from: a */
    public final String f56601a;

    /* JADX INFO: renamed from: b */
    public List f56602b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f56603c;

    /* JADX INFO: renamed from: d */
    public final HashSet f56604d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f56605e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f56606f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f56607g;

    public ClassSerialDescriptorBuilder(String serialName) {
        Intrinsics.m18599g(serialName, "serialName");
        this.f56601a = serialName;
        this.f56602b = EmptyList.f51496a;
        this.f56603c = new ArrayList();
        this.f56604d = new HashSet();
        this.f56605e = new ArrayList();
        this.f56606f = new ArrayList();
        this.f56607g = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public static void m20936a(ClassSerialDescriptorBuilder classSerialDescriptorBuilder, String elementName, SerialDescriptor descriptor) {
        EmptyList emptyList = EmptyList.f51496a;
        classSerialDescriptorBuilder.getClass();
        Intrinsics.m18599g(elementName, "elementName");
        Intrinsics.m18599g(descriptor, "descriptor");
        if (!classSerialDescriptorBuilder.f56604d.add(elementName)) {
            StringBuilder sbM23t = AbstractC0000a.m23t("Element with name '", elementName, "' is already registered in ");
            sbM23t.append(classSerialDescriptorBuilder.f56601a);
            throw new IllegalArgumentException(sbM23t.toString().toString());
        }
        classSerialDescriptorBuilder.f56603c.add(elementName);
        classSerialDescriptorBuilder.f56605e.add(descriptor);
        classSerialDescriptorBuilder.f56606f.add(emptyList);
        classSerialDescriptorBuilder.f56607g.add(false);
    }
}
