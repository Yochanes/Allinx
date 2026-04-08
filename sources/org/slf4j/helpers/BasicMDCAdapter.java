package org.slf4j.helpers;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.slf4j.spi.MDCAdapter;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class BasicMDCAdapter implements MDCAdapter {
    private InheritableThreadLocal<Map<String, String>> inheritableThreadLocal = new C64151();

    /* JADX INFO: renamed from: org.slf4j.helpers.BasicMDCAdapter$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C64151 extends InheritableThreadLocal<Map<String, String>> {
        public C64151() {
        }

        @Override // java.lang.InheritableThreadLocal
        public /* bridge */ /* synthetic */ Map<String, String> childValue(Map<String, String> map) {
            return childValue2(map);
        }

        /* JADX INFO: renamed from: childValue, reason: avoid collision after fix types in other method */
        public Map<String, String> childValue2(Map<String, String> map) {
            if (map == null) {
                return null;
            }
            return new HashMap(map);
        }
    }

    @Override // org.slf4j.spi.MDCAdapter
    public void clear() {
        Map<String, String> map = this.inheritableThreadLocal.get();
        if (map != null) {
            map.clear();
            this.inheritableThreadLocal.remove();
        }
    }

    @Override // org.slf4j.spi.MDCAdapter
    public String get(String str) {
        Map<String, String> map = this.inheritableThreadLocal.get();
        if (map == null || str == null) {
            return null;
        }
        return map.get(str);
    }

    @Override // org.slf4j.spi.MDCAdapter
    public Map<String, String> getCopyOfContextMap() {
        Map<String, String> map = this.inheritableThreadLocal.get();
        if (map != null) {
            return new HashMap(map);
        }
        return null;
    }

    public Set<String> getKeys() {
        Map<String, String> map = this.inheritableThreadLocal.get();
        if (map != null) {
            return map.keySet();
        }
        return null;
    }

    @Override // org.slf4j.spi.MDCAdapter
    public void put(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("key cannot be null");
        }
        Map<String, String> map = this.inheritableThreadLocal.get();
        if (map == null) {
            map = new HashMap<>();
            this.inheritableThreadLocal.set(map);
        }
        map.put(str, str2);
    }

    @Override // org.slf4j.spi.MDCAdapter
    public void remove(String str) {
        Map<String, String> map = this.inheritableThreadLocal.get();
        if (map != null) {
            map.remove(str);
        }
    }

    @Override // org.slf4j.spi.MDCAdapter
    public void setContextMap(Map<String, String> map) {
        this.inheritableThreadLocal.set(new HashMap(map));
    }
}
