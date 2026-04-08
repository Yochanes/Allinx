package kotlinx.serialization.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001\u0082\u0001\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, m18302d2 = {"Lkotlinx/serialization/internal/ListLikeDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/internal/ArrayClassDesc;", "Lkotlinx/serialization/internal/ArrayListClassDesc;", "Lkotlinx/serialization/internal/HashSetClassDesc;", "Lkotlinx/serialization/internal/LinkedHashSetClassDesc;", "Lkotlinx/serialization/internal/PrimitiveArrayDescriptor;", "kotlinx-serialization-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@ExperimentalSerializationApi
@SourceDebugExtension
public abstract class ListLikeDescriptor implements SerialDescriptor {

    /* JADX INFO: renamed from: a */
    public final SerialDescriptor f56710a;

    public ListLikeDescriptor(SerialDescriptor serialDescriptor) {
        this.f56710a = serialDescriptor;
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
        Integer numM20428Z = StringsKt.m20428Z(name);
        if (numM20428Z != null) {
            return numM20428Z.intValue();
        }
        throw new IllegalArgumentException(name.concat(" is not a valid list index"));
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: e */
    public final int mo20942e() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListLikeDescriptor)) {
            return false;
        }
        ListLikeDescriptor listLikeDescriptor = (ListLikeDescriptor) obj;
        return Intrinsics.m18594b(this.f56710a, listLikeDescriptor.f56710a) && Intrinsics.m18594b(getF56749a(), listLikeDescriptor.getF56749a());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: f */
    public final String mo20943f(int i) {
        return String.valueOf(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: g */
    public final List mo20944g(int i) {
        if (i >= 0) {
            return EmptyList.f51496a;
        }
        StringBuilder sbM20q = AbstractC0000a.m20q(i, "Illegal index ", ", ");
        sbM20q.append(getF56749a());
        sbM20q.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbM20q.toString().toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return EmptyList.f51496a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialKind getKind() {
        return StructureKind.LIST.f56643a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: h */
    public final SerialDescriptor mo20945h(int i) {
        if (i >= 0) {
            return this.f56710a;
        }
        StringBuilder sbM20q = AbstractC0000a.m20q(i, "Illegal index ", ", ");
        sbM20q.append(getF56749a());
        sbM20q.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbM20q.toString().toString());
    }

    public final int hashCode() {
        return getF56749a().hashCode() + (this.f56710a.hashCode() * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: i */
    public final boolean mo20946i(int i) {
        if (i >= 0) {
            return false;
        }
        StringBuilder sbM20q = AbstractC0000a.m20q(i, "Illegal index ", ", ");
        sbM20q.append(getF56749a());
        sbM20q.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbM20q.toString().toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return getF56749a() + '(' + this.f56710a + ')';
    }
}
