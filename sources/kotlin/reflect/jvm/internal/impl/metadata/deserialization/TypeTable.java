package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension
public final class TypeTable {

    /* JADX INFO: renamed from: a */
    public final List f53914a;

    public TypeTable(ProtoBuf.TypeTable typeTable) {
        Intrinsics.m18599g(typeTable, "typeTable");
        List list = typeTable.f53787c;
        if ((typeTable.f53786b & 1) == 1) {
            int i = typeTable.f53788d;
            Intrinsics.m18598f(list, "typeTable.typeList");
            List list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.m18452r(list2, 10));
            int i2 = 0;
            for (Object obj : list2) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.m18455s0();
                    throw null;
                }
                ProtoBuf.Type typeM19495i = (ProtoBuf.Type) obj;
                if (i2 >= i) {
                    typeM19495i.getClass();
                    ProtoBuf.Type.Builder builderM19486p = ProtoBuf.Type.m19486p(typeM19495i);
                    builderM19486p.f53718d |= 2;
                    builderM19486p.f53720g = true;
                    typeM19495i = builderM19486p.m19495i();
                    if (!typeM19495i.isInitialized()) {
                        throw new UninitializedMessageException();
                    }
                }
                arrayList.add(typeM19495i);
                i2 = i3;
            }
            list = arrayList;
        }
        Intrinsics.m18598f(list, "run {\n        val origin… else originalTypes\n    }");
        this.f53914a = list;
    }

    /* JADX INFO: renamed from: a */
    public final ProtoBuf.Type m19541a(int i) {
        return (ProtoBuf.Type) this.f53914a.get(i);
    }
}
