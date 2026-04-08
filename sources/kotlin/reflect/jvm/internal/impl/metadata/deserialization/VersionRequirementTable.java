package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class VersionRequirementTable {

    /* JADX INFO: renamed from: b */
    public static final VersionRequirementTable f53915b = new VersionRequirementTable(EmptyList.f51496a);

    /* JADX INFO: renamed from: a */
    public final List f53916a;

    /* JADX INFO: compiled from: Proguard */
    public static final class Companion {
        /* JADX INFO: renamed from: a */
        public static VersionRequirementTable m19542a(ProtoBuf.VersionRequirementTable table) {
            Intrinsics.m18599g(table, "table");
            if (table.f53845b.size() == 0) {
                return VersionRequirementTable.f53915b;
            }
            List list = table.f53845b;
            Intrinsics.m18598f(list, "table.requirementList");
            return new VersionRequirementTable(list);
        }
    }

    public VersionRequirementTable(List list) {
        this.f53916a = list;
    }
}
