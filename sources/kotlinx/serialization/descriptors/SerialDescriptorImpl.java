package kotlinx.serialization.descriptors;

import androidx.compose.animation.AbstractC0455a;
import io.intercom.android.sdk.p032m5.inbox.C5555a;
import io.intercom.android.sdk.p032m5.push.C5615a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.IndexingIterable;
import kotlin.collections.IndexingIterator;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.internal.CachedNames;
import kotlinx.serialization.internal.Platform_commonKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptorImpl;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/internal/CachedNames;", "kotlinx-serialization-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class SerialDescriptorImpl implements SerialDescriptor, CachedNames {

    /* JADX INFO: renamed from: a */
    public final String f56622a;

    /* JADX INFO: renamed from: b */
    public final SerialKind f56623b;

    /* JADX INFO: renamed from: c */
    public final int f56624c;

    /* JADX INFO: renamed from: d */
    public final List f56625d;

    /* JADX INFO: renamed from: e */
    public final HashSet f56626e;

    /* JADX INFO: renamed from: f */
    public final String[] f56627f;

    /* JADX INFO: renamed from: g */
    public final SerialDescriptor[] f56628g;

    /* JADX INFO: renamed from: h */
    public final List[] f56629h;

    /* JADX INFO: renamed from: i */
    public final boolean[] f56630i;

    /* JADX INFO: renamed from: j */
    public final Map f56631j;

    /* JADX INFO: renamed from: k */
    public final SerialDescriptor[] f56632k;

    /* JADX INFO: renamed from: l */
    public final Lazy f56633l;

    public SerialDescriptorImpl(String serialName, SerialKind serialKind, int i, List list, ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
        Intrinsics.m18599g(serialName, "serialName");
        this.f56622a = serialName;
        this.f56623b = serialKind;
        this.f56624c = i;
        this.f56625d = classSerialDescriptorBuilder.f56602b;
        ArrayList arrayList = classSerialDescriptorBuilder.f56603c;
        this.f56626e = CollectionsKt.m18461v0(arrayList);
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.f56627f = strArr;
        this.f56628g = Platform_commonKt.m21018b(classSerialDescriptorBuilder.f56605e);
        this.f56629h = (List[]) classSerialDescriptorBuilder.f56606f.toArray(new List[0]);
        this.f56630i = CollectionsKt.m18457t0(classSerialDescriptorBuilder.f56607g);
        Intrinsics.m18599g(strArr, "<this>");
        IndexingIterable indexingIterable = new IndexingIterable(new C5555a(strArr, 3));
        ArrayList arrayList2 = new ArrayList(CollectionsKt.m18452r(indexingIterable, 10));
        Iterator it = indexingIterable.iterator();
        while (true) {
            IndexingIterator indexingIterator = (IndexingIterator) it;
            if (!indexingIterator.f51502a.hasNext()) {
                this.f56631j = MapsKt.m18489l(arrayList2);
                this.f56632k = Platform_commonKt.m21018b(list);
                this.f56633l = LazyKt.m18299b(new C5555a(this, 9));
                return;
            }
            IndexedValue indexedValue = (IndexedValue) indexingIterator.next();
            arrayList2.add(new Pair(indexedValue.f51500b, Integer.valueOf(indexedValue.f51499a)));
        }
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF56749a() {
        return this.f56622a;
    }

    @Override // kotlinx.serialization.internal.CachedNames
    /* JADX INFO: renamed from: b */
    public final Set getF56756c() {
        return this.f56626e;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: c */
    public final boolean mo20940c() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: d */
    public final int mo20941d(String name) {
        Intrinsics.m18599g(name, "name");
        Integer num = (Integer) this.f56631j.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getF56737c() {
        return this.f56624c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SerialDescriptorImpl) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (Intrinsics.m18594b(this.f56622a, serialDescriptor.getF56749a()) && Arrays.equals(this.f56632k, ((SerialDescriptorImpl) obj).f56632k)) {
                int f56624c = serialDescriptor.getF56737c();
                int i = this.f56624c;
                if (i == f56624c) {
                    for (int i2 = 0; i2 < i; i2++) {
                        SerialDescriptor[] serialDescriptorArr = this.f56628g;
                        if (Intrinsics.m18594b(serialDescriptorArr[i2].getF56749a(), serialDescriptor.mo20945h(i2).getF56749a()) && Intrinsics.m18594b(serialDescriptorArr[i2].getF56623b(), serialDescriptor.mo20945h(i2).getF56623b())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: f */
    public final String mo20943f(int i) {
        return this.f56627f[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: g */
    public final List mo20944g(int i) {
        return this.f56629h[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: getAnnotations, reason: from getter */
    public final List getF56625d() {
        return this.f56625d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: getKind, reason: from getter */
    public final SerialKind getF56623b() {
        return this.f56623b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: h */
    public final SerialDescriptor mo20945h(int i) {
        return this.f56628g[i];
    }

    public final int hashCode() {
        return ((Number) this.f56633l.getValue()).intValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: i */
    public final boolean mo20946i(int i) {
        return this.f56630i[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: isInline */
    public final boolean getF56698l() {
        return false;
    }

    public final String toString() {
        return CollectionsKt.m18409J(RangesKt.m18664k(0, this.f56624c), ", ", AbstractC0455a.m2241p(new StringBuilder(), this.f56622a, '('), ")", new C5615a(this, 7), 24);
    }
}
