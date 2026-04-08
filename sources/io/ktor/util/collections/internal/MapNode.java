package io.ktor.util.collections.internal;

import androidx.compose.animation.AbstractC0455a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.markers.KMutableMap;
import kotlin.reflect.KProperty;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, m18302d2 = {"Lio/ktor/util/collections/internal/MapNode;", "Key", "Value", "", "ktor-utils"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class MapNode<Key, Value> implements Map.Entry<Key, Value>, KMutableMap.Entry {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ KProperty[] f46567d;

    /* JADX INFO: renamed from: a */
    public final MapNode$$special$$inlined$shared$1 f46568a;

    /* JADX INFO: renamed from: b */
    public final MapNode$$special$$inlined$shared$2 f46569b;

    /* JADX INFO: renamed from: c */
    public final Object f46570c;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(MapNode.class, "backReference", "getBackReference$ktor_utils()Lio/ktor/util/collections/internal/ForwardListNode;", 0);
        ReflectionFactory reflectionFactory = Reflection.f51660a;
        f46567d = new KProperty[]{reflectionFactory.mo18615e(mutablePropertyReference1Impl), AbstractC0455a.m2247v(MapNode.class, "value", "getValue()Ljava/lang/Object;", 0, reflectionFactory)};
    }

    public MapNode(Object obj, Object obj2) {
        this.f46570c = obj;
        MapNode$$special$$inlined$shared$1 mapNode$$special$$inlined$shared$1 = new MapNode$$special$$inlined$shared$1();
        mapNode$$special$$inlined$shared$1.f46571a = null;
        this.f46568a = mapNode$$special$$inlined$shared$1;
        this.f46569b = new MapNode$$special$$inlined$shared$2(obj2);
        obj.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f46570c;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f46569b.getValue(this, f46567d[1]);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object value = getValue();
        this.f46569b.setValue(this, f46567d[1], obj);
        return value;
    }

    public final String toString() {
        return "MapItem[" + this.f46570c + ", " + getValue() + ']';
    }
}
