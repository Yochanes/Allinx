package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface TypeProjection extends TypeArgumentMarker {
    /* JADX INFO: renamed from: a */
    Variance mo20158a();

    /* JADX INFO: renamed from: b */
    TypeProjection mo20159b(KotlinTypeRefiner kotlinTypeRefiner);

    /* JADX INFO: renamed from: c */
    boolean mo20160c();

    KotlinType getType();
}
