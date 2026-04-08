package kotlin.collections;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.markers.KMutableMap;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SinceKotlin
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\b'\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¨\u0006\u0005"}, m18302d2 = {"Lkotlin/collections/AbstractMutableMap;", "K", "V", "", "Ljava/util/AbstractMap;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public abstract class AbstractMutableMap<K, V> extends java.util.AbstractMap<K, V> implements Map<K, V>, KMutableMap {
    /* JADX INFO: renamed from: c */
    public abstract Set mo4653c();

    /* JADX INFO: renamed from: e */
    public /* bridge */ Set mo4654e() {
        return super.keySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set entrySet() {
        return mo4653c();
    }

    /* JADX INFO: renamed from: f */
    public /* bridge */ int mo4655f() {
        return super.size();
    }

    /* JADX INFO: renamed from: g */
    public /* bridge */ Collection mo4656g() {
        return super.values();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set keySet() {
        return mo4654e();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return mo4655f();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection values() {
        return mo4656g();
    }
}
