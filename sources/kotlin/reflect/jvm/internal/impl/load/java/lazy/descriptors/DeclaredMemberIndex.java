package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface DeclaredMemberIndex {

    /* JADX INFO: compiled from: Proguard */
    public static final class Empty implements DeclaredMemberIndex {

        /* JADX INFO: renamed from: a */
        public static final Empty f52942a = new Empty();

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
        /* JADX INFO: renamed from: a */
        public final Set mo19237a() {
            return EmptySet.f51498a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
        /* JADX INFO: renamed from: b */
        public final JavaRecordComponent mo19238b(Name name) {
            Intrinsics.m18599g(name, "name");
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
        /* JADX INFO: renamed from: c */
        public final JavaField mo19239c(Name name) {
            Intrinsics.m18599g(name, "name");
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
        /* JADX INFO: renamed from: d */
        public final Set mo19240d() {
            return EmptySet.f51498a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
        /* JADX INFO: renamed from: e */
        public final Set mo19241e() {
            return EmptySet.f51498a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
        /* JADX INFO: renamed from: f */
        public final Collection mo19242f(Name name) {
            Intrinsics.m18599g(name, "name");
            return EmptyList.f51496a;
        }
    }

    /* JADX INFO: renamed from: a */
    Set mo19237a();

    /* JADX INFO: renamed from: b */
    JavaRecordComponent mo19238b(Name name);

    /* JADX INFO: renamed from: c */
    JavaField mo19239c(Name name);

    /* JADX INFO: renamed from: d */
    Set mo19240d();

    /* JADX INFO: renamed from: e */
    Set mo19241e();

    /* JADX INFO: renamed from: f */
    Collection mo19242f(Name name);
}
