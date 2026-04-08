package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Internal;
import androidx.datastore.preferences.protobuf.UnsafeUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
abstract class ListFieldSchema {

    /* JADX INFO: renamed from: a */
    public static final ListFieldSchemaFull f24024a = new ListFieldSchemaFull();

    /* JADX INFO: renamed from: b */
    public static final ListFieldSchemaLite f24025b = new ListFieldSchemaLite();

    /* JADX INFO: compiled from: Proguard */
    public static final class ListFieldSchemaFull extends ListFieldSchema {

        /* JADX INFO: renamed from: c */
        public static final Class f24026c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

        /* JADX INFO: renamed from: d */
        public static List m8531d(Object obj, long j, int i) {
            List list = (List) UnsafeUtil.f24155d.m8696m(obj, j);
            if (list.isEmpty()) {
                List lazyStringArrayList = list instanceof LazyStringList ? new LazyStringArrayList(i) : ((list instanceof PrimitiveNonBoxingCollection) && (list instanceof Internal.ProtobufList)) ? ((Internal.ProtobufList) list).mutableCopyWithCapacity(i) : new ArrayList(i);
                UnsafeUtil.m8677p(obj, j, lazyStringArrayList);
                return lazyStringArrayList;
            }
            if (f24026c.isAssignableFrom(list.getClass())) {
                ArrayList arrayList = new ArrayList(list.size() + i);
                arrayList.addAll(list);
                UnsafeUtil.m8677p(obj, j, arrayList);
                return arrayList;
            }
            if (list instanceof UnmodifiableLazyStringList) {
                LazyStringArrayList lazyStringArrayList2 = new LazyStringArrayList(list.size() + i);
                lazyStringArrayList2.addAll((UnmodifiableLazyStringList) list);
                UnsafeUtil.m8677p(obj, j, lazyStringArrayList2);
                return lazyStringArrayList2;
            }
            if ((list instanceof PrimitiveNonBoxingCollection) && (list instanceof Internal.ProtobufList)) {
                Internal.ProtobufList protobufList = (Internal.ProtobufList) list;
                if (!protobufList.isModifiable()) {
                    Internal.ProtobufList protobufListMutableCopyWithCapacity = protobufList.mutableCopyWithCapacity(list.size() + i);
                    UnsafeUtil.m8677p(obj, j, protobufListMutableCopyWithCapacity);
                    return protobufListMutableCopyWithCapacity;
                }
            }
            return list;
        }

        @Override // androidx.datastore.preferences.protobuf.ListFieldSchema
        /* JADX INFO: renamed from: a */
        public final void mo8528a(Object obj, long j) {
            Object objUnmodifiableList;
            List list = (List) UnsafeUtil.f24155d.m8696m(obj, j);
            if (list instanceof LazyStringList) {
                objUnmodifiableList = ((LazyStringList) list).getUnmodifiableView();
            } else {
                if (f24026c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof PrimitiveNonBoxingCollection) && (list instanceof Internal.ProtobufList)) {
                    Internal.ProtobufList protobufList = (Internal.ProtobufList) list;
                    if (protobufList.isModifiable()) {
                        protobufList.makeImmutable();
                        return;
                    }
                    return;
                }
                objUnmodifiableList = Collections.unmodifiableList(list);
            }
            UnsafeUtil.m8677p(obj, j, objUnmodifiableList);
        }

        @Override // androidx.datastore.preferences.protobuf.ListFieldSchema
        /* JADX INFO: renamed from: b */
        public final void mo8529b(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2, long j) {
            List list = (List) UnsafeUtil.f24155d.m8696m(generatedMessageLite2, j);
            List listM8531d = m8531d(generatedMessageLite, j, list.size());
            int size = listM8531d.size();
            int size2 = list.size();
            if (size > 0 && size2 > 0) {
                listM8531d.addAll(list);
            }
            if (size > 0) {
                list = listM8531d;
            }
            UnsafeUtil.m8677p(generatedMessageLite, j, list);
        }

        @Override // androidx.datastore.preferences.protobuf.ListFieldSchema
        /* JADX INFO: renamed from: c */
        public final List mo8530c(Object obj, long j) {
            return m8531d(obj, j, 10);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ListFieldSchemaLite extends ListFieldSchema {
        @Override // androidx.datastore.preferences.protobuf.ListFieldSchema
        /* JADX INFO: renamed from: a */
        public final void mo8528a(Object obj, long j) {
            ((Internal.ProtobufList) UnsafeUtil.f24155d.m8696m(obj, j)).makeImmutable();
        }

        @Override // androidx.datastore.preferences.protobuf.ListFieldSchema
        /* JADX INFO: renamed from: b */
        public final void mo8529b(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2, long j) {
            UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.f24155d;
            Internal.ProtobufList protobufListMutableCopyWithCapacity = (Internal.ProtobufList) memoryAccessor.m8696m(generatedMessageLite, j);
            Internal.ProtobufList protobufList = (Internal.ProtobufList) memoryAccessor.m8696m(generatedMessageLite2, j);
            int size = protobufListMutableCopyWithCapacity.size();
            int size2 = protobufList.size();
            if (size > 0 && size2 > 0) {
                if (!protobufListMutableCopyWithCapacity.isModifiable()) {
                    protobufListMutableCopyWithCapacity = protobufListMutableCopyWithCapacity.mutableCopyWithCapacity(size2 + size);
                }
                protobufListMutableCopyWithCapacity.addAll(protobufList);
            }
            if (size > 0) {
                protobufList = protobufListMutableCopyWithCapacity;
            }
            UnsafeUtil.m8677p(generatedMessageLite, j, protobufList);
        }

        @Override // androidx.datastore.preferences.protobuf.ListFieldSchema
        /* JADX INFO: renamed from: c */
        public final List mo8530c(Object obj, long j) {
            Internal.ProtobufList protobufList = (Internal.ProtobufList) UnsafeUtil.f24155d.m8696m(obj, j);
            if (protobufList.isModifiable()) {
                return protobufList;
            }
            int size = protobufList.size();
            Internal.ProtobufList protobufListMutableCopyWithCapacity = protobufList.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
            UnsafeUtil.m8677p(obj, j, protobufListMutableCopyWithCapacity);
            return protobufListMutableCopyWithCapacity;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo8528a(Object obj, long j);

    /* JADX INFO: renamed from: b */
    public abstract void mo8529b(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2, long j);

    /* JADX INFO: renamed from: c */
    public abstract List mo8530c(Object obj, long j);
}
