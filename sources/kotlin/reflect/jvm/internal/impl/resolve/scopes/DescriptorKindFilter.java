package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import androidx.compose.animation.AbstractC0455a;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension
public final class DescriptorKindFilter {

    /* JADX INFO: renamed from: c */
    public static final Companion f54423c = new Companion();

    /* JADX INFO: renamed from: d */
    public static final int f54424d;

    /* JADX INFO: renamed from: e */
    public static final int f54425e;

    /* JADX INFO: renamed from: f */
    public static final int f54426f;

    /* JADX INFO: renamed from: g */
    public static final int f54427g;

    /* JADX INFO: renamed from: h */
    public static final int f54428h;

    /* JADX INFO: renamed from: i */
    public static final int f54429i;

    /* JADX INFO: renamed from: j */
    public static final int f54430j;

    /* JADX INFO: renamed from: k */
    public static final int f54431k;

    /* JADX INFO: renamed from: l */
    public static final int f54432l;

    /* JADX INFO: renamed from: m */
    public static final DescriptorKindFilter f54433m;

    /* JADX INFO: renamed from: n */
    public static final DescriptorKindFilter f54434n;

    /* JADX INFO: renamed from: o */
    public static final DescriptorKindFilter f54435o;

    /* JADX INFO: renamed from: p */
    public static final DescriptorKindFilter f54436p;

    /* JADX INFO: renamed from: q */
    public static final DescriptorKindFilter f54437q;

    /* JADX INFO: renamed from: r */
    public static final ArrayList f54438r;

    /* JADX INFO: renamed from: s */
    public static final ArrayList f54439s;

    /* JADX INFO: renamed from: a */
    public final List f54440a;

    /* JADX INFO: renamed from: b */
    public final int f54441b;

    /* JADX INFO: compiled from: Proguard */
    @SourceDebugExtension
    public static final class Companion {

        /* JADX INFO: compiled from: Proguard */
        public static final class MaskToName {

            /* JADX INFO: renamed from: a */
            public final int f54442a;

            /* JADX INFO: renamed from: b */
            public final String f54443b;

            public MaskToName(int i, String str) {
                this.f54442a = i;
                this.f54443b = str;
            }
        }
    }

    static {
        Companion.MaskToName maskToName;
        int i = f54424d;
        int i2 = i << 1;
        f54425e = i;
        int i3 = i << 2;
        f54426f = i2;
        int i4 = i << 3;
        f54427g = i3;
        int i5 = i << 4;
        f54428h = i4;
        int i6 = i << 5;
        f54429i = i5;
        f54430j = i6;
        f54424d = i << 7;
        int i7 = (i << 6) - 1;
        f54431k = i7;
        int i8 = i | i2 | i3;
        f54432l = i8;
        f54433m = new DescriptorKindFilter(i7);
        f54434n = new DescriptorKindFilter(i5 | i6);
        new DescriptorKindFilter(i);
        new DescriptorKindFilter(i2);
        new DescriptorKindFilter(i3);
        f54435o = new DescriptorKindFilter(i8);
        new DescriptorKindFilter(i4);
        f54436p = new DescriptorKindFilter(i5);
        f54437q = new DescriptorKindFilter(i6);
        new DescriptorKindFilter(i2 | i5 | i6);
        Field[] fields = DescriptorKindFilter.class.getFields();
        Intrinsics.m18598f(fields, "T::class.java.fields");
        ArrayList arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            Companion.MaskToName maskToName2 = null;
            if (!it.hasNext()) {
                break;
            }
            Field field2 = (Field) it.next();
            Object obj = field2.get(null);
            DescriptorKindFilter descriptorKindFilter = obj instanceof DescriptorKindFilter ? (DescriptorKindFilter) obj : null;
            if (descriptorKindFilter != null) {
                String name = field2.getName();
                Intrinsics.m18598f(name, "field.name");
                maskToName2 = new Companion.MaskToName(descriptorKindFilter.f54441b, name);
            }
            if (maskToName2 != null) {
                arrayList2.add(maskToName2);
            }
        }
        f54438r = arrayList2;
        Field[] fields2 = DescriptorKindFilter.class.getFields();
        Intrinsics.m18598f(fields2, "T::class.java.fields");
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList<Field> arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (Intrinsics.m18594b(((Field) obj2).getType(), Integer.TYPE)) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Field field4 : arrayList4) {
            Object obj3 = field4.get(null);
            Intrinsics.m18597e(obj3, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj3).intValue();
            if (iIntValue == ((-iIntValue) & iIntValue)) {
                String name2 = field4.getName();
                Intrinsics.m18598f(name2, "field.name");
                maskToName = new Companion.MaskToName(iIntValue, name2);
            } else {
                maskToName = null;
            }
            if (maskToName != null) {
                arrayList5.add(maskToName);
            }
        }
        f54439s = arrayList5;
    }

    public DescriptorKindFilter(int i, List excludes) {
        Intrinsics.m18599g(excludes, "excludes");
        this.f54440a = excludes;
        Iterator it = excludes.iterator();
        while (it.hasNext()) {
            i &= ~((DescriptorKindExclude) it.next()).mo19998a();
        }
        this.f54441b = i;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m19999a(int i) {
        return (i & this.f54441b) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!DescriptorKindFilter.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.m18597e(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter");
        DescriptorKindFilter descriptorKindFilter = (DescriptorKindFilter) obj;
        return Intrinsics.m18594b(this.f54440a, descriptorKindFilter.f54440a) && this.f54441b == descriptorKindFilter.f54441b;
    }

    public final int hashCode() {
        return (this.f54440a.hashCode() * 31) + this.f54441b;
    }

    public final String toString() {
        Object next;
        Iterator it = f54438r.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((Companion.MaskToName) next).f54442a == this.f54441b) {
                break;
            }
        }
        Companion.MaskToName maskToName = (Companion.MaskToName) next;
        String strM18409J = maskToName != null ? maskToName.f54443b : null;
        if (strM18409J == null) {
            ArrayList<Companion.MaskToName> arrayList = f54439s;
            ArrayList arrayList2 = new ArrayList();
            for (Companion.MaskToName maskToName2 : arrayList) {
                String str = m19999a(maskToName2.f54442a) ? maskToName2.f54443b : null;
                if (str != null) {
                    arrayList2.add(str);
                }
            }
            strM18409J = CollectionsKt.m18409J(arrayList2, " | ", null, null, null, 62);
        }
        return AbstractC0455a.m2242q(AbstractC0000a.m23t("DescriptorKindFilter(", strM18409J, ", "), this.f54440a, ')');
    }

    public /* synthetic */ DescriptorKindFilter(int i) {
        this(i, EmptyList.f51496a);
    }
}
